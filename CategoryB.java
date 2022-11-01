package Strategy;

public class CategoryB implements Category{

    @Override
    public float getNetSalary(Empleado e) {
        float salary = e.getGrossSalary();
        float discount = 1 - ((float)e.getChildrens()/100);
        if(startWithVowel(e.getName())){
            salary = salary * discount;
        };
        return salary;
    }

    boolean startWithVowel(String word) {
        return "eaiouEAIOU".indexOf(word.charAt(0)) >=0;
    }
}
