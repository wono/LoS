package controllers;

import  static java.lang.System.out;
import  java.lang.Character;

import  controllers.interfaces.CtrlKeyIndex;
import  controllers.types.TPrmpt;
import  maps.Room;

/**
 *  Controller for attacking and running. To use this controller from 
 *  the outside where imports this class, call the method like this:
 *
 *      AttackOrRun.CTRL ();  
 *
 *  @author Wonho Lim
 */
public class AttackOrRun implements CtrlKeyIndex {

    // Prevents being initialized
    private AttackOrRun () {}
    
    public static void CTRL ( Room r )
    {
        char c = UInput.GET_KEY ( TPrmpt.ATTACK_RUN );
        
        switch ( Character.toUpperCase ( c ) ) {
            
            case CKAR_ATTACK    :   out.println("ATTACK!"); 
                                    Combat.INIT(r);
                                    break;
                                    
            case CKAR_RUN       :   out.println("RUNNNN!");
                                    break;

            default             :   CTRL(r);
        
        }
        
    }
}
