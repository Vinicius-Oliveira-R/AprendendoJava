public class BubbleSort{
public static void main (String[]args){
	int i =0;
	int aux = 0;
	int[] array = {1,2,5,6,3,4,9,8,7,8,5,5,6,6,5,8,4,1,10,9,14};
	System.out.println("Vetor desordenado:");
	for(i=0; i<array.length; i++){
		System.out.print(array[i]+" ");
	}

	System.out.println("\n ---------------------------------------------------------------");
	for(i=0; i<array.length;i++){
		for(int j = 0; j<array.length-1; j++){
			if(array[j]>array[j+1]){
				aux = array[j];
				array[j] = array[j+1];
				array[j+1] = aux;
			}
		}
	}
	System.out.println("Vetor ordenado: ");
	for(i=0; i<array.length;i++){
		System.out.print(" "+array[i]);
	}
}
}