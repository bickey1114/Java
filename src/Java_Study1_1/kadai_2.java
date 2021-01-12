package Java_Study1_1;

import java.util.*;


public class kadai_2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        //名前の入力
	        System.out.println("あなたの名前は？ ");
	        String name = sc.next();
	        // 年齢の入力
	        System.out.println("あなたの年齢は？");
	        int age = sc.nextInt();
	        //名前と年齢の表示
	        System.out.println("あなたの名前は" + name + "で、" + "年齢は" + age + "歳ですね。");

	}

}
