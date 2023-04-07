public class Animal {
    private String name;
    private double height;
    private double weight;
    private double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("身高：" + height + "公分");
        System.out.println("體重：" + weight + "公斤");
        System.out.println("速度：" + speed + "公尺/秒");
    }

    public double distance(double time, double acceleration) {
        double distance = speed * time + 0.5 * acceleration * time * time;
        return distance;
    }

    public double distance(double time) {
        return distance(time, 0);
    }
}
