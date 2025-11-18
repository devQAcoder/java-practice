package OOPs.Abstraction.ShapesCalculation;

public class Circle extends Shape{

    private final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius ;
    }
}
