package Factory.Vendor;


import Factory.OS_Factory.OS;
import Factory.OS_Factory.OSFactory;
import Singleton.Singleton;

public class MainClass
{
    public static void main(String[] args)
    {
        OSFactory osf = new OSFactory();
        osf.getInstance("Most used").tagline();

        OS obj = osf.getInstance("Less used");
        obj.tagline();

    }
    public static void singletonDemo()
    {
        Singleton three = Singleton.getInstance();
        System.out.println(three);
    }
}
