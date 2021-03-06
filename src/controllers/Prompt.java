package controllers;

import  static java.lang.System.out;

import  controllers.interfaces.PromptMessage;

/**
 *  Prompts the user by printing messages. To print out messages 
 *  within the same package, call the method like this:
 *
 *      Prompt.PRINT( message );
 *
 *  @author Wonho Lim
 */
class Prompt implements PromptMessage {

    // Prevents being initialized
    private Prompt () {}
    
    public static void PRINT ( String msg )
    {
        out.printf ( "%s. %s? ", PMSG_PREFIX, msg );
    }
}
