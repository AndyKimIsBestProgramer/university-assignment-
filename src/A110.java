import java.util.Scanner;

public class A110 {
   public static void main(String args[]) {
      System.out.println("���� �Է��ϼ���(1~12)");
      Scanner scanner = new Scanner(System.in);
      
      int x = scanner.nextInt();
      switch(x) {
      case 3: case 4: case 5:{
    	  System.out.println("��");
    	  break;
      }
      case 6: case 7: case 8:{
    	  System.out.println("����");
    	  break;
      }
      case 12: case 1: case 2:{
    	  System.out.println("�ܿ�");
    	  break;
      }
      
      default:{
    	  System.out.println("�߸��Է�");
    	  
      }
      scanner.close();
      
   }
}
}