package trabalho.app.tarefa;

import trabalho.app.util.CapturarInput;
import trabalho.app.arvore.Arvore;

public class InsercaoNumeroInteiro implements Tarefa{

	@Override
	public void executar(Arvore arvore){
		System.out.print("Digite o número a ser inserido:");
		int numero = CapturarInput.getInstance().getInt();
		arvore.inserir(numero);
	}

	@Override
	public boolean voltaMenu(){
		return true;
	}

}