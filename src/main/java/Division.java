public class Division {
    int ID;
    String name;
    Division(String name)
    {
        this.name=name;
        ID=getUniqueId();
    }

    static int identificationFactory=0;
    static int getUniqueId()
    {
        return ++identificationFactory;
    }
}
