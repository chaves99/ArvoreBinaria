package trabalho.app.arvore;

public interface Arvore {

	public void inserir(int v);
	
	public void caminhar();

	public boolean remover(int v);

	public int buscarValor(int chave);

	public int altura();
}