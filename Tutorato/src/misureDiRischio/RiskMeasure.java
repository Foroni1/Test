package misureDiRischio;

import net.finmath.stochastic.RandomVariable;

public interface RiskMeasure {
	
	double computeRiskMeasure(RandomVariable portfolioLoss);
	boolean isTraslationInvariant();
	boolean isSubadditive();
	boolean isHomogeneouslyPositive();
	boolean isMonotone();
	boolean isCoherent();
}
