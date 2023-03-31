import java.util.InputMismatchException;
import java.util.Scanner;

class IniMonkey {
    String name;
    double height;
    double weight;
    double speed;

    void show() {
        System.out.println("項目名稱: " + this.name);
        System.out.println("身高(公尺): " + this.height);
        System.out.println("體重(公斤): " + this.weight);
        System.out.println("速度(公尺/分鐘): " + this.speed);
    }

    double distance(double x, double y) {
        return x * y * this.speed;
    }

    // 表示距離的表格
    void show(double distance) {
        System.out.printf("%-10s %-10.1f %-10.1f %-10.1f %-10.1f\n", this.name, this.height, this.weight, this.speed, distance);
    }
}

public class A1101224_0324_1 {
    public static void main(String[] args) {
        IniMonkey Snow_White = new IniMonkey();
        IniMonkey Belle = new IniMonkey();
        IniMonkey Cinderella = new IniMonkey();

        double x, y;

        // 輸入非數字亦可執行
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入白雪公主奔跑距離的x值(亦可不輸入): ");
        try {
            x = scanner.nextDouble();
        } catch (InputMismatchException e) {
            x = 1;
        }
        
        System.out.print("請輸入白雪公主奔跑距離的y值(亦可不輸入): ");
        try {
            y = scanner.nextDouble();
        } catch (InputMismatchException e) {
            y = 1;
        }
        Snow_White.name = "白雪公主";
        Snow_White.height = 1.5;
        Snow_White.weight = 100;
        Snow_White.speed = 100;

        System.out.print("請輸入貝兒公主奔跑距離的x值(亦可不輸入): ");
        try {
            x = scanner.nextDouble();
        } catch (InputMismatchException e) {
            x = 1;
        }
        
        System.out.print("請輸入貝兒公主奔跑距離的y值(亦可不輸入): ");
        try {
            y = scanner.nextDouble();
        } catch (InputMismatchException e) {
            y = 1;
        }
        Belle.name = "貝兒公主";
        Belle.height = 1.6;
        Belle.weight = 55;
        Belle.speed = 50;

        System.out.print("請輸入灰姑娘奔跑距離的x值(亦可不輸入): ");
        try {
            x = scanner.nextDouble();
        } catch (InputMismatchException e) {
            x = 1;
        }
        
        System.out.print("請輸入灰姑娘奔跑距離的y值(亦可不輸入): ");
        try {
            y = scanner.nextDouble();
        } catch (InputMismatchException e) {
            y = 1;
        }
    Cinderella.name = "灰姑娘";
    Cinderella.height = 1.55;
    Cinderella.weight = 50;
    Cinderella.speed = 70;

    System.out.println("公主名稱  身高(公尺) 體重(公斤) 速度(公尺/分鐘) 奔跑距離(公尺)");
    System.out.println("------------------------------------------------------");
    Snow_White.show(Snow_White.distance(x, y));
    Belle.show(Belle.distance(x, y));
    Cinderella.show(Cinderella.distance(x, y));
    }

}