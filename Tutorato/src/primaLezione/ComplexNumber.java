package primaLezione;


public class ComplexNumber {
	
	//I CAMPI / ATTRIBUTI
    private double real;
    private double imaginary;
       
    
    
    //COSTRUTTORE
    public ComplexNumber(double real, double imaginary) {
    	this.real = real;
    	this.imaginary = imaginary;
    }
    
    
    
    //I METODI GET E SET
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	
	//METODO TOSTRING
	@Override
	public String toString() {
		return "complexNumber (" + real + ") + i(" + imaginary + ")" ;
	}
       
	
	public double strange(){
		return 1.1;
	}
	
	




	//ALTRI METODI
	public ComplexNumber sumComplexNumber(ComplexNumber b) {
		ComplexNumber ccc = new ComplexNumber(this.real + b.real, this.imaginary + b.imaginary);
    	return ccc;
    }
	
	public ComplexNumber differenceComplexNumber(ComplexNumber b) {
		ComplexNumber c = new ComplexNumber(this.real - b.real, this.imaginary - b.imaginary);
    	return c;
    }
	
	
	private double normComplexNumber() {
		double c = this.real*this.real +  this.imaginary*this.imaginary ;
    	return c;
    }
	
	public ComplexNumber divisionComplexNumber(ComplexNumber b) {
		ComplexNumber c = new ComplexNumber((this.real * b.real + this.imaginary * b.imaginary)/(b.normComplexNumber()),
				                             (this.imaginary*b.real - b.imaginary*this.real)/(b.normComplexNumber()));
    	return c;
    }
       
}
