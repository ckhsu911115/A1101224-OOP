import java.util.Scanner;

public class A1101224_0421_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入Email地址：");
        String email = scanner.nextLine();

        boolean OX = false;
        while (!OX) {
            if (!email.matches("[a-z]+@[a-z]+\\.[a-z]+")) {
                System.out.print("請輸入正確的Email地址：");
                email = scanner.nextLine();
            } else {
                System.out.println("您輸入的Email地址正確！");
                OX = true;
            }
        }
    }
}
