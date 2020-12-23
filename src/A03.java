import java.util.Scanner;
public class A03 {
	public static void main(String args[]) {
		System.out.println("금액을 입력하시오");
		
		
		int key;

		int a = 0;

		int b=0;

		int c=0;

		int d=0;

		int e=0;

		int f=0;

		Scanner scanner = new Scanner(System.in);

			

		key = scanner.nextInt();	

		a = key/50000;		

		System.out.println("오만원권" + a + "매");

		b = key%50000/10000;		

		System.out.println("만원권" + b + "매");

		c = key%10000/1000;		

		System.out.println("천원권" + c + "매");

		d = key%1000/100;

		System.out.println("백원" + d + "개");

		e = key%100/10;		

		System.out.println("십원" + e + "개");

		f = key%10;		

		System.out.println("일원" + f + "개");
		
		
		
		scanner.close();
		
		
	}

}
