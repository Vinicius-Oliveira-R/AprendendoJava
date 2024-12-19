
import java.util.Arrays;
public class MergeSort{
	public static void main(String []args){
		int[] vetor = {1,5,8,6,3,2,4,4,7,9,12,15,20,11,10};
		int[] auxiliar = new int[vetor.length];
		merge(vetor,auxiliar,0,vetor.length-1);
		System.out.println(Arrays.toString(vetor));
	}

	private static void merge(int[] vetor,int[] auxiliar,int inicio,int fim){
		if(inicio<fim){
			int meio = (inicio+fim)/2;
			merge(vetor,auxiliar,inicio,meio);
			merge(vetor,auxiliar,meio+1,fim);
			intercalacao(vetor,auxiliar,inicio,meio,fim);
		}
	}
	private static void intercalacao(int[] vetor, int[] auxiliar,int inicio,int meio,int fim){
		for(int x = inicio;x<= fim;x++){
			auxiliar[x] = vetor[x];
		}	
		int esquerda = inicio;
		int direita  = meio + 1;
		for(int x = inicio; x<=fim;x++){
			if(esquerda>meio){
				System.out.println("Não existe esquerda");
				vetor[x] = auxiliar[direita++];
			} else if(direita > fim){
				System.out.println("Não existe direita");
				vetor[x] = auxiliar[esquerda++];
			} else if(auxiliar[esquerda]<auxiliar[direita]){
				System.out.println("copianda para esquerda");
				vetor[x] = auxiliar[esquerda++];				
			} else {
				System.out.println("Copiando da direita");
				vetor[x] = auxiliar[direita++];
			}
		}
	
	}
	
}