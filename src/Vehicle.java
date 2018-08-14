public class Vehicle {
    int maxspeed, wheels;
    double fuelcapacity;
    private String color;
    Vehicle()
    {
        this.setColor("Red");
    }
    Vehicle(String c)
    {
        this.setColor(c);
    }

    public String getColor()
    {
        return color;
    }
    public  void setColor(String c)
    {
        this.color=c;
    }


    void horn(){
        System.out.println("Beep!");
    }
}
