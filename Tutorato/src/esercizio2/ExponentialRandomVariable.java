package esercizio2;

public class ExponentialRandomVariable {
    private double time;
    private double lambda;
    private int numerositąCampionaria;
    
	public ExponentialRandomVariable(double lambda, int numerositąCampionaria) {
		this.lambda = lambda;
		this.numerositąCampionaria = numerositąCampionaria;
		
	}
	
	public ExponentialRandomVariable(double lambda, int numerositąCampionaria, double time) {
		this.lambda = lambda;
		this.numerositąCampionaria = numerositąCampionaria;
		this.time = time;
		
	}
	
	public double[] getSample() {
		double[] sample = new double[numerositąCampionaria];
		ExponentialICDF expInversa = new ExponentialICDF(lambda);
		for (int i = 0; i < sample.length; i++) {
			sample[i] = expInversa.evaluateFunction(Math.random());
		}
		
		return sample;
	}
}
