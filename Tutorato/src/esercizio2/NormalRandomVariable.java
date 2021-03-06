package esercizio2;

import net.finmath.functions.NormalDistribution;

public class NormalRandomVariable {
	private double time;
    private double mu;
    private double sigma;
    private int numerositąCampionaria;
    
	public NormalRandomVariable(double mu, double sigma, int numerositąCampionaria) {
		this.mu=mu;
		this.sigma=sigma;
		this.numerositąCampionaria = numerositąCampionaria;
		
	}
	
	public NormalRandomVariable(double mu, double sigma, int numerositąCampionaria, double time) {
		this.mu=mu;
		this.sigma=sigma;
		this.numerositąCampionaria = numerositąCampionaria;
		this.time = time;
		
	}
	
	public double[] getSample() {
		double[] sample = new double[numerositąCampionaria];
		
		for (int i = 0; i < sample.length; i++) {
			sample[i] = NormalDistribution.inverseCumulativeDistribution(Math.random())*sigma + mu;
		}
		
		return sample;
	}
}
