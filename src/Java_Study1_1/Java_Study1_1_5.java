package Java_Study1_1;

public class Java_Study1_1_5 {

	public static void main(String[] args) {
		// ループ処理
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println("猫が"+ i +"匹");
//		}
//		int i = 7;
//		while(i < 6)
//		{
//			System.out.println("これは表示されない");
//			i++;
//		}
		int maxNum = 10;
		String[] names = {"青木","井上","太田","加藤","佐藤","鈴木","田中","中村","山田","渡辺"};
					
		for(int num = 0; num < maxNum; num++)
		{
			System.out.print(names[num] + "くんいる？");
		}
	}

}
