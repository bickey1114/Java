package Java_Study1_1;

import java.util.Scanner;

public class kadai_7_2 {

	public static void main(String[] args) {
		System.out.print("�����𓊓����Ă��������F");
		Scanner sc = new Scanner(System.in);
		int yen = sc.nextInt();
		String kekka;
		
		kekka = hantei(yen);
		System.out.println(kekka);	
	}
		
	public static String hantei(int y) {
		if(y == 160) {
			return "�h�����N���w���ł��܂����y���ނ�Ȃ��z";
		}else if(y >= 160) {
			y = y - 160;
			return"�h�����N���w���ł��܂����y���ނ�" + y + "�~����z";
		}else {
			return"���z������܂���ł���";
		}

	}

}


