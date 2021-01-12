package Java_Study1_1;

public class kadai_1 {

	public static void main(String[] args) {
		String Student_name = "田中";
		int japanese_score = 85;
		int math_score = 0;
		
		System.out.println(Student_name + "さんの国語の点数は" + japanese_score + "点です。");
		System.out.println(Student_name + "さんの数学の点数は" + math_score + "点です。");
		
		double average_score = (japanese_score + math_score) / 2;
		
		System.out.println("田中さんの平均点は" + average_score + "点です。");
		
		//65点以上で合格を表示する
		if(average_score >= 65) {
			System.out.println("合格です。");
		} else
			System.out.println("不合格です。");
		
	}

}
