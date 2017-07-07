package main.java;

/**
 * Created by cmalik on 7/7/2017.
 */
public class FactoryMain {
    public static void main(String[] args)
    {
        OperatingSystemFactory osf=new OperatingSystemFactory();
        osf.getInstance("Open").spec();
    }
}
