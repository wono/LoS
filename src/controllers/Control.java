/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : CONTROL
 *                                                                  *
 *      last modified:  2014/07/11                                  *
 *      first wrote:    2014/07/06                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers;

import java.util.List;

import maps.Room;
import skills.Skill;

/**
 *  This is a wrapper of static method to manipulate basic control 
 *  pattern.
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
