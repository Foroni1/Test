package esercizio2;

public class ExponentialICDF {

	private double lambda;    
	
    public ExponentialICDF(double lambda) {
    	this.lambda = lambda;
    }
    
	public double evaluateFunction(double u) {
		
		return -Math.log(1-u)/lambda;
	}
}
