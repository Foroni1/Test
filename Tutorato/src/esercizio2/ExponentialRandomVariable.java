package esercizio2;

public class ExponentialRandomVariable {
    private double time;
    private double lambda;
    private int numerosit‡Campionaria;
    
	public ExponentialRandomVariable(double lambda, int numerosit‡Campionaria) {
		this.lambda = lambda;
		this.numerosit‡Campionaria = numerosit‡Campionaria;
		
	}
	
	public ExponentialRandomVariable(double lambda, int numerosit‡Campionaria, double time) {
		this.lambda = lambda;
		this.numerosit‡Campionaria = numerosit‡Campionaria;
		this.time = time;
		
	}
	
	public double[] getSample() {
		double[] sample = new double[numerosit‡Campionaria];
		ExponentialICDF expInversa = new ExponentialICDF(lambda);
		for (int i = 0; i < sample.length; i++) {
			sample[i] = expInversa.evaluateFunction(Math.random());
		}
		
		return sample;
	}
}
