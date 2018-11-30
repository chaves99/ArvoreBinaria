package trabalho.app.util;

import java.util.Scanner;

public class CapturarInput{

	private Scanner scan;

	private static CapturarInput instance;

	private CapturarInput(){
		this.scan = new Scanner(System.in);
	}

	public static CapturarInput getInstance(){
		if(instance == null){
			instance = new CapturarInput();
		}
		return instance;
	}

	public int getInt(){
		int opcao = 0;
		try{
			opcao = scan.nextInt();
		}catch(Exception e){
			opcao = -1;
		}
		return opcao;
	}

}