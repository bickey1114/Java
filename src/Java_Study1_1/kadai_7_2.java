package Java_Study1_1;

import java.util.Scanner;

public class kadai_7_2 {

	public static void main(String[] args) {
		System.out.print("お金を投入してください：");
		Scanner sc = new Scanner(System.in);
		int yen = sc.nextInt();
		String kekka;
		
		kekka = hantei(yen);
		System.out.println(kekka);	
	}
		
	public static String hantei(int y) {
		if(y == 160) {
			return "ドリンクが購入できました【お釣りなし】";
		}else if(y >= 160) {
			y = y - 160;
			return"ドリンクが購入できました【お釣り" + y + "円あり】";
		}else {
			return"金額が足りませんでした";
		}

	}

}


