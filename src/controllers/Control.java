/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : CONTROL
 *                                                                  *
 *      last modified:  2014/07/08                                  *
 *      first wrote:    2014/07/06                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers;

import  maps.Room;

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

}
