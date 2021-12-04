public class TestFigures  {


    public static void main(String[] args){
            Figure[] figures = new Figure[]{new Triangle(10,10,10,"Red"),
            new Triangle(10,20,30,"Green"), new Triangle(10,20,15,"Red"),
            new Rectangle(5,10,"Red"), new Rectangle(40,15,"Orange"),
                    new Circle(4,"Red"),new Circle(10,"Red"),new Circle(5,"Red")
            };
        System.out.println( "Периметр красных фигур равен:" + calculateRedPerimeter(figures));
        System.out.println( "Площадь красных фигур равен:" + calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures) {
        int sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor() == "Red") {
                sum = (int) (sum + figures[i].perimeter());
            }

        }
        return sum;
    }
    public static double calculateRedArea(Figure[] figures){
        int sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor() == "Red") {
                sum = (int) (sum + figures[i].area());
            }

        }
        return sum;
    }
}
