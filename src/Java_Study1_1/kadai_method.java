package Java_Study1_1;

public class kadai_method {

	public static void main(String[] args) {
		namae("伊藤響希");
		seibetu("男性");
		shincho(1.65);
		taijyu(63);
//		sisuu(63 / 1.65 / 1.65);
		double bmiresult = bmi(63,1.65);
		sisuu(bmiresult);
	}
	//bmiを計算して変数bmiresultへ計算結果を渡す
	public static double bmi(double x,double y) {
//		double BMI = x / y / y;
		return x / y / y;
	}
	//namaeを受け取り"名前:〇〇"と表示する
	public static void namae(String name) {
		System.out.println("名前:" + name);
	}
	//seibetuを受け取り"性別:〇〇"と表示する
	public static void seibetu(String sex) {
		System.out.println("性別:" + sex);
	}
	//shinchoを受け取り"身長:〇〇ｍ"と表示する
	public static void shincho(double height) {
		System.out.println("身長:" + height + "m");
	}
	//taijyuを受け取り"体重:〇〇kg"と表示する
	public static void taijyu(double weight) {
		System.out.println("体重:" + weight + "kg");
	}
	//bmiresultを受け取り"BMI:〇〇"と表示する
	public static void sisuu(double bmi) {
		System.out.println("BMI:" + bmi);
	}
}
