/**
 * Created by cmalik on 7/7/2017.
 */
public class FactoryMain {
    public static void main(String[] args)
    {
		file1 ob=new file1();
		ob.show();
        OperatingSystemFactory osf=new OperatingSystemFactory();
        osf.getInstance("Open").spec();
    }
}
