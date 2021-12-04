public class Rectangle extends Figure {
    private  int height;
    private int weight;
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public Rectangle(int weight,int height, String color){
        super(color);
        this.weight=weight;
        this.height=height;
    }

    @Override
    public double area() {
        return height*weight;
    }

    @Override
    public double perimeter() {
        return 2*(height+weight);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
