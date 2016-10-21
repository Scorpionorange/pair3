import java.util.*;
/**
 * Created by ScorpionOrange on 2016/10/16.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String inputName,double inputSalary,int year,int month,int day){
        name=inputName;
        salary=inputSalary;
        GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
        //GregorianCalendar uses 0 for January
        hireDay=calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        //return hireDay;
        // 错误用法：不适用clone()的话，返回的值如若被修改，将被反馈至private hireDay，从而破坏了封装性；
        return (Date) hireDay.clone();
    }

    public void raiseSalary(double byPercent){
        salary = salary * (1 + byPercent/100);
    }
}
