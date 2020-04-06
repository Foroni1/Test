package base;


public class MontecarloIntegrator {
//l'integrale definito col metodo di MonteCarlo
	
	private int M;
	private UnivariateFunction f;
	private double a;
	private double b;

	//costruttore
	public MontecarloIntegrator(UnivariateFunction f, double a, double b, int M) {
		this.f=f;
		this.a=a;
		this.b=b;
		this.M=M;
	}
	
	//getters e setters
	public int getM() {
		return M;
	}
	public void setM(int m) {
		M = m;
	}
	public UnivariateFunction getF() {
		return f;
	}
	public void setF(UnivariateFunction f) {
		this.f = f;
	}
	
	
	//altri metodi
	private double[] rand;   //sono "campi ausiliari" che aiutano i metodi sotto a non ripetere conti
	private double[] value;
	private double valoreAtteso;
	boolean bool = false;
	
	private void conti() {
		rand  = new double[M];
		value = new double[M];
		double sum = 0;
		for(int i = 0; i < M; i++){
			//riportiamo nell'uniforme in [a,b] i valori estratti tra 0 e 1
			rand[i] = Math.random()*(b-a) + a;
			value[i] = f.evaluateFunction(rand[i]) * (b-a);
			sum += value[i];
		}
		valoreAtteso = sum / M ;
		
		bool=true;
	}
	
	private boolean checkConti() {
		return bool;
	}
	
	
	public double doIntegration() {
		if (this.checkConti() == false) {
			this.conti();
		}
		
		return valoreAtteso;
	}
	
	public double getVarianzaCampionaria(){
		//vedi Proposizione1.3 e Teorema1.2 (e Corollario1.1)
		if (this.checkConti() == false) {
			this.conti();
		}
		
		double varianzaCampionariaMontecarlo = 0;
		for(int i = 0; i < M; i++){
			varianzaCampionariaMontecarlo += (value[i] - valoreAtteso)*(value[i] - valoreAtteso);
		}
		varianzaCampionariaMontecarlo = varianzaCampionariaMontecarlo/(M-1)/M;
		
		return varianzaCampionariaMontecarlo;
	}
	
	public double getDeviazioneStandard() {
		double devStd = Math.sqrt(this.getVarianzaCampionaria());
				
		return devStd;
	}
	
	public double getErroreAssoluto(double integraleEsatto) {
		if (this.checkConti() == false) {  
			this.conti();
		}
		
		return Math.abs(valoreAtteso - integraleEsatto);
	}
	
	public double[] getIntervalloDiConfidenza(double alpha) {
		//vedi Corollario1.3
		if (this.checkConti() == false) {
			this.conti();
		}
		
		double lowerBound = valoreAtteso - this.getDeviazioneStandard()/Math.sqrt(1 - alpha);
		double upperBound = valoreAtteso + this.getDeviazioneStandard()/Math.sqrt(1 - alpha);
		
		double[] intervallo = {lowerBound,upperBound};
		return intervallo;
	}
	
}
