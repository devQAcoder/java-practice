package OOPs.Polymorphism;

public class StaticOrCompileTime {

    //-- Classic example of of add() method using int or double methods as below

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        StaticOrCompileTime staticOrCompileTime = new StaticOrCompileTime();

        System.out.println(staticOrCompileTime.add(112, 12323));  // Uses int add(a,b) version

        System.out.println(staticOrCompileTime.add(112234, 12323, 5243));  // Uses int add(a,b,c) version

        System.out.println(staticOrCompileTime.add(454.35234, 123.345323));  // Uses double version
    }
}

