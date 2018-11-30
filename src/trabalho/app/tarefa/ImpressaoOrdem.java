package trabalho.app.tarefa;

import trabalho.app.arvore.Arvore;

public class ImpressaoOrdem implements Tarefa {

	public void executar(Arvore arvore){
		arvore.caminhar();
	}

	public boolean voltaMenu(){
		return true;
	}

}