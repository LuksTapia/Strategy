package Strategy;

public class Empleado {

    private String name;
    private float grossSalary;
    private int childrens;
    private int startingDay;

    private Category categoria;


    public Empleado(String name, float grossSalary, int childrens, int startingDay, Category categoria) {
        setName(name);
        setGrossSalary(grossSalary);
        setChildrens(childrens);
        setStartingDay(startingDay);
        setCategoria(categoria);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public float getGrossSalary() {
        return grossSalary;
    }

    private void setGrossSalary(float grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getChildrens() {
        return childrens;
    }

    private void setChildrens(int childrens) {
        this.childrens = childrens;
    }

    public int getStartingDay() {
        return startingDay;
    }

    private void setStartingDay(int startingDay) {
        this.startingDay = startingDay;
    }

    private void setCategoria(Category c) {
        this.categoria = c;
    }

    public Category getCategoria() {
        return this.categoria;
    }

    public void cambiarCategoria(Category newCategory) {
        setCategoria(newCategory);
    }

    public float calcularSueldo() {
        return categoria.getNetSalary(this);
    }



}
