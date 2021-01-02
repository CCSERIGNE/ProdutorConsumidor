package exemploProdutorConsumidor;

public class Impressao {
	private int ID;
	private int tempo;
	public int getID() {
		return ID;
	}

	public int getTempo() {
		return tempo;
	}

	public String getOrigem() {
		return origem;
	}

	private String origem;
	
	public Impressao(int ID, int tempo, String origem){
		this.ID 	= ID;
		this.tempo 	= tempo;
		this.origem	= origem;
	}
}
