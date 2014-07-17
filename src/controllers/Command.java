package controllers;

import java.util.HashMap;
import java.util.Map;

/**
 *  @author Wonho Lim
 */
public enum Command {

    EAST('e'), WEST('w'), SOUTH('s'), NORTH('n'),

    ATTACK('a'), RUN('r');
    
    private static Map<Character, Command> COMMANDS;
    
    static {
        COMMANDS = new HashMap<Character, Command>();
        
        for (Command c : values()) {
            COMMANDS.put(c.getShortCommand(), c);
        }
    }
    
    private char shortCommand;
    
    private Command (char c)
    {
        shortCommand = c;
    }
    
    public char getShortCommand ()
    {
        return shortCommand;
    }
    
    public static Command GET (char key)
    {
        return COMMANDS.get(key);
    }

}
