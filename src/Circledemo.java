public class Circledemo {
    private int  radius;
    public Circledemo(int radius)
    {
        this.radius=radius;
    }
    public Circledemo()
    {
        this.radius=2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double circumference()
    {
        return 2*3.14*radius;
    }
    public double area()
    {
        return 3.14*radius*radius;
    }
}
