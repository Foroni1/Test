package base;


public class ExponentialFunction implements UnivariateFunction {
// l'istanza della classe sar� a^x
	
	private double a;    
    
    public ExponentialFunction(double a) {
    	this.a = a;
    }
    
	@Override
	public double evaluateFunction(double x) {
		
		return Math.pow(a,x);
	}

}
