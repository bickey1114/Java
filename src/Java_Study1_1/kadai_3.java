package Java_Study1_1;

public class kadai_3 {

	public static void main(String[] args) {
		String name = "伊藤響希";
		String sex = "男性";
		double height = 1.65;
		double weight = 45;
		double bmi = weight / (height * height);
		
		 System.out.println("名前:" + name);
		    System.out.println("性別:" + sex);
		    System.out.println("身長:" + height + "mです");
		    System.out.println("体重:" + weight + "kgです");
		    System.out.println("BMI:" + bmi + "です。");
		    
		if(bmi > 25) {
			System.out.println("[肥満]");
		}else if(bmi >= 18.5 && bmi < 25) {
			System.out.println("[標準]");
		}else {
			System.out.println("[低体重]");
		}
	}

}
