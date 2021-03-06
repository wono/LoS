import  static java.lang.System.out;

import  java.util.ArrayList;
import  java.util.List;

import  controllers.AttackOrRun;
import  controllers.Direction;
import  maps.Map1;
import  maps.Room;
import  monsters.Monster;

public class Simulator {

    public static void main ( String[] args )
    {
        List<Room>  rList   = Map1.getRoomList();
        Monster     m       = null;
        Room        r       = null;
        
        Room.setCurrentRoom(rList.get(0));
        
        while (true) {
            r = Room.getCurrentRoom();
            m = r.getMonster();
            
            out.printf("You are in %s - %s.\n", 
                r, r.getDescription());
            
            if (null != m) {
                out.printf("%s is here! %s.\n",
                    m, m.getDescription());
                AttackOrRun.CTRL(r);
            }
            
            Direction.CTRL(r);
        }
    }

}
