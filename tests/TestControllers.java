import static java.lang.System.out;

import controllers.AttackOrRun;
import controllers.Direction;

public class TestControllers {

    public static void main ( String[] args )
    {
        out.println ( "======================" );
        out.println ( "  TEST : CONTROLLERS  " );
        out.println ( "======================" );
        out.println ();
        test_attack_run ();
        out.println ();
        test_direction  ();
        out.println ();
    }
    
    private static void test_attack_run ()
    {
        out.println ( "TEST 1 : Attack Run" );
        out.println ( "-------------------" );
        AttackOrRun.CTRL ();    
    }
    
    private static void test_direction ()
    {
        out.println ( "TEST 2 : Dirrection" );
        out.println ( "-------------------" );
        Direction.CTRL ();         
    }
}
