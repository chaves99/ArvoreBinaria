package trabalho.app.tarefa;

import trabalho.app.util.CapturarInput;
import trabalho.app.arvore.Arvore;

public class RemoverNumero implements Tarefa {

	public void executar(Arvore arvore){
		System.out.println("Digite o numero que sera removido:");
		int numero = CapturarInput.getInstance().getInt();
		if(arvore.remover(numero)){
			System.out.println("Sucesso ao remover");
			return;
		}
		System.out.println("Falha ao remover");
	}

	public boolean voltaMenu(){
		return true;
	}

}