package controller;

import java.util.Scanner;
import model.Hash;

public class CtrlHash {
	private static Scanner sc=new Scanner(System.in);
	int tamanho=50;
	Hash[] tabela=new Hash[tamanho];
	
	public CtrlHash() {
		for(int i=0;i<tamanho;tamanho++) {
			tabela[i]=new Hash();
		}
	}
	
	public void inserirValor(String nome) {
		char primeiraLetraNome=nome.charAt(0);
		char primeiraLetraTabela;
		int index = 0;
		for(int i=0;i<tamanho;i++) {
			primeiraLetraTabela=tabela[i].nome.charAt(0);
			if(String.valueOf(primeiraLetraNome).equals(String.valueOf(primeiraLetraTabela))) {
				index=i;
				break;
			}
		}
		if(index==0 && tabela[index].chave.equals("")) {
			tabela[index].nome=nome;
			tabela[index].chave=String.valueOf(primeiraLetraNome);
			return;
		}
		
		if(index==0 && (!tabela[index].chave.equals(""))) {
			for(int i=0;i<tamanho;i++) {
				if(tabela[i].chave.equals("")) {
					tabela[i].nome=nome;
					tabela[i].chave=String.valueOf(nome.charAt(0));
					return;
				}
			}
		}
		
		if(index!=0) {
			while (tabela[index].proxPosicao!=-1) {
				index=tabela[index].proxPosicao;
			}
			
			
			for(int i=index;i<tamanho;i++) {
				if(tabela[i].chave.equals("")) {
					tabela[i].nome=nome;
					tabela[i].chave=String.valueOf(primeiraLetraNome);
					tabela[index].proxPosicao=i;
				}
			}
		}
	}

	public void imprimir() {
		// TODO Auto-generated method stub
		for(Hash nome:tabela) {
			
		}
	}
}
