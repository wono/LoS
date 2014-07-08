/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : SIMULATOR
 *                                                                  *
 *      last modified:  2014/07/08                                  *
 *      first wrote:    2014/07/06                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import  static java.lang.System.out;

import  java.util.ArrayList;
import  java.util.List;

import  libraries.WConsume;
import  controllers.Direction;

import  maps.Map1;
import  maps.Room;

public class Simulator {

    public static void main ( String[] args )
    {
        List<Room>  rList   = Map1.getRoomList();
        
        Room.setCurrentRoom(rList.get(0));
        
        out.println(rList.get(0).getDescription());
        
        Direction.CTRL(rList.get(0));
        
    }

}
