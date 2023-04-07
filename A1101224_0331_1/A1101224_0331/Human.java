public class Human extends Animal {
    String gender;

    public Human(String name, double height, double weight, double speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("性别：" + gender);
    }

    public void displayInfo() {
        System.out.print(this.name + "\t\t");
        System.out.print(this.height + "\t\t");
        System.out.print(this.weight + "\t\t");
        System.out.print((this.gender != null) ? this.gender : "X");
        System.out.print("\t\t");
        System.out.print("X\t");
        System.out.print("\t");
        System.out.println(this.speed);
    }
    public String getName() {
        return name;
    }
    


}
