package Factory.OS_Factory;

public class OSFactory
{
    public OS getInstance(String str)
    {
        if(str.equals("Most used"))
            return new Windows_OS();
        else
            return new Mac_OS();
    }
}
