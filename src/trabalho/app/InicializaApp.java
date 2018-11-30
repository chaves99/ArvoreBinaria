package trabalho.app;

import java.util.Scanner;
import trabalho.app.enuns.EnumOpcaoMenu;
import trabalho.app.tarefa.TarefaFactory;
import trabalho.app.tarefa.Tarefa;
import trabalho.app.arvore.Arvore;
import trabalho.app.arvore.ArvoreBinaria;
import trabalho.app.util.CapturarInput;

public final class InicializaApp{

	private Arvore arvore;

	public InicializaApp(){
		arvore = new ArvoreBinaria();
	}

	public void init(){
		this.trataOpcao();
	}

	private void mostrarMenu(){
		for(EnumOpcaoMenu opcao : EnumOpcaoMenu.values()){
			System.out.println("("+opcao.getCodigo()+") "+opcao.getDescricao());
		}
		System.out.print("Digite o número da opcão:");
	}

	private void trataOpcao(){
		int opcao;
		boolean continua = true;
		while(continua){
			this.mostrarMenu();
			opcao = this.capturarInput();
			if(!this.opcaoValida(opcao)){
				System.exit(1);
			}
			Tarefa tarefa = TarefaFactory.getTarefa(opcao);
			System.out.println();
			tarefa.executar(this.arvore);
			if(!tarefa.voltaMenu()){
				continua = false;
			}
			System.out.println();
		}
	}

	private boolean opcaoValida(int opcao){
		EnumOpcaoMenu opcaoEnum = EnumOpcaoMenu.get(opcao);
		if(opcaoEnum != null){
			return true;
		}
		System.out.println("Opção inválida!");
		return false;
	}

	private int capturarInput(){
		return CapturarInput.getInstance().getInt();
	}

}