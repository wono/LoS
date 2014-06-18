/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : EHMESSAGE
 *                                                                  *
 *      last modified:  2014/06/14                                  *
 *      first wrote:    2014/06/14                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package error_handlers;

import static java.lang.System.err;
import static java.lang.System.out;

import error_handlers.interfaces.EHMessageInterface;
import error_handlers.types.TEHMonsters;

/**
 *  To print out an error meesage, call the static method like this:
 *
 *      EHMessage.PRINT (error_type);
 */
public class EHMessage implements EHMessageInterface {

    // preventing being initialization from outside world
    private EHMessage(){}
    
    /**
     *  EH_MSG_PREFIX is defined in TEHMonsters.java
     */
    public static void PRINT (Object t)
    {
        if ( !is_valid_error_type (t) ) {
            err.printf ("%s: %s is not valid error type.\n", 
                "PROGRAMMER FAULT", t);
        }
        else 
            out.printf ("%s: %s.\n",  EH_MSG_PREFIX, t);
    }
    
    /*  Helper method to determine an error type. For now, 
     *  only TEHMonster is available.
     */
    private static boolean is_valid_error_type (Object o)
    {
        return  o instanceof TEHMonsters;
    }
}
