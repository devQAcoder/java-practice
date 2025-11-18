package OOPs.Abstraction.ShapesCalculation;

public class Triangle extends Shape{

    private final double base;
    private final double height;

    Triangle(double base, double height){
        this.height = base;
        this.base = base;
    }

    @Override
    void draw(){
        System.out.println("Drawing Triangle");
    }

    @Override
    double calculateArea() {
        return  base * height;
    }
}
