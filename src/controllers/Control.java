package controllers;

import java.util.List;

import maps.Room;
import skills.Skill;

/**
 *  This is a wrapper of static method to manipulate basic control 
 *  pattern.
 *
 *  @author Wonho Lim
 */
public class Control {

    public static boolean MOVE ( Room current, Room next )
    {
        if ( null == next ) return false;
        
        Room.setCurrentRoom(next);  
        return true;        
    }
    
    public static <T> boolean KEY_USE ( int keyNum, List<T> ls )
    {
        return ls.get(keyNum);
    }

}
