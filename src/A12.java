import java.util.Scanner;

public class A12 {
	public static void main(String args[]) {
		System.out.print("����");
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
				System.out.println("0���� ���� �� �����ϴ�");
				scanner.close();
				
				return;
			}
			else k = x/z;
		}
		else {
			 scanner.close();
			 return;
			
		}
		System.out.println(x+y+z+"�� �������"+ k);
		scanner.close();
		
		
		
	}

}
