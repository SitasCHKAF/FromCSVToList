public class Division {
    int ID;
    String name;
    Division(int ID,String name)
    {
        this.name=name;
        this.ID=ID;
    }

    @Override
    public String toString() {
        return "{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
