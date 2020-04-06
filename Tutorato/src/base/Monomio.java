package base;


public class Monomio implements UnivariateFunction {
// l'istanza della classe sarà un monomio del tipo x^n, x>=0
	
	private double n;    
    
    public Monomio(double n) {
    	this.n = n;
    }
    
	@Override
	public double evaluateFunction(double x) {
		
		return Math.pow(x,n);
	}

	
	
	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}
	
	

}
