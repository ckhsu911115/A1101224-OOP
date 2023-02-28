import java.util .*;

public class Q9 {
    public static void main(String[] argv) {
        int num;
        System.out.println("請輸入一整數讓我來判斷是偶數還奇數:");

        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) { 
            System.out.println("输入错误，请重新输入：");
            sc.next(); 
        }
        num = sc.nextInt();


        if( num %2 == 0 ){
            System.out.print("偶數");
         }else{
            System.out.print("奇數");
         }
    }
}
