public class Snow extends Human {
    private String freezeSkill;
    
    public Snow(String name, double height, double weight, double speed, String gender, String freezeSkill) {
        super(name, height, weight, speed, gender);
        this.freezeSkill = freezeSkill;
    }
    
    public void show() {
        super.show();
        System.out.println("Freeze Skill: " + freezeSkill);
    }
    
    public double distance(double time, double acceleration) {
        double distance = super.distance(time, acceleration);
        return distance * 2;
    }
    
    public double distance(double time) {
        return distance(time, 0);
    }
}
