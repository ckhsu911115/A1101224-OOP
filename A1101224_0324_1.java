import java.util.InputMismatchException;
import java.util.Scanner;

class IniMonkey {
    String name;
    double height;
    double weight;
    double speed;

    void show() {
        System.out.println("項目名稱: " + this.name);
        System.out.println("身高(公尺): " + this.height );
        System.out.println("體重(公斤): " + this.weight );
        System.out.println("速度(公尺/分鐘): " + this.speed );
    }

    

    double distance(double x, double y) {
        return x * y * this.speed;
    }

    //表示距離的表格
    void show(double distance) {
        System.out.printf("%-10s %-10.1f %-10.1f %-10.1f %-10.1f\n", this.name, this.height, this.weight, this.speed, distance);
    }
}

public class Animal {
    public static void main(String[] args) {
        IniMonkey Snow_White = new IniMonkey();
        IniMonkey Belle = new IniMonkey();
        IniMonkey Cinderella = new IniMonkey();

        double x, y;



        //輸入非數字亦可執行
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個數(亦可不輸入): ");
        try {
            x = scanner.nextDouble();
        } catch (InputMismatchException e) {
            x = 1;
        }
        
        scanner = new Scanner(System.in);
        System.out.print("請輸入一個數y(亦可不輸入): ");
        try {
            y = scanner.nextDouble();
        } catch (InputMismatchException e) {
            y = 1;
        }




        Snow_White.name = "白雪公主";
        Snow_White.height = 1.5;
        Snow_White.weight = 100;
        Snow_White.speed = 100;

        Belle.name = "貝兒公主";
        Belle.height = 1.6;
        Belle.weight = 55;
        Belle.speed = 50;

        Cinderella.name = "灰姑娘";
        Cinderella.height = 1.7;
        Cinderella.weight = 500;
        Cinderella.speed = 80;

        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "項目名稱", "身高(公尺)", "體重(公斤)", "速度(公尺/分鐘)", "距離");
        System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f\n", Snow_White.name, Snow_White.height, Snow_White.weight, Snow_White.speed, Snow_White.distance(x, y));
        System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f\n", Belle.name, Belle.height, Belle.weight, Belle.speed, Belle.distance(x, y));
        System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f\n", Cinderella.name, Cinderella.height, Cinderella.weight, Cinderella.speed, Cinderella.distance(x, y));
        //您可以增加每個欄位的寬度，例如使用%-15s來表示每個項目名稱欄位，%-10.2f來表示其他數值欄位，其中.2表示保留兩位小數。您也可以嘗試使用更大的欄位寬度來看看效果
    }
}
