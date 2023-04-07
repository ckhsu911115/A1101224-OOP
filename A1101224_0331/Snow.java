public class Snow extends Human {
    String iceSkill;

    public Snow(String name, double height, double weight, double speed, String gender, String iceSkill) {
        super(name, height, weight, speed, gender);
        this.iceSkill = iceSkill;
    }
    
    public void displayInfo() {
        System.out.print(this.name + "\t\t");
        System.out.print(this.height + "\t\t");
        System.out.print(this.weight + "\t\t");
        System.out.print(this.gender + "\t\t");
        System.out.print("Yes\t\t");
        System.out.println(this.speed);
    }

    @Override
    public void show() {
        super.show();
        System.out.println( this.iceSkill);
    }

    public double distance(int x, double y) {
        return 2 * super.distance(x, y);
    }
    public String getName() {
        return name;
    }
}
