package controller;

import otavio.ordenar.bubblesort.BubbleSort;
import otavio.ordenar.mergesort.MergeSort;
import otavio.ordenar.quicksort.QuickSort;

public class Ordem {

	public Ordem() {
		super();
	}
	
	public void preparar() {
		
		int[] vetor = new int[1500];
		int valor=0;
		
		for(int cont=1500; cont>0; cont--) {
			 vetor[cont-1]=valor;
			 valor++;
		}
		
		int[] vetorBubble = vetor;
		int[] vetorMerge = vetor;
		int[] vetorQuick = vetor;
		
		tempoQuick(vetorQuick);
		tempoMerge(vetorMerge);
		tempoBubble(vetorBubble);
		
	}
	
	public void tempoQuick(int vetor[]) {
		
		// Instanciando os métodos de cada biblioteca
		QuickSort metodoQuick = new QuickSort();
		
		int tamanho = vetor.length;
		
		double tempoInicial = System.nanoTime();
		metodoQuick.ordenar(vetor, 0, tamanho-1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal-tempoInicial)/(Math.pow(10,9));
		
		System.out.println("Tempo do QuickSort: "+tempoTotal+" seg.");
	}
	
	public void tempoMerge(int vetor[]) {
		
		// Instanciando os métodos de cada biblioteca
		MergeSort metodoMerge = new MergeSort();
		
		int tamanho = vetor.length;
		
		double tempoInicial = System.nanoTime();
		metodoMerge.ordenar(vetor, 0, tamanho-1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal-tempoInicial)/(Math.pow(10,9));

		System.out.println("Tempo do MergeSort: "+tempoTotal+" seg.");
	}
	
	public void tempoBubble(int vetor[]) {
		
		// Instanciando os métodos de cada biblioteca
		BubbleSort metodoBubble = new BubbleSort();
		
		double tempoInicial = System.nanoTime();
		metodoBubble.ordenar(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal-tempoInicial)/(Math.pow(10,9));

		System.out.println("Tempo do BubbleSort: "+tempoTotal+" seg.");
	}
}
