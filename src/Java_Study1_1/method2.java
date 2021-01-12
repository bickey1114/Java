package Java_Study1_1;

public class method2 {

	public static void main(String[] args) {
//		それぞれ年齢に関する引数を追加してください
		printData("Kate Jones",27);
		printData("Jhon Christopher　Smith",65);
	}
	
//	年齢に関する引数を受け取れるようにしてください
	public static void printData(String name,int age) {
		System.out.println("私の名前は" + name + "です");
//		「年齢は〇〇歳です」と出力してください
		System.out.println("年齢は" + age + "歳です");

	}
}
