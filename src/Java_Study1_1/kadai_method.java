package Java_Study1_1;

public class kadai_method {

	public static void main(String[] args) {
		namae("ˆÉ“¡‹¿Šó");
		seibetu("’j«");
		shincho(1.65);
		taijyu(63);
//		sisuu(63 / 1.65 / 1.65);
		double bmiresult = bmi(63,1.65);
		sisuu(bmiresult);
	}
	//bmi‚ğŒvZ‚µ‚Ä•Ï”bmiresult‚ÖŒvZŒ‹‰Ê‚ğ“n‚·
	public static double bmi(double x,double y) {
//		double BMI = x / y / y;
		return x / y / y;
	}
	//namae‚ğó‚¯æ‚è"–¼‘O:ZZ"‚Æ•\¦‚·‚é
	public static void namae(String name) {
		System.out.println("–¼‘O:" + name);
	}
	//seibetu‚ğó‚¯æ‚è"«•Ê:ZZ"‚Æ•\¦‚·‚é
	public static void seibetu(String sex) {
		System.out.println("«•Ê:" + sex);
	}
	//shincho‚ğó‚¯æ‚è"g’·:ZZ‚"‚Æ•\¦‚·‚é
	public static void shincho(double height) {
		System.out.println("g’·:" + height + "m");
	}
	//taijyu‚ğó‚¯æ‚è"‘Ìd:ZZkg"‚Æ•\¦‚·‚é
	public static void taijyu(double weight) {
		System.out.println("‘Ìd:" + weight + "kg");
	}
	//bmiresult‚ğó‚¯æ‚è"BMI:ZZ"‚Æ•\¦‚·‚é
	public static void sisuu(double bmi) {
		System.out.println("BMI:" + bmi);
	}
}
