/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : TEST_ERRORHANDLERS
 *                                                                  *
 *      last modified:  2014/06/20                                  *
 *      first wrote:    2014/06/14                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import static java.lang.System.err;
import static java.lang.System.out;

import error_handlers.EHMessage;
import error_handlers.types.TEHMonsters;

public class TestErrorHandlers {

    public static void main (String[] argv)
    {
        out.println ( "=========================" );
        out.println ( "  TEST : ERROR HANDLERS  " );
        out.println ( "=========================" );
        out.println ();
        test_with_valid_input   ();
        out.println ();
        test_with_invalid_input ();
        out.println ();
    }
    
    private static void test_with_valid_input ()
    {
        out.println ( "TEST 1 : General Error Printing" );
        out.println ( "-------------------------------" );
        EHMessage.PRINT ( TEHMonsters.TEMS0401 );    
        EHMessage.PRINT ( TEHMonsters.TEMS0301 );    
    }
    
    private static void test_with_invalid_input ()
    {
        out.println ( "TEST 2 : Programmer-fault Error Printing" );
        out.println ( "----------------------------------------" );
        out.print   ( "Note: the error message should be logged" );
        out.println ( " at 'tests/logs/TestErrorHandlers.err'."  );
        
        err.println ( "TEST 2 result" );
        err.println ( "-------------" );
        EHMessage.PRINT ( new Object() );
    }
}
