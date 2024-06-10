package collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		Set<Integer> setnumeros = new HashSet<Integer>();
		
		
		setnumeros.add(2);
		setnumeros.add(5);
		setnumeros.add(1);
		setnumeros.add(3);
		setnumeros.add(4);
		setnumeros.add(9);
		setnumeros.add(7);
		setnumeros.add(8);
		setnumeros.add(10);
		setnumeros.add(6);
		
		System.out.println("Digite o numero que deseja enccontrar: ");
		 num = sc.nextInt();
		 
		 if(setnumeros.contains(num)) {
			 System.out.println("O numero " + num + " foi encontrado ");
		 } else {
			 System.out.println("O número " + num + " não foi encontrado ");
		 };
		 
		 sc.close();
		
	}
	

}
