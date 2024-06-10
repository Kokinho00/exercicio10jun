package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cor;

		ArrayList<String> cores = new ArrayList<String>();

		for (int cont = 0; cont < 5; cont++) {
			System.out.println(" Informe a cor desejada: ");
			cor = sc.nextLine();

			cores.add(cor);

		}
		for (String item: cores ) {
			System.out.println(item);
			
		}
		
		cores.sort(null);
		for (String item: cores ) {
			System.out.println(item);
			
		}
		sc.close();
	}

}
