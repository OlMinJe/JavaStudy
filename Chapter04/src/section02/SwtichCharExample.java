package section02;

public class SwtichCharExample {

	public static void main(String[] args) {
		char grade = 'a';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("비회원 입니다.");
				break;
		}
	}

}
