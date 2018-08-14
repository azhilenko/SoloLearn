public class Vehicle {
    int maxspeed, wheels;
    private String color;
    double fuelcapacity;

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
