package Java_Study1_1;

public class kadai_1 {

	public static void main(String[] args) {
		String Student_name = "�c��";
		int japanese_score = 85;
		int math_score = 0;
		
		System.out.println(Student_name + "����̍���̓_����" + japanese_score + "�_�ł��B");
		System.out.println(Student_name + "����̐��w�̓_����" + math_score + "�_�ł��B");
		
		double average_score = (japanese_score + math_score) / 2;
		
		System.out.println("�c������̕��ϓ_��" + average_score + "�_�ł��B");
		
		//65�_�ȏ�ō��i��\������
		if(average_score >= 65) {
			System.out.println("���i�ł��B");
		} else
			System.out.println("�s���i�ł��B");
		
	}

}
