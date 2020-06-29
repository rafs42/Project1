package TestPackage1;

import org.apache.commons.codec.digest.DigestUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( getsha256("Hello World3" ));
    }

    public static String getsha256(String p1)
    {
        return(DigestUtils.sha256(p1).toString());
    }
}
