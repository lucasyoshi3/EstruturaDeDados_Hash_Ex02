package view;
import java.util.HashMap;
import java.util.Scanner;

import controller.CtrlHash;


public class Main {
	public static void main(String[] args) {
		CtrlHash controle=new CtrlHash();
		
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> tabela=new HashMap<Integer, String>();
		int i=5;
		
		CtrlHash.inserirNome(tabela, i);
		
		int opcao=1;
	    while(opcao>0 && opcao<6) {
	    	System.out.println("Selecione:\r\n"
	    			+ "1)inserir um novo nome na estrutura de dados\r\n"
		    		+ "2)pesquisar se um determinado nome consta na estrutura de dados\r\n"
		    		+ "3)remover um dado nome da estrutura de dados\r\n"
		    		+ "4)verificar se a estrutura de dados está cheia\r\n"
		    		+ "5)imprimir todos os dados da estrutura de dados\r\n"
		    		+ "qualquer numero)Fim");
		    opcao=sc.nextInt();
		    switch (opcao) {
			case 1:
				 controle.inserirNovoNome(tabela); break;
			case 2:
				System.out.println(controle.pesquisarNome(tabela)); break;
			case 3:
				controle.remover(tabela); break;
			case 4:
				System.out.println(controle.verificarCheia(tabela,5)); break;
			case 5:
				controle.imprimir(tabela); break;
			default:
				break;
			}
	    }
	}
}
