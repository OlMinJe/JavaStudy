package section06;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		child.method1();
		child.method2();
		child.method3();
		
		parent.method1();
		parent.method2();
		//parent.method3(); // 컴파일 오류 - 자식이 누군지 몰라서
	}

}
