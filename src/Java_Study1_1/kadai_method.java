package Java_Study1_1;

public class kadai_method {

	public static void main(String[] args) {
		namae("�ɓ�����");
		seibetu("�j��");
		shincho(1.65);
		taijyu(63);
//		sisuu(63 / 1.65 / 1.65);
		double bmiresult = bmi(63,1.65);
		sisuu(bmiresult);
	}
	//bmi���v�Z���ĕϐ�bmiresult�֌v�Z���ʂ�n��
	public static double bmi(double x,double y) {
//		double BMI = x / y / y;
		return x / y / y;
	}
	//namae���󂯎��"���O:�Z�Z"�ƕ\������
	public static void namae(String name) {
		System.out.println("���O:" + name);
	}
	//seibetu���󂯎��"����:�Z�Z"�ƕ\������
	public static void seibetu(String sex) {
		System.out.println("����:" + sex);
	}
	//shincho���󂯎��"�g��:�Z�Z��"�ƕ\������
	public static void shincho(double height) {
		System.out.println("�g��:" + height + "m");
	}
	//taijyu���󂯎��"�̏d:�Z�Zkg"�ƕ\������
	public static void taijyu(double weight) {
		System.out.println("�̏d:" + weight + "kg");
	}
	//bmiresult���󂯎��"BMI:�Z�Z"�ƕ\������
	public static void sisuu(double bmi) {
		System.out.println("BMI:" + bmi);
	}
}
