package CH8Classes;

public class MichaelMancinoBycicle {
    private double cost;
    private String condition;
    private int numofgears;
    private double PSI;
    private int wheels;
    private boolean bought;
    private int agerange;
    private String color;
    private double RPM;
    private boolean isbraking;

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getContiditon() {
        return condition;
    }
    public void setContiditon(String condition) {
        this.condition = condition;
    }
    public int getGears() {
        return numofgears;
    }
    public double getPSI() {
        return PSI;
    }
    public int getWheels() {
        return wheels;
    }
    public boolean isBought() {
        return bought;
    }
    public int getAgerange() {
        return agerange;
    }
    public String getColor() {
        return color;
    }
    public double getRPM() {
        return RPM;
    }

    public boolean isIsbraking() {
        return isbraking;
    }
    public void setcondition(){
        this.condition = condition;

    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setIsbraking() {
       this.isbraking = isbraking;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public void setPSI(double PSI) {
        this.PSI = PSI;
    }

    public void setAgerange(int agerange) {
        this.agerange = agerange;
    }
    public String toString(){
        return (cost+" " + condition + " " + color + " "+ numofgears+" "+ PSI + " " + wheels);
    }
}
