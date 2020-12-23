import java.util.Scanner;

public class A10 {
	public static void main(String args[]) {
		System.out.println("첫 번째 원의 중심과 반지름 입력");
		Scanner scanner = new Scanner(System.in);
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double r1 = scanner.nextDouble();
		
		System.out.println("두 번째 원의 중심과 반지름 입력");
	
		
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double r2 = scanner.nextDouble();
		
		double distance = 0;
		distance = Math.sqrt((x1-y1)*(x1-y1)+(x2-y2)*(x2-y2));
		if (distance < r1+r2) {
			System.out.println("두 원은 서로 겹친다");
		}
		else {
			System.out.println("두원은 안 겹친다");
		}
		scanner.close();
		
	}

}
