import java.util.Scanner;

public class A11 {
   public static void main(String args[]) {
      System.out.println("���� �Է��ϼ���(1~12)");
      Scanner scanner = new Scanner(System.in);
      
      int x = scanner.nextInt();
      
      if(x>=3 && x<=5) {
    	  System.out.println("��");
      }
      else if(x>=6 && x<=8) {
    	  System.out.println("����");
    	  
      }
      else if(x==12 || x==1 || x==2) {
    	  System.out.println("�ܿ�");
     
   }
      else {
    	  System.out.println("�߸��Է�");
      }
      scanner.close();

}
}