package Singleton;

public class Singleton
{
    private Singleton()
    { }
    static Singleton singleton = null;
    public static Singleton getInstance()
    {
        if (singleton==null)
            singleton = new Singleton();
        return singleton;
    }
}
