package OOPs.Abstraction.ShapesCalculation;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape[]  shape = {
                new Circle(5),
                new Rectangle(7.5, 10.5),
                new Triangle(12.7, 9)
        };

        for(Shape s: shape){
            s.draw();
            System.out.println("Area - " + s.calculateArea() );
            System.out.println();
        }

    }
}
