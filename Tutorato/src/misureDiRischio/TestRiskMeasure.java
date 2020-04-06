package misureDiRischio;

import java.util.Arrays;

import net.finmath.functions.NormalDistribution;
import net.finmath.functions.PoissonDistribution;
import net.finmath.montecarlo.RandomVariableFromDoubleArray;
import net.finmath.stochastic.RandomVariable;

public class TestRiskMeasure {

	public static void main(String[] args) {
		
		int n = 100000;//numerosità campionaria
		
		double[] sample = new double[n];
		//se la perdita è distribuita ad esempio come una normale di media mu e varianza sigma^2
		double mu = 2;
		double sigma = 3;
		for(int i = 0; i< n; i++) {
			sample[i] = NormalDistribution.inverseCumulativeDistribution(Math.random())*sigma + mu;
		}
		
		RandomVariable Loss = new RandomVariableFromDoubleArray(0.0,sample);		
		
		double confidenceLevel = .95;
		ValueAtRisk VaR = new ValueAtRisk(confidenceLevel);
		//il VaR al livello di confidenza del 95% è circa 1.645*3+2=6.935 (vedi esempio 2.1)
		System.out.println(VaR.computeRiskMeasure(Loss));
		
		VaR.setConfidenceLevel(.99);
		//il VaR al livello di confidenza del 99% è circa 2.33*3+2=8.99 (vedi esempio 2.1)
		System.out.println(VaR.computeRiskMeasure(Loss));
		
		
		System.out.println();

		
		ExpectedShortfall ES = new ExpectedShortfall(confidenceLevel);
		//l'ES al livello di confidenza del 95% è circa phi(1.645)*3/(1-0.95)+2=8.188  (vedi esempio 2.4)
		//System.out.println(ES.computeRiskMeasure(Loss));
		
		ES.setConfidenceLevel(.99);
		//l'ES al livello di confidenza del 99% è circa phi(2.33)*3/(1-0.99)+2=9.923  (vedi esempio 2.4)
		//System.out.println(ES.computeRiskMeasure(Loss));
		
		
		System.out.println();
		
		
		//le misure di rischio sono coerenti?
		System.out.println(VaR.isCoherent());
		//System.out.println(ES.isCoherent());
		
		
		
		
		
		
		
		
		/*double[] sample2 = new double[n];
		PoissonDistribution Poi = new PoissonDistribution(5);
		for(int i = 0; i< n; i++) {
			sample2[i] = Poi.inverseCumulativeDistribution(Math.random()) ;
		}
		
		RandomVariable myRv2 = new RandomVariableFromDoubleArray(0.0,sample2);
		
		VaR.setConfidenceLevel(0.95);
		//il quantile al livello di confidenza del 95% 
		System.out.println(VaR.computeRiskMeasure(myRv2));
		
		VaR.setConfidenceLevel(.99);
		//il quantile al livello di confidenza del 99%
		System.out.println(VaR.computeRiskMeasure(myRv2));*/
		
		
	}

}
