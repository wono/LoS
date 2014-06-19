/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : TESTCONTROLLERS
 *                                                                  *
 *      last modified:  2014/06/19                                  *
 *      first wrote:    2014/06/18                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import static java.lang.System.out;

import controllers.AttackOrRun;
import controllers.Direction;

public class TestControllers {

    public static void main ( String[] args )
    {
        out.println ( "======================" );
        out.println ( "  TEST : CONTROLLERS  " );
        out.println ( "======================" );
        test_attack_run ();
        test_direction  ();
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
