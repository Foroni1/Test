package misureDiRischio;

import net.finmath.stochastic.RandomVariable;

public class ValueAtRisk implements RiskMeasure {

	//campo
	private double confidenceLevel;
	
	//costruttore
	public ValueAtRisk(double confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}
	
	//getters e setters
	public double getConfidenceLevel() {
		return confidenceLevel;
	}

	public void setConfidenceLevel(double confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}

	
	@Override
	public double computeRiskMeasure(RandomVariable portfolioLoss) {
		
		double valueAtRisk = portfolioLoss.getQuantile(confidenceLevel);	
		return valueAtRisk;
	}
	
	
	//assiomi della coerenza
	@Override
	public boolean isTraslationInvariant() {
		return true;
	}
	
	@Override
	public boolean isSubadditive() {
		return false;
	}
	
	@Override
	public boolean isHomogeneouslyPositive() {
		return true;
	}
	
	@Override
	public boolean isMonotone() {
		return true;
	}
	
	@Override
	public boolean isCoherent() {
		return false;
	}
	

}
