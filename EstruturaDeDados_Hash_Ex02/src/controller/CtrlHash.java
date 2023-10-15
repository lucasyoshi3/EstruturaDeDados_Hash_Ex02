package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CtrlHash {
	private static Scanner sc=new Scanner(System.in);
	
	public static int qntDeLetras(String str) {
		str.toCharArray();
		return str.length();
	}
	
	public static void inserirNome(HashMap<Integer, String> tabela,int vezesInserir) {
		String nome;
		int i,id;
		System.out.println("Inserir nome:");
		for(i=1;i<=vezesInserir;i++) {
			nome=sc.next();
			id=qntDeLetras(nome);
			if(!tabela.containsKey(id)) {
				tabela.put(id,nome);
			}else {
				while(tabela.containsKey(id)) {
					id++;
				}
				tabela.put(id, nome);
			}
		}
	}
	
	public void inserirNovoNome(HashMap<Integer, String> tabela) {
		// TODO Auto-generated method stub
		String opcao="s";
		while(opcao.equals("s")|opcao.equals("S")) {
			inserirNome(tabela, 1);
			System.out.println("Deseja inserir outro nome? S/N");
			opcao=sc.next();
		}
	}

	public String pesquisarNome(HashMap<Integer, String> tabela) {
		// TODO Auto-generated method stub
		System.out.println("Nome para pesquisar: ");
		String nome=sc.next();
		if(tabela.containsValue(nome)) {
			return "Valor existente na estrutura";
		}else {
			return "Valor inexistente na estrutura";
		}
		
	}

	public void remover(HashMap<Integer, String> tabela) {
		// TODO Auto-generated method stub
		System.out.println("Nome que deseja remover:");
		String nome=sc.next();
		if(tabela.containsValue(nome)) {
			int chave=qntDeLetras(nome);
			String valorAssociado=tabela.get(chave);
			while(!valorAssociado.equals(nome)) {
				chave++;
				valorAssociado=tabela.get(chave);
			}
			tabela.remove(chave);
		}else {
			System.out.println("Nao existe esse nome no hash");
		}
	}

	public String verificarCheia(HashMap<Integer, String> tabela, int tamanhoOriginal) {
		// TODO Auto-generated method stub
		int tamanhoTabela=tabela.size();
		if(tamanhoTabela >= tamanhoOriginal) return "A matriz esta cheia";
		else return "A matriz nao esta cheia";
	}

	public void imprimir(HashMap<Integer, String> tabela) {
		// TODO Auto-generated method stub
		System.out.println(tabela);
	}
}
