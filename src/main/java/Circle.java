public class Circle extends Figure {
    private int r;
    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r=r;
    }
    public Circle(int r, String color){
        super(color);
        this.r=r;

    }

    @Override
    public double area() {
        return 3.14*(r^2);
    }

    @Override
    public double perimeter() {
        return 2*r*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
