package exam26;
// Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.

class Outer {
	static class Inner {
		int iv = 200;
	}
}

class Exam26 {
	public static void main(String[] args) {
		Outer.Inner b = new Outer.Inner();
		
		System.out.println(b.iv);		
	}
}
