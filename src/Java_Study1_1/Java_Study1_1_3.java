package Java_Study1_1;

import java.util.Scanner;

public class Java_Study1_1_3 {

	public static void main(String[] args) {
		  System.out.println("数値を入力して下さい。");

		    Scanner scan = new Scanner(System.in);

		    int val = scan.nextInt();
		    System.out.println("最初の数値のトークンは: "+ val); 

		    val = scan.nextInt();
		    System.out.println("次の数値のトークンは  : "+ val);
	}

}
