import java.util.Scanner;
public class A04 {
	public static void main(String args[]) {
		System.out.println("정수 3개 입력");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>b&&a<c||a<b&&a>c)
			System.out.print("중간값은"+ a);
		else if(b>a&&b<c||b<a&&b>c)
			System.out.print("중간값은"+ b);
		else
			System.out.print("중간값은"+ c);


		scanner.close();
		
	}

}
