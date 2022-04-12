import java.time.LocalDate;

public class Human {
    enum Sex{
        Male,
        Female
    }
    int ID;
    String name;
    Sex sex;
    Division division;
    int salary;
    LocalDate birthday;

    public Human(int ID,String name,String sex,Division Div,int salary,int year,int month,int day)
    {
        this.ID=ID;
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
                ", division=" + division +
                ", salary=" + salary +
                ", birthday=" + birthday.toString() +
                '}';
    }

}
