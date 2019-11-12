package Singleton;

import Factory.Vendor.MainClass;

public class Demo
{
    public static void main(String[] args) {
        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();
        System.out.println(one);
        System.out.println(two);
        MainClass.singletonDemo();
        System.out.println("\nsingleton method has to be public");
    }
}
