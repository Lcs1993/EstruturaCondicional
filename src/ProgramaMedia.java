import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		System.out.println("Estrutura Condicional");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Primeira nota: ");
		float n1= teclado.nextFloat();
		System.out.print("Segunda nota: ");
		float n2 = teclado.nextFloat();
		float m=(n1+n2)/2;
		System.out.println("Sua média foi " + m);
		if (m>9) {
			System.out.print("Parabéns, pequeno gafanhoto!");
		}

	}

}
