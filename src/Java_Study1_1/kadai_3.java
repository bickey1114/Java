package Java_Study1_1;

public class kadai_3 {

	public static void main(String[] args) {
		String name = "�ɓ�����";
		String sex = "�j��";
		double height = 1.65;
		double weight = 45;
		double bmi = weight / (height * height);
		
		 System.out.println("���O:" + name);
		    System.out.println("����:" + sex);
		    System.out.println("�g��:" + height + "m�ł�");
		    System.out.println("�̏d:" + weight + "kg�ł�");
		    System.out.println("BMI:" + bmi + "�ł��B");
		    
		if(bmi > 25) {
			System.out.println("[�얞]");
		}else if(bmi >= 18.5 && bmi < 25) {
			System.out.println("[�W��]");
		}else {
			System.out.println("[��̏d]");
		}
	}

}
