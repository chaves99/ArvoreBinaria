package trabalho.app.enuns;

import trabalho.app.tarefa.*;

public enum EnumOpcaoMenu{

	INSERCAO_NUMEROS_INTEIROS(1, "Inserção de números inteiros", InsercaoNumeroInteiro.class),
	REMOCAO_NUMEROS_INTEIROS(2, "Remoção de números", InsercaoNumeroInteiro.class),
	BUSCA_BINARIA(3, "Busca binária", InsercaoNumeroInteiro.class),
	IMPRECAO_OREDEM(4, "Impreção em ordem, preordem e pós ordem", InsercaoNumeroInteiro.class),
	BALANCEAMENTO(5, "Balanceamento", InsercaoNumeroInteiro.class),
	ALTURA(6, "Altura", InsercaoNumeroInteiro.class),
	SAIR(7, "Sair", Sair.class),
	;

	private int codigo;
	private String descricao;
	private Class<? extends Tarefa> classe;

	EnumOpcaoMenu(int codigo, String descricao, Class<? extends Tarefa> classe){
		this.codigo = codigo;
		this.descricao = descricao;
		this.classe = classe;
	}

	public int getCodigo(){
		return this.codigo;
	}

	public String getDescricao(){
		return this.descricao;
	}

	public Class<? extends Tarefa> getClasse(){
		return this.classe;
	}

	public static EnumOpcaoMenu get(int codigo){
		for(EnumOpcaoMenu opcao : EnumOpcaoMenu.values()) {
			if(opcao.getCodigo() == codigo){
				return opcao;
			}
		}
		return null;
	}
}