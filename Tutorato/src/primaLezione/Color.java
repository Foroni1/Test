package primaLezione;


public class Color {
	//campi
    private String colore;
    private int intensità;

    //costruttore di default
    public Color() {
	}
    
    //costruttori
    public Color(String colore) {
		this.colore = colore;
	}
    
    public Color(int intensità) {
		this.intensità=intensità;
	}
    
    public Color(String colore, int intensità) {
		this.colore = colore;
		this.intensità=intensità;
	}

	
    
    
    //get e set
    public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getIntensità() {
		return intensità;
	}

	public void setIntensità(int intensità) {
		this.intensità = intensità;
	}

	
	
	
	//toString
	@Override
	public String toString() {
		return "[colore=" + colore + ", intensità=" + intensità + "]";
	}
    
}
