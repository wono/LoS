/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : DIRECTION
 *                                                                  *
 *      last modified:  2014/07/06                                  *
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
import  libraries.WConsume;

/**
 *  This is a wrapper of a static method that enables handling control 
 *  flow for moving around rooms by prompting directions as input keys 
 *  from the user.
 */
public class Direction implements CtrlKeyIndex {

    // Prevents being initialized
    private Direction () {}
    
    /**
     *  The logic is like this:
     *      1)  get key from user by prompting messages
     *
     *      2)  if it's valid key, attempt to move room;
     *          otherise, prompt to get key from user again
     *
     *      3)  if there is no room to move with the direction,
     *          prompt again; otherwise move into the direction
     *
     */
    public static void CTRL ( Room current )
    {
        char    c   = UInput.GET_KEY ( TPrmpt.DIRECTIONS );
        String  s   = "You cannot go there.";
        
        switch ( Character.toUpperCase ( c ) ) {
            
            case CKDR_NORTH:
                WConsume.ONLY_IF(
                    current,
                    p -> !Control.MOVE(current, current.getNorth()),
                    p -> { out.println(s); CTRL(); }
                );  break;
                
            case CKDR_SOUTH: 
                WConsume.ONLY_IF(
                    current,
                    p -> !Control.MOVE(current, current.getSouth()),
                    p -> { out.println(s); CTRL(); }
                );  break;

            case CKDR_EAST:
                WConsume.ONLY_IF(
                    current,
                    p -> !Control.MOVE(current, current.getEast()),
                    p -> { out.println(s); CTRL(); }
                );  break;

            case CKDR_WEST:
                WConsume.ONLY_IF(
                    current,
                    p -> !Control.MOVE(current, current.getWest()),
                    p -> { out.println(s); CTRL(); }
                );  break;
                
            default: CTRL ();
        } 
    }
}
