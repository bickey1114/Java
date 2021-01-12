package Java_Study1_1;

public class kadai_6 {

	public static void main(String[] args) {
		//左からStudent_name,subject,subjectmath,score,mathscore
		result("田中","国語","数学",85,0);
//		result("田中","数学",0);
	}
			
	public static void result(String Student_name,String subject,String subjectmath,int score,int mathscore) {
			
			System.out.println(Student_name + "さんの" + subject + "の点数は" + score + "点です。");
			System.out.println(Student_name + "さんの" + subjectmath + "の点数は" + mathscore + "点です。");

			
			double average_score = (score + mathscore) / 2;
			
			System.out.println("田中さんの平均点は" + average_score + "点です。");
			
			//65点以上で合格を表示する
			if(average_score >= 65) {
				System.out.println("合格です。");
			} else {
				System.out.println("不合格です。");
			
		}


	}

}
