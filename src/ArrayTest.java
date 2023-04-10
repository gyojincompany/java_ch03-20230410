
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[10];
		
		int b[] = {10,20,30,40,50};//배열의 선언과 동시에 초기화
		
		int c[] = {1,2,3,4,5,56,6,3,13,31,13,1,313,13,13,13,13,13,131,31,34,42,42,424,24,45,2542,5};
		
//		int c;
//		int d=10;
		a[5] = 100;
		int k = b[4];//50
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);
//		System.out.println(b[3]);
//		System.out.println(b[4]);
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		int count=0;
		
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j]);
			count++;
		}
		System.out.println(count);
		
		System.out.println(b);
		
	}

}
