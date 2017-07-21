/**
 * Created by cmalik on 7/7/2017.
 */
public class OperatingSystemFactory {
    public OS getInstance(String str)
    {
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
