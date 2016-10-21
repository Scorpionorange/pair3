/**
 * Created by ScorpionOrange on 2016/10/16.
 */
public class Manager extends Employee{
    private double bonus;
    /**
     * @param aName the employee's name
     * @param aSalary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    public Manager(String aName, double aSalary, int year, int month, int day){
        super(aName, aSalary, year, month, day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double aBonus){
        bonus = aBonus;
    }
}
