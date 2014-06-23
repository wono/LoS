/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : DIRECTION
 *                                                                  *
 *      last modified:  2014/06/19                                  *
 *      first wrote:    2014/06/19                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers;

import  static java.lang.System.out;
import  java.lang.Character;

import  controllers.interfaces.CtrlKeyIndex;
import  controllers.types.TPrmpt;

/**
 *  Controller for moving into a direction. To use this controller 
 *  from the outside where imports this class, call the method like
 *  this:
 *
 *      Direction.CTRL ();
 */
public class Direction implements CtrlKeyIndex {

    // Prevents being initialized
    private Direction () {}
    
    public static void CTRL ()
    {
        char    c   = UInput.GET_KEY ( TPrmpt.DIRECTIONS );
        String  s   = "You are headed to";
        
        switch ( Character.toUpperCase ( c ) ) {
            
            case CKDR_NORTH : out.printf ( "%s North.\n", s ); break;
            case CKDR_SOUTH : out.printf ( "%s South.\n", s ); break;
            case CKDR_EAST  : out.printf ( "%s East.\n" , s ); break;
            case CKDR_WEST  : out.printf ( "%s West.\n" , s ); break;

            default         : CTRL ();
        } 
    }
}
