package OOPs.ClassesObjects;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void showInfo(){
        System.out.println(name + " earns " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 30000);
        Employee e2 = new Employee("Priya", 50000);

        e1.showInfo();
        e2.showInfo();
    }
}