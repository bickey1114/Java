package Java_Study1_1;

import java.util.Random;
import java.util.Scanner;

public class Java_Study1_1_jannkenn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();   
		 String[] rps = {"�O�[","�`���L","�p�["};  //*����񂯂�z��
		 String[] names = {"��g","���g","���g","�g","��","�勥"};  //���݂����z��
		 int y = 0;        //�ϐ��@�u���Ȃ��v
		 int c = 0;        //�ϐ��@�u����v
		 
		 while(y<3 && c<3) {
		  System.out.println("�w0�x�w1�x�w2�x����͂��Ă��������B�i0���O�[�C1���`���L�C2���p�[)");
		  int n = sc.nextInt(); 
		  int r = random.nextInt(3); 
		  System.out.println("���Ȃ��F"+ rps[n]);  //*�R���\�[�����͌�A�w�O�[�x�w�`���L�x�w�p�[�x�������_���ŏo��
		  System.out.println("����F"+ rps[r]);  //*�R���\�[�����͌�A�w�O�[�x�w�`���L�x�w�p�[�x�������_���ŏo��
		    
		  //�����p�^�[��
		  if((n == 0 && r == 1) ||(n == 1 && r == 2)||(n == 2 && r == 0)) {
		    y  ++;
		   System.out.println("���Ȃ��̏����ł��B�i" + y + "��" + c + "�s�j");  
		  }
		  //�����p�^�[��
		  if((n == 0 && r == 2) ||(n == 1 && r == 0)||(n == 2 && r == 1)) {
		   c ++;
		   System.out.println("���Ȃ��̕����ł��B�i" + y + "��" + c + "�s�j");  
		  }
		  //�������p�^�[��
		  if((n == 0 && r == 0) ||(n == 1 && r == 1)||(n == 2 && r == 2)) {
		   System.out.println("�������ł��B(���݂̏����@���Ȃ�:" +  y +"���@����:" + c +"��)" );  
		  }
		//�ǂ��炩��3�������炨�݂���������
		  if(y == 3) {
		   System.out.println("���Ȃ������݂����������܂��B");
		   r = random.nextInt(6);   //���݂����z��
		   System.out.println("���Ȃ��̂��݂����̌���: " + names[r]);  //���݂����̌��ʂ�\��  
		  }else if(c == 3){
		   System.out.println("���肪���݂����������܂��B");
		   r = random.nextInt(6);   //���݂����z��
		   System.out.println("����̂��݂����̌���: " + names[r]);  //���݂����̌��ʂ�\��  
		  }
		 }
	}

}
