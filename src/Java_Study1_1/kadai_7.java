package Java_Study1_1;

import java.util.Scanner;

public class kadai_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if(y == 160) {
			System.out.println("ドリンクが購入できました【お釣りなし】");
		}else if(y >= 160) {
			System.out.println("ドリンクが購入できました【お釣りあり】");
		}else {
			System.out.println("金額が足りませんでした");
		}

	}

}
