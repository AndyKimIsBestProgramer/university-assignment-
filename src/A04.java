import java.util.Scanner;
public class A04 {
	public static void main(String args[]) {
		System.out.println("���� 3�� �Է�");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>b&&a<c||a<b&&a>c)
			System.out.print("�߰�����"+ a);
		else if(b>a&&b<c||b<a&&b>c)
			System.out.print("�߰�����"+ b);
		else
			System.out.print("�߰�����"+ c);


		scanner.close();
		
	}

}
