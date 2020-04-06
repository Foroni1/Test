package esercizio2;

import net.finmath.functions.NormalDistribution;

public class NormalRandomVariable {
	private double time;
    private double mu;
    private double sigma;
    private int numerosit‡Campionaria;
    
	public NormalRandomVariable(double mu, double sigma, int numerosit‡Campionaria) {
		this.mu=mu;
		this.sigma=sigma;
		this.numerosit‡Campionaria = numerosit‡Campionaria;
		
	}
	
	public NormalRandomVariable(double mu, double sigma, int numerosit‡Campionaria, double time) {
		this.mu=mu;
		this.sigma=sigma;
		this.numerosit‡Campionaria = numerosit‡Campionaria;
		this.time = time;
		
	}
	
	public double[] getSample() {
		double[] sample = new double[numerosit‡Campionaria];
		
		for (int i = 0; i < sample.length; i++) {
			sample[i] = NormalDistribution.inverseCumulativeDistribution(Math.random())*sigma + mu;
		}
		
		return sample;
	}
}
