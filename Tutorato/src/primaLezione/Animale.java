package primaLezione;


public class Animale {
	
	//campi
    private int peso;
    private Color colore;
    
    
    //costruttore di default
    public Animale() {
    }
    
    //costruttore
    public Animale(int peso, Color colore) {
    	this.peso=peso;
    	this.colore=colore;
    }
    
    
    //get e set
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Color getColore() {
		return colore;
	}
	public void setColore(Color colore) {
		this.colore = colore;
	}
    
	
    //altri metodi
	public String verso() {
		return "verso di un animale";
	}
}
