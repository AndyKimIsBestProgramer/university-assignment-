import java.util.Scanner;

public class A02 {
	public static void main(String args[]) {
		System.out.println("2�ڸ��� ���� �Է� (10~99)");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		
		if(number % 11 == 0) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		}
		
		scanner.close();
		
	}

}
