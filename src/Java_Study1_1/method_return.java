package Java_Study1_1;

public class method_return {

	public static void main(String[] args) {
//		fullName���\�b�h�̌��ʂ�ϐ�name�ɑ�����Ă�������
		String name = fullName("Kate","Jones");

		printData(name,27);
		
		printData("John Christpher Smith",65);
	}

	public static void printData(String name,int age) {
		System.out.println("���̖��O��" + name + "�ł�");
		System.out.println("�N���" + age + "�΂ł�");

	}
	
	//	fullName���\�b�h���`���Ă�������
	public static String fullName(String firstName,String lastName) {
		return firstName + " " + lastName;
	}
}
