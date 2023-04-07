import java.util.Scanner;


public class A1101224_0331 {

    public static void showinfoo() {
        System.out.println("歡迎進入冰雪奇緣系統！");
    }

    public static void main(String[] args) {

        showinfoo();

        Animal[] animals = {
                new Animal("雪寶", 1.75, 70.0, 1.5),
                new Animal("驢子", 1.8, 100.0, 1.2)
        };
        Human[] humans = {
                new Human("阿克", 1.85, 75.0, 1.8, "男"),
                new Human("漢斯", 1.8, 80.0, 1.5, "男"),
                new Human("安娜", 1.7, 60.0, 1.0, "女")
        };
        Snow[] snows = {
                new Snow("愛沙", 1.75, 65.0, 1.2, "女", "Yes")
        };

        for (Animal a : animals) {
            a.show();
            System.out.println("----------------------------");
        }

        for (Human h : humans) {
            h.show();
            System.out.println("----------------------------");
        }

        for (Snow s : snows) {
            s.show();
            System.out.println("----------------------------");
        }

        System.out.println("項目姓名\t身高(公尺)\t體重(公斤)\t性別\t冰凍技能\t速度(公尺/分鐘))");
        
        for (Animal a : animals) {
            a.displayInfo();
        }
        for (Human h : humans) {
            h.displayInfo();
        }
        for (Snow s : snows) {
            s.displayInfo();
        }


        Scanner scanner = new Scanner(System.in);

        for (Animal animal : animals) {
            System.out.print("请输入" + animal.getName() + " 的X分鐘：");
            double x_animal = scanner.nextDouble();
            System.out.print("请输入" + animal.getName() + "的Y加速度(亦可不輸入，請輸入0)：");
            double y_animal = scanner.nextDouble();
            System.out.println(animal.getName() + "距離為" + animal.distance(x_animal, y_animal));
        }

        for (Human human : humans) {
            System.out.print("请输入" + human.getName() + "的X分鐘：");
            double x_human = scanner.nextDouble();
            System.out.print("请输入" + human.getName() + "的Y加速度(亦可不輸入，請輸入0)：");
            double y_human = scanner.nextDouble();
            System.out.println(human.getName() + "距離為" + human.distance(x_human, y_human));
        }

        for (Snow snow : snows) {
            System.out.print("请输入" + snow.getName() + "的X分鐘：");
            double x_snow = scanner.nextDouble();
            System.out.print("请输入" + snow.getName() + "的Y加速度(亦可不輸入，請輸入0)：");
            double y_snow = scanner.nextDouble();
            System.out.println(snow.getName() + "距離為" + snow.distance(x_snow, y_snow));
        }
    }
}


        
