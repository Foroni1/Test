package primaLezione;


public class Scimmia extends Animale {
	
    //campi nuovi rispetto ad Animale
	private String nome;
	
	
	//costruttore di default
	public Scimmia() {
		super();
	}
	
	//costruttori
	public Scimmia(int peso, Color colore) {
		super(peso, colore);
	}
	
	public Scimmia(int peso, Color colore, String nome) {
		super(peso, colore);
		this.nome=nome;
	}
    
	
	//get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
	
	//posso creare metodi nuovi per Scimmia oppure personalizzare alcuni dei metodi già presenti in Animale
	public String verso() {
		return "huhuhuhahahah";
	}
	
	

	public String lancio() {
		return "la scimmia " + this.nome + " ha lanciato un oggetto";
	}
	
}
