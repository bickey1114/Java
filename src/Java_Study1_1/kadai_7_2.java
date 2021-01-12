package Java_Study1_1;

import java.util.Scanner;

public class kadai_7_2 {

	public static void main(String[] args) {
		System.out.print("‚¨‹à‚ğ“Š“ü‚µ‚Ä‚­‚¾‚³‚¢F");
		Scanner sc = new Scanner(System.in);
		int yen = sc.nextInt();
		String kekka;
		
		kekka = hantei(yen);
		System.out.println(kekka);	
	}
		
	public static String hantei(int y) {
		if(y == 160) {
			return "ƒhƒŠƒ“ƒN‚ªw“ü‚Å‚«‚Ü‚µ‚½y‚¨’Ş‚è‚È‚µz";
		}else if(y >= 160) {
			y = y - 160;
			return"ƒhƒŠƒ“ƒN‚ªw“ü‚Å‚«‚Ü‚µ‚½y‚¨’Ş‚è" + y + "‰~‚ ‚èz";
		}else {
			return"‹àŠz‚ª‘«‚è‚Ü‚¹‚ñ‚Å‚µ‚½";
		}

	}

}


