package controller;

public class Competidor {
	private int id;
	private String jogadas;	
	
	public Competidor() {}
	
	public Competidor (int id, String jogadas){
		this.id = id;
		this.jogadas = jogadas;
	}
	
	public int getid() {
		return id;	
	}
	public String getjogadas() {
		return jogadas;
	}
	
	
	public void setid(int id) {
		this.id = id;
	}
	public void setjogadas(String jogadas) {
		this.jogadas = jogadas;
	}
	
}
