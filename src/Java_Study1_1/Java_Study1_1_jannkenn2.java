package Java_Study1_1;

import java.util.Random;
import java.util.Scanner;

public class Java_Study1_1_jannkenn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String[]hand = {"�O�[","�`���L","�p�["};
		String[]omikuji = {"�g","��","���g","��g"};
		
		int y = 0;
		int c = 0;
		
		while(y < 3 && c < 3) {
			System.out.println("�w0�x�w1�x�w2�x����͂��Ă��������B�i0���O�[�C1���`���L�C2���p�[)");
			int n = sc.nextInt();
			int r = random.nextInt(3);
			System.out.println("���Ȃ�:" + hand[n]);
			System.out.println("����:" + hand[r]);

			if((n == 0 && r == 1) ||(n == 1 && r == 2)||(n == 2 && r == 0)) {
				y++;
				System.out.println("���Ȃ��̏����ł��I(" + y + "��" + c + "�s)");
			}
			if((n == 0 && r == 2) ||(n == 1 && r == 0)||(n == 2 && r == 1)) {
				c++;
				System.out.println("���Ȃ��̕����ł�...(" + y + "��" + c + "�s)");
			}
			if(n == r) {
				System.out.println("�������ł��B(���݂̏����@���Ȃ�:" +  y +"���@����:" + c +"��)" );  
			}
			if(y == 3) {
				r = random.nextInt(4);
				System.out.println("���Ȃ��̉^����" + omikuji[r] + "�ł��I");
			}else if(c == 3) {
				System.out.println("�����A���g���C�ł��I�I�I");
			}
		}
	}

}
