package section08;

public class CoditonalOperatorExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score >= 90) ? 'A' : ((score >= 90) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
