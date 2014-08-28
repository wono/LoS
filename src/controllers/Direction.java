package controllers;

import  static java.lang.System.out;

import  java.lang.Character;

import  controllers.Control;
import  controllers.interfaces.CtrlKeyIndex;
import  controllers.interfaces.Dialogue;
import  controllers.types.TPrmpt;
import  maps.Room;

/**
 *  This is a wrapper of a static method that enables handling control 
 *  flow for moving around rooms by prompting directions as input keys 
 *  from the user.
 *
 *  @author Wonho Lim
 */
public class Direction implements CtrlKeyIndex, Dialogue {

    // Prevents being initialized
    private Direction () {}
    
    /**
     *  The logic is like this:
     *
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
        String  s   = Dialogue.MOVE_DENY;
                
        switch ( Character.toUpperCase ( c ) ) {

            case CKDR_NORTH:
                WConsume.ONLY_IF(
                    current,
                    p -> !Control.MOVE(current, current.getNorth()),
                    p -> { out.println(s); CTRL(current); }
                );  break;
                
            case CKDR_SOUTH: 
                WConsume.ONLY_IF(
                    current,
                    p -> !Control.MOVE(current, current.getSouth()),
                    p -> { out.println(s); CTRL(current); }
                );  break;

            case CKDR_EAST:
                WConsume.ONLY_IF(
                    current,
                    p -> !Control.MOVE(current, current.getEast()),
                    p -> { out.println(s); CTRL(current); }
                );  break;

            case CKDR_WEST:
                WConsume.ONLY_IF(
                    current,
                    p -> !Control.MOVE(current, current.getWest()),
                    p -> { out.println(s); CTRL(current); }
                );  break;
                
            default: CTRL(current);
        } 

    }

}
