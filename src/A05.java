import java.util.Scanner;
public class A05 {
	public static void main(String args[]) {
		System.out.println("���� 3�� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a+b)<c||(a+c)<b||(b+c)<a)
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		else System.out.println("�ﰢ���� �˴ϴ�");
		
		scanner.close();
	}

}
