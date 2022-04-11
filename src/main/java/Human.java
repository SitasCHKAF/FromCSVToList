import java.time.LocalDate;
import java.util.Calendar;

public class Human {
    enum Sex{
        male,
        female;
    }
    int ID;
    String name;
    Sex sex;
    Division division;
    int salary;
    LocalDate birthday;

    public Human(String name,String sex,Division Div,int salary,int year,int month,int day)
    {
        ID=getUniqueId();
        this.name=name;
        this.division=Div;
        this.sex= Sex.valueOf(sex);
        this.salary=salary;
        this.birthday=LocalDate.of(year,month,day);
    }

    @Override
    public String toString() {
        return "Human{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex=" + sex.toString() +
                ", division=" + division.name +
                ", salary=" + salary +
                ", birthday=" + birthday.toString() +
                '}';
    }

    static int identificationFactory=0;
    static int getUniqueId()
    {
        return ++identificationFactory;
    }

}
