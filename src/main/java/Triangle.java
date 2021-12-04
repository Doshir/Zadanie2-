public class Triangle extends Figure {
    private int l1;
    private int l2;
    private int l3;

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    public int getL1() {
        return l1;
    }

    public int getL2() {
        return l2;
    }

    public int getL3() {
        return l3;
    }



    @Override
    public double area() {
        return l1*l2*l3;
    }

    @Override
    public double perimeter() {
        return l1+l2+l3;
    }
    public Triangle(int l1, int l2, int l3, String color ){
     super(color);
     this.l1=l1;
     this.l2=l2;
     this.l3=l3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                '}';
    }
}
