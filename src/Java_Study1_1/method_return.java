package Java_Study1_1;

public class method_return {

	public static void main(String[] args) {
//		fullNameメソッドの結果を変数nameに代入してください
		String name = fullName("Kate","Jones");

		printData(name,27);
		
		printData("John Christpher Smith",65);
	}

	public static void printData(String name,int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");

	}
	
	//	fullNameメソッドを定義してください
	public static String fullName(String firstName,String lastName) {
		return firstName + " " + lastName;
	}
}
