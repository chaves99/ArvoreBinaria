package trabalho.app.tarefa;

import trabalho.app.arvore.Arvore;
import trabalho.app.util.CapturarInput;

public class BuscaBinaria implements Tarefa {

	public void executar(Arvore arvore){
		System.out.print("Digite o número que deseja buscar: ");
		int numero = CapturarInput.getInstance().getInt();
		int valor = arvore.buscarValor(numero);
		if(valor == -1){
			System.out.println("Valor "+ numero +" não encontrado!");
		} else {
			System.out.println("Valor "+ valor +" encontrado");
		}
	}

	public boolean voltaMenu(){
		return true;
	}
}