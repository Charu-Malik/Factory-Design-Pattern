# Factory-Design-Pattern
It is basically used for lazy loading of classes
wher we create a class called OperatingSystemFactyory that return the object of any of the class(Windows, Android, IOS) depending on the input string


public interface OS {
    public void spec();
}

public class Windows implements OS {
    @Override
    public void spec()
    {
        System.out.println("windows os");
    }

}
public class IOS implements OS {
    @Override
    public void spec()
    {
        System.out.println("IOS os");
    }

}

public class Android implements OS {
 @Override
    public void spec()
        {
            System.out.println("Android os");
        }

}

public class FactoryMain {
    public static void main(String[] args)
    {
        Os ob=new Windows();
        ob.spec();  // print "Windows os"
        
        
         ob=new IOS();
        ob.spec();  // print "IOS os"
        
        
         ob=new Android();
        ob.spec();  // print "Android os"
    }
}

Disadvantage is end user can easily know about structure and classes of our code , he know that we are calling Windows class, IOS class or Android class.
so we create OperatingSystemFactory.java class that return instance of any of above class depend on the input string
