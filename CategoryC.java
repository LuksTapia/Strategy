package Strategy;

public class CategoryC implements Category{

    final static float BONO = 500;

    @Override
    public float getNetSalary(Empleado e) {
        return e.getGrossSalary() + BONO;
    }
}
