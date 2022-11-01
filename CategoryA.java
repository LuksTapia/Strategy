package Strategy;

public class CategoryA implements Category{

    @Override
    public float getNetSalary(Empleado e) {
        float salary = e.getGrossSalary();
        float percentage = 1 + ((float)e.getStartingDay()/100);
        return (salary * percentage);
    }
}
