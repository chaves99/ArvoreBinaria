package trabalho.app.tarefa;

import trabalho.app.arvore.Arvore;

public class Sair implements Tarefa{

	@Override
	public void executar(Arvore arvore){
		System.exit(0);
	}

	@Override
	public boolean voltaMenu(){
		return false;
	}

}