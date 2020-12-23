import java.util.Scanner;

public class A09 {
	public static void main(String args[]) {
		
		System.out.println("원의 중심과 반지름 입력");
		Scanner scanner = new Scanner(System.in);
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double r = scanner.nextDouble();
		
		System.out.println("점 입력");
	
		
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		if(distance<r) {
			System.out.println("점"+x2+","+y2+"은 원 안에 있다");
		}
		else {
			System.out.println("점"+x2+","+y2+"은 원 밖에 있다");
		}
			scanner.close();
			

		
	}
		

}
