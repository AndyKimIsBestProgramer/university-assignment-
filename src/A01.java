import java.util.Scanner;

public class A01 {
	public static void main(String args[]) {
		System.out.println("��ȭ�� �Է��ϼ��� (����: ��)");
		
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		System.out.print( money + "���� $"+ money/1100 +"�Դϴ�");
		scanner.close();
	}
}