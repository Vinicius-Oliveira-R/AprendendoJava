import java.util.Scanner;
public class Exercicio1{
/*Implemente um algoritmo que peça a nota ao usuário e em seguida calcule e imprima
a média*/
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		int nota1 = teclado.nextInt();
		System.out.println("Digite a segunda nota");
		int nota2 = teclado.nextInt();
		System.out.println("Digite a terceira nota");
		int nota3 = teclado.nextInt();	
		int media = (nota1+nota2+nota3)/3;
		System.out.println("A media das notas e: "+media);

	}	
}