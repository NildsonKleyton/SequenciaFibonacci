/*
 * Criar um programa que o usuário deve informar um número e validar 
 * se o mesmo é um número da sequência de Fibonacci, informando o próximo número.
 * 
 * Sequência Fibonacci: 0-1-2-3-5-8-13-21-34...
 * 
 * Sucesso: Informei o Valor 13, vai aparecer o próximo número da Sequência.
 * 
 * Falha: Informei o valor 10, vai aparecer a mensagem que não é um 
 *		  número da sequência de Fibonacci.
 */
package teste;

import java.util.Scanner;

public class TesteFacil {

	public static void main(String[] args) {
		
		int res1, p1 =0, p2=1, proxm = 0, valor;
		int seq[]=new int[20];
		boolean res=true;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sequência Fibonacci com 20 posições");
		// Sequência Fibonacci em um vetor de 20 posições
		for (int i=0; i <20; i++) {
			seq[i]=proxm;
			proxm = p1 + p2;
			p1 = p2;
			p2 = proxm;
		}
		do {
			System.out.println("\nEscolha um valor nteiro de 0 ate "+seq[19]+": ");
			valor = scan.nextInt();  
			for(int i=0; i <20; i++) {
				if(seq[0] == valor) {
					System.out.print("\nDepos de "+valor+" é "+seq[i+1]);
					res=false;
					break;
				}else if(seq[19] == valor) {
					System.out.print("\nDepos de "+valor+" é "+(seq[18]+seq[19]));
					res=false;
					break;
				}else if(seq[i] == valor) {
					System.out.print("\nDepos de "+valor+" é "+seq[i+1]);
					res=false;
				}
			}
			if(res) {
				System.out.println("\nO número "+valor+" faz parte da sequência de Fibonacci\n");
				for(int i=0;i<20;i++) {
					System.out.print(seq[i]+ " ");
				}
			}
			System.out.println("\n\nQue tenta novamente?\n1 - sim\n2 - não");
			res1 = scan.nextInt();
			res=true;
		} while (res1==1);
	}
}
