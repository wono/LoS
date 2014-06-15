/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : TEST_ERRORHANDLERS
 *                                                                  *
 *      last modified:  2014/06/14                                  *
 *      first wrote:    2014/06/14                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import static java.lang.System.out;

import error_handlers.EHMessage;
import error_handlers.types.TEHMonsters;

public class TestErrorHandlers {

    public static void main (String[] argv)
    {
        test_with_valid_input   ();
        test_with_invalid_input ();
    }
    
    private static void test_with_valid_input ()
    {
        EHMessage.PRINT ( TEHMonsters.TEMS0401 );    
        EHMessage.PRINT ( TEHMonsters.TEMS0301 );    
    }
    
    private static void test_with_invalid_input ()
    {
        EHMessage.PRINT ( new Object() );    
    }
}
