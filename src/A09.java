import java.util.Scanner;

public class A09 {
	public static void main(String args[]) {
		
		System.out.println("���� �߽ɰ� ������ �Է�");
		Scanner scanner = new Scanner(System.in);
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double r = scanner.nextDouble();
		
		System.out.println("�� �Է�");
	
		
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		if(distance<r) {
			System.out.println("��"+x2+","+y2+"�� �� �ȿ� �ִ�");
		}
		else {
			System.out.println("��"+x2+","+y2+"�� �� �ۿ� �ִ�");
		}
			scanner.close();
			

		
	}
		

}
