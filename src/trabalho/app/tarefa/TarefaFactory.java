package trabalho.app.tarefa;

import trabalho.app.enuns.EnumOpcaoMenu;
import trabalho.app.tarefa.*;

public class TarefaFactory{
	public static Tarefa getTarefa(int opcao){
		EnumOpcaoMenu opcaoMenu = EnumOpcaoMenu.get(opcao);
		Tarefa tarefa = null;
		switch(opcaoMenu){
			case INSERCAO_NUMEROS_INTEIROS:
				tarefa = new InsercaoNumeroInteiro();
				break;
			case REMOCAO_NUMEROS_INTEIROS:
				tarefa = new RemoverNumero();
				break;
			case BUSCA_BINARIA:
				tarefa = new BuscaBinaria();
				break;
			case IMPRECAO_OREDEM:
				tarefa = new ImpressaoOrdem();
				break;
			case BALANCEAMENTO:
				tarefa = new Balanceamento();
				break;
			case ALTURA:
				tarefa = new Altura();
				break;
			case SAIR:
				tarefa = new Sair();
				break;
		}
		return tarefa;
	}
}