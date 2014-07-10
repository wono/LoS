/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : SIMULATOR
 *                                                                  *
 *      last modified:  2014/07/09                                  *
 *      first wrote:    2014/07/06                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import  static java.lang.System.out;

import  java.util.ArrayList;
import  java.util.List;

import  libraries.WConsume;

import  controllers.AttackOrRun;
import  controllers.Direction;

import  maps.Map1;
import  maps.Room;

public class Simulator {

    public static void main ( String[] args )
    {
        List<Room>  rList   = Map1.getRoomList();
        Room        r       = null;
        
        Room.setCurrentRoom(rList.get(0));
        
        while (true) {
            r = Room.getCurrentRoom();
            out.println(r.getDescription());
            
            if (null != r.getMonster()) {
                out.printf("%s is here!\n", r.getMonster());
                AttackOrRun.CTRL();
            }
            
            Direction.CTRL(r);
        }
    }

}
