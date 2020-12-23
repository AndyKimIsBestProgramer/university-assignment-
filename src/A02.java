import java.util.Scanner;

public class A02 {
	public static void main(String args[]) {
		System.out.println("2자리수 정수 입력 (10~99)");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		
		if(number % 11 == 0) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		}
		
		scanner.close();
		
	}

}
