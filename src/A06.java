import java.util.Scanner;
public class A06 {
	public static void main(String args[]) {
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a==3||a==6||a==9) {
			System.out.println("�ڼ�¦");
		}
		else if(a>10) {
			if((a%10)==3||(a%10)==6||(a%10)==9) {
				if((a/10)==3||(a/10)==6||(a/10)==9)
					System.out.println("�ڼ�¦¦");
				
			}
			else if( (a/10)==3||(a/10)==6||(a/10)==9)
				System.out.println("�ڼ�¦");
			}
		scanner.close();
	}

}
