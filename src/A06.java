import java.util.Scanner;
public class A06 {
	public static void main(String args[]) {
		System.out.println("1~99 사이의 정수를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a==3||a==6||a==9) {
			System.out.println("박수짝");
		}
		else if(a>10) {
			if((a%10)==3||(a%10)==6||(a%10)==9) {
				if((a/10)==3||(a/10)==6||(a/10)==9)
					System.out.println("박수짝짝");
				
			}
			else if( (a/10)==3||(a/10)==6||(a/10)==9)
				System.out.println("박수짝");
			}
		scanner.close();
	}

}
