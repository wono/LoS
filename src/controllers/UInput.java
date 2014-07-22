package controllers;

import  java.util.Scanner;

import  controllers.interfaces.PromptMessage;
import  controllers.types.TPrmpt;

/**
 *  User Input controller. Gets a key from user after prompting. To 
 *  get a key within the same package, call the method like this:
 *
 *      Char key = UInput.GET_KEY ( message );
 *
 *  Note that 'message' is String type of message to prompt the user 
 *  input.
 *
 *  @author Wonho Lim
 */
public class UInput implements PromptMessage {
    
    // Prevents being initialized.
    private UInput () {}
    
    public static char GET_KEY ( TPrmpt t )
    {
        final Scanner s = new Scanner ( System.in );
        Prompt.PRINT ( _pmsg_get(t) );
        
        return s.next().charAt(0);
    }
    
    private static String _pmsg_get ( TPrmpt t )
    {
        switch ( t ) {
            case ATTACK_RUN:    return PMSG_ATTACK_RUN;
            case DIRECTIONS:    return PMSG_DIRECTIONS;
            case KEY_SKILLS:    return PMSG_KEY_SKILLS;
            
            // never happens
            default:            return null;
        }
    }

}
