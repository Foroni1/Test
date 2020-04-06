package misureDiRischio;

import net.finmath.stochastic.RandomVariable;

public class ExpectedShortfall implements RiskMeasure {
	
	//campo
	private double confidenceLevel;
	
	//costruttore
	public ExpectedShortfall(double confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}
	
	//metodi getters e setters
	public double getConfidenceLevel() {
		return confidenceLevel;
	}

	public void setConfidenceLevel(double confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}
	
	
	
	@Override
	public double computeRiskMeasure(RandomVariable portfolioLoss) {
		
		double expectedShortfall = portfolioLoss.getQuantileExpectation(this.confidenceLevel, 1);
		return expectedShortfall;
	}

	@Override
	public boolean isTraslationInvariant() {
		return true;
	}

	@Override
	public boolean isSubadditive() {
		return true;
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
		return true;
	}

	

}
