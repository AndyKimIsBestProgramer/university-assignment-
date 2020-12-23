import java.util.Scanner;

public class A12 {
	public static void main(String args[]) {
		System.out.print("연산");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		String y = scanner.next();
		int z = scanner.nextInt();
		
		int k = 0;
		if(y.equals("+")) {
			k = x+z;}
		else if (y.equals("-")) {
			k = x-z;
		}
		else if (y.equals("*")) {
			k = x*z;
		}
		else if (y.equals("/")) {
			if(z==0) {
				System.out.println("0으로 나눌 수 없습니다");
				scanner.close();
				
				return;
			}
			else k = x/z;
		}
		else {
			 scanner.close();
			 return;
			
		}
		System.out.println(x+y+z+"의 계산결과는"+ k);
		scanner.close();
		
		
		
	}

}
