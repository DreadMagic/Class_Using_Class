public class Cylinder{
    private Circle base;
    private double height;

    public Cylinder(double rad, double h){
        height = h;
        base = new Circle(rad);
    }
    public double vol(){
        return base.getArea()*height;
    }
    public double sa(){
        return 2*base.getArea() + base.getCirc()*height;
    }
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder(5,2);
        double vol = cyl.vol();
        System.out.println("radius = 5 height = 2 volume = " + vol);
        double sa = cyl.sa();
        System.out.println("surface area = " + sa);

        Cylinder cyl2 = new Cylinder(8,6);
        vol = cyl2.vol();
        System.out.println("radius = 8 height = 6 volume = " + vol);
        sa = cyl2.sa();
        System.out.println("surface area = " + sa);
    }
}

/*5.0
radius = 5 height = 2 volume = 157.07963267948966
5.0
surface area = 219.9114857512855
8.0
radius = 8 height = 6 volume = 1206.3715789784806
8.0
surface area = 703.7167544041137

Process finished with exit code 0


 */