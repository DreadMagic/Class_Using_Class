public class Circle {
    private double radius;
    public Circle(double rad){
        radius = rad;
    }
    public double getCirc(){
        double cir = 2*radius*Math.PI;
        return cir;
    }
    public double getArea(){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
