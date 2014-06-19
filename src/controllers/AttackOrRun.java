/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : ATTACKORRUN
 *                                                                  *
 *      last modified:  2014/06/19                                  *
 *      first wrote:    2014/06/18                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers;

import  static java.lang.System.out;

import  controllers.types.TPrmpt;

/**
 *  Controller for attacking and running. To use this controller from 
 *  the outside where imports this class, call the method like this:
 *
 *      AttackOrRun.CTRL ();  
 */
public class AttackOrRun {

    // Prevents being initialized
    private AttackOrRun () {}
    
    public static void CTRL ()
    {
        char c = UInput.GET_KEY ( TPrmpt.ATTACK_RUN );
            
        switch ( c ) {
            
            case 'A':
            case 'a':   out.printf ( "ATTACK!\n" ); break;
            
            case 'R':
            case 'r':   out.printf ( "RUNNNN!\n" ); break;
            
            default :   CTRL ();
        
        }
        
    }
}
