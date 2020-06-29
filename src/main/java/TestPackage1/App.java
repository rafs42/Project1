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
        System.out.println( "Hello World3" );
        System.out.println(DigestUtils.sha256("helloworld"));
    }
}
