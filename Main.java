package Strategy;

public class Main {

    public static void main(String[] args) {

        CategoryA a = new CategoryA();
        CategoryB b = new CategoryB();
        CategoryC c = new CategoryC();

        Empleado employee = new Empleado("Borja",1000,2,30,a);
        System.out.println(employee.calcularSueldo());
        employee.cambiarCategoria(b);
        System.out.println(employee.calcularSueldo());
        employee.cambiarCategoria(c);
        System.out.println(employee.calcularSueldo());;
    }
}
