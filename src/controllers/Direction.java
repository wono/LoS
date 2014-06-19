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

import  controllers.types.TPrmpt;

/**
 *  Controller for moving into a direction. To use this controller 
 *  from the outside where imports this class, call the method like
 *  this:
 *
 *      Direction.CTRL ();
 */
public class Direction {

    // Prevents being initialized
    private Direction () {}
    
    public static void CTRL ()
    {
        char    c   = UInput.GET_KEY ( TPrmpt.DIRECTIONS );
        String  s   = "You are headed to";
        
        switch ( c ) {
            
            case 'N':
            case 'n':   out.printf ( "%s North.\n", s ); break;
            
            case 'S':   
            case 's':   out.printf ( "%s South.\n", s ); break;
            
            case 'E':   
            case 'e':   out.printf ( "%s East.\n" , s ); break;
        
            case 'W':   
            case 'w':   out.printf ( "%s West.\n" , s ); break;
            
            default :   CTRL ();
        } 
    }
}
