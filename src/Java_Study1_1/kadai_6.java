package Java_Study1_1;

public class kadai_6 {

	public static void main(String[] args) {
		//������Student_name,subject,subjectmath,score,mathscore
		result("�c��","����","���w",85,0);
//		result("�c��","���w",0);
	}
			
	public static void result(String Student_name,String subject,String subjectmath,int score,int mathscore) {
			
			System.out.println(Student_name + "�����" + subject + "�̓_����" + score + "�_�ł��B");
			System.out.println(Student_name + "�����" + subjectmath + "�̓_����" + mathscore + "�_�ł��B");

			
			double average_score = (score + mathscore) / 2;
			
			System.out.println("�c������̕��ϓ_��" + average_score + "�_�ł��B");
			
			//65�_�ȏ�ō��i��\������
			if(average_score >= 65) {
				System.out.println("���i�ł��B");
			} else {
				System.out.println("�s���i�ł��B");
			
		}


	}

}
