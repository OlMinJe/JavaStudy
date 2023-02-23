
public class Exam13 {

	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if(key == null || key.length() == 0)
			return 0;
		
		while(true) {
			pos = src.indexOf(key, pos);
			
			if(pos != -1) {
				count++;
				pos += key.length();
			} else {
				break;
			}
		}
		
		return count;
	}

}
