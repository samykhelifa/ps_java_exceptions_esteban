
/**
 * Common exception methods
 *
 */
public class Test
{
    public static void main( String[] args )
    {
        try {
            throw new Exception("Sample exception");
        } catch(Exception e) {
            System.err.println("getMessage(): " + e.getMessage());
            System.err.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.err.println("getCause(): " + e.getCause());
            System.err.println("printStackTrace(): ");
            e.printStackTrace();
            System.err.println("fillInStackTrace(): ");
            e.fillInStackTrace();
            e.printStackTrace();

        }
    }
}
