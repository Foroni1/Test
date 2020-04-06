package base;


public class Parabola implements UnivariateFunction {

	private double a;                 
    private double b;
    private double c;
    
    public Parabola(double a, double b, double c) {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    }
    
    
    @Override
    public double evaluateFunction(double x) {
    	return a*x*x+b*x+c;
    }

}
