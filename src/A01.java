import java.util.Scanner;

public class A01 {
	public static void main(String args[]) {
		System.out.println("원화를 입력하세요 (단위: 원)");
		
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		System.out.print( money + "원은 $"+ money/1100 +"입니다");
		scanner.close();
	}
}