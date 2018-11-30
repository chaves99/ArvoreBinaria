package trabalho.app.tarefa;

import trabalho.app.arvore.Arvore;

public class Altura implements Tarefa {

	public void executar(Arvore arvore){
		int altura = arvore.altura();
		System.out.println("A altura da arvore é: "+ altura);
	}

	public boolean voltaMenu(){
		return true;
	}

}