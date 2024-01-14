/*
 * 
 * Um minigame de adivinhação. O programa foi desenvolvido para praticar e demonstrar conceitos de vetores e do algoritmo de
 * busca binária.
 * 
 */

package programs.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] entrada) {
	
		Scanner leitura = new Scanner(System.in);
		
		BuscaBinaria buscaBinaria = new BuscaBinaria();
		
		System.out.println("Digite a quantidade de números da sua lista:\n");
		int numero = leitura.nextInt();
		var vetorCriado = buscaBinaria.criaVetor(numero);
		
		var elementoSoma = buscaBinaria.somaVetor(vetorCriado);

		var vetorPreenchido = buscaBinaria.preencheDinamicamente(vetorCriado, elementoSoma);
		
		System.out.println("\nTente encontrar um número gerado na lista, digitando-o abaixo:\n");
		int buscado = leitura.nextInt();
		buscaBinaria.buscaBinaria(vetorPreenchido, buscado);
		
		System.out.println("\nOs números da lista eram:\n");
		buscaBinaria.imprimeVetor(vetorPreenchido);
		
		leitura.close();
		
	}		
}

class BuscaBinaria implements VetoresMetodos{
	
	//método cria um vetor vazio do tamanho que o usuário inserir e retorna esse vetor
	@Override
	public int[] criaVetor(int numero) {
		int vetor[] = new int[numero];
		System.out.println("\nA lista com " + vetor.length + " números foi criada.");
		return vetor;
	}
	
	//método preenche os espaços do vetor criado pelo usuário multiplicando por inteiros pares e depois soma os valores 
	//dos elementos e retorna essa soma
	@Override
	public int somaVetor(int[] vetor){
		int elemento = 0;
		int pares = 0;
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = i * pares;
			elemento = elemento + vetor[i];
			pares += 2;
		}
		return elemento;
	}
	
	//método preenche os espaços do vetor criado pelo usuário, pegando a soma do metódo somaVetor() e multiplicando essa
	//soma por números ímpares de acordo com o tamanho do vetor e retorna o vetor preenchido
	@Override
	public int[] preencheDinamicamente(int[] vetor, int elementoSoma) {
		int j = 1;
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = elementoSoma*j;
			j += 2;
		}
		return vetor;
	}
	
	//método imprime os elementos do vetor que o usuário criou
	@Override
	public void imprimeVetor(int[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	//método realiza a busca dos elementos do vetor, que foram criados de forma ordenada, portanto, a busca binária,
	//um algoritmo de complexidade O(log n) funciona perfeitamente nessa situação, independente do tamanho do vetor que o
	//usuário criar, conseguindo buscar a informação de forma eficiente
	@Override
	public void buscaBinaria(int vetor[], int buscado) {
		int inicio = 0, meio, fim = vetor.length - 1;
		boolean achou = false;
		while(inicio <= fim) {
			meio = ((int) (inicio + fim) / 2);
			if(vetor[meio] == buscado) {
				achou = true;
				break;
			}else if(buscado > vetor[meio]) {
				inicio = meio + 1;
			}else {
				fim = meio - 1;
			}
		}
		if(achou) {
			System.out.println("\nO número foi encontrado na lista.");
		}else {
			System.out.println("\nO número não existe na lista.");
		}
	}
}
	
interface VetoresMetodos {
	
	public int[] criaVetor(int numero);
	
	public int somaVetor(int[] vetor);
	
	public int[] preencheDinamicamente(int vetor[], int elementoSoma);
	
	public void imprimeVetor(int[] vetor);
	
	public void buscaBinaria(int vetor[], int buscado);
	
}
