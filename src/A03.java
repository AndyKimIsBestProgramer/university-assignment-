import java.util.Scanner;
public class A03 {
	public static void main(String args[]) {
		System.out.println("�ݾ��� �Է��Ͻÿ�");
		
		
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

		System.out.println("��������" + a + "��");

		b = key%50000/10000;		

		System.out.println("������" + b + "��");

		c = key%10000/1000;		

		System.out.println("õ����" + c + "��");

		d = key%1000/100;

		System.out.println("���" + d + "��");

		e = key%100/10;		

		System.out.println("�ʿ�" + e + "��");

		f = key%10;		

		System.out.println("�Ͽ�" + f + "��");
		
		
		
		scanner.close();
		
		
	}

}
