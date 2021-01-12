package Java_Study1_1;

import java.util.Random;
import java.util.Scanner;

public class Java_Study1_1_jannkenn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String[]hand = {"グー","チョキ","パー"};
		String[]omikuji = {"吉","凶","中吉","大吉"};
		
		int y = 0;
		int c = 0;
		
		while(y < 3 && c < 3) {
			System.out.println("『0』『1』『2』を入力してください。（0→グー，1→チョキ，2→パー)");
			int n = sc.nextInt();
			int r = random.nextInt(3);
			System.out.println("あなた:" + hand[n]);
			System.out.println("相手:" + hand[r]);

			if((n == 0 && r == 1) ||(n == 1 && r == 2)||(n == 2 && r == 0)) {
				y++;
				System.out.println("あなたの勝ちです！(" + y + "勝" + c + "敗)");
			}
			if((n == 0 && r == 2) ||(n == 1 && r == 0)||(n == 2 && r == 1)) {
				c++;
				System.out.println("あなたの負けです...(" + y + "勝" + c + "敗)");
			}
			if(n == r) {
				System.out.println("あいこです。(現在の勝数　あなた:" +  y +"勝　相手:" + c +"勝)" );  
			}
			if(y == 3) {
				r = random.nextInt(4);
				System.out.println("あなたの運勢は" + omikuji[r] + "です！");
			}else if(c == 3) {
				System.out.println("さあ、リトライです！！！");
			}
		}
	}

}
