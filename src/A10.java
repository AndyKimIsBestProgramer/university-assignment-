import java.util.Scanner;

public class A10 {
	public static void main(String args[]) {
		System.out.println("ù ��° ���� �߽ɰ� ������ �Է�");
		Scanner scanner = new Scanner(System.in);
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double r1 = scanner.nextDouble();
		
		System.out.println("�� ��° ���� �߽ɰ� ������ �Է�");
	
		
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double r2 = scanner.nextDouble();
		
		double distance = 0;
		distance = Math.sqrt((x1-y1)*(x1-y1)+(x2-y2)*(x2-y2));
		if (distance < r1+r2) {
			System.out.println("�� ���� ���� ��ģ��");
		}
		else {
			System.out.println("�ο��� �� ��ģ��");
		}
		scanner.close();
		
	}

}
