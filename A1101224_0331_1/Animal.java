

public class Animal {
    String name;
    double height;
    double weight;
    double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.print(name + "\t\t");
        System.out.print(height + "\t\t");
        System.out.print(weight + "\t\t");
        System.out.print("X\t\t");
        System.out.print("X\t\t");
        System.out.println(speed);
    }
    

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("身高：" + height + "米");
        System.out.println("體重：" + weight + "公斤");
        System.out.println("速度：" + speed + "公尺/分鐘");
    }

    public double distance(double x, double y) {
        if ( y == 0 ) {
            return x * this.speed;
        } else {
            return x * y * this.speed;
        }
    }
    public String getName() {
        return name;
    }



    }
