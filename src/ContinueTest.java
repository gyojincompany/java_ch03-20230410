
public class ContinueTest {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i % 2 == 1)
				continue;//홀수가 i값이 되면 증가식 i++로 되돌림
			
				System.out.println(i + "는 짝수이다!!");
			
		}
	}
}
