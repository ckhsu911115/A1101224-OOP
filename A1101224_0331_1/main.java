import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal snowball = new Animal("雪寶", 0.5, 10, 5);
        Animal donkey = new Animal("驢子", 1, 100, 10);
        Human anna = new Human("安娜", 1.6, 50, 7, "女");
        SnowQueen elsa = new SnowQueen("艾莎", 1.7, 60, 9, "女", "YES");

        snowball.show();
        donkey.show();
        anna.show();
        elsa.show();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入X（分钟）：");
        int time = scanner.nextInt();

        System.out.print("请输入Y（加速度）：");
        double acceleration = scanner.nextDouble();

        System.out.print("请输入雪寶的X值（分钟）：");
        int snowballX = scanner.nextInt();
        System.out.print("请输入雪寶的Y值（加速度）：");
        double snowballY = scanner.nextDouble();
        System.out.println("雪寶的奔跑距離：" + snowball.distance(snowballX, snowballY, time, acceleration));

        System.out.print("请输入驢子的X值（分钟）：");
        int donkeyX = scanner.nextInt();
        System.out.print("请输入驢子的Y值（加速度）：");
        double donkeyY = scanner.nextDouble();
        System.out.println("驢子的奔跑距離：" + donkey.distance(donkeyX, donkeyY, time, acceleration));

        System.out.print("请输入安娜的X值（分钟）：");
        int annaX = scanner.nextInt();
        System.out.print("请输入安娜的Y值（加速度）：");
        double annaY = scanner.nextDouble();
        System.out.println("安娜的奔跑距離：" + anna.distance(annaX, annaY, time, acceleration));

        System.out.print("请输入艾莎的X值（分钟）：");
        int elsaX = scanner.nextInt();
        System.out.print("请输入艾莎的Y值（加速度）：");
        double elsaY = scanner.nextDouble();
        System.out.println("艾莎的奔跑距離：" + elsa.distance(elsaX, elsaY, time, acceleration));
    }
}
