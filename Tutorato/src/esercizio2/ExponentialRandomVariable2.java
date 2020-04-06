package esercizio2;
import net.finmath.montecarlo.RandomVariableFromDoubleArray;
import net.finmath.stochastic.RandomVariable;


public class ExponentialRandomVariable2 extends RandomVariableFromDoubleArray{
	
	public ExponentialRandomVariable2(double value) {
		super(value);
		
	}
	public ExponentialRandomVariable2(double time, double value) {
		super(time, value);
		
	}
	public ExponentialRandomVariable2(double time, double[] realisations) {
		super(time, realisations);
	}
    
	
	
	
	

	
	
	
}
