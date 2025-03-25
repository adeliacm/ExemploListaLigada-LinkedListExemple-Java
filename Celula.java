package teste;

/**
 * Classe que representa uma célula (container) onde teremos o objeto (valor) e uma celula
 * que será a ligação para o proximo.
 * 
 */
public class Celula {
	private Object elemento;
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return this.elemento;
	}

}
