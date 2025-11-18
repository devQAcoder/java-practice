package OOPs.Abstraction.ShapesCalculation;

public class Rectangle extends Shape{

    private final double length;
    private final double breadth;

    Rectangle(double length, double breadth){
        this.breadth = length;
        this.length = length;
    }

    @Override
    void draw(){
        System.out.println("Drawing Rectangle");
    }

    @Override
    double calculateArea() {
        return  length * breadth;
    }
}
