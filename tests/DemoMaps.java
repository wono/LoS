/* * * * * * * * * * * * * * * * * * * * * * * *
 *  JAVA, TEST : DEMO MAPS
 *                                                                  *
 *      last modified:  2014/07/03                                  *
 *      first wrote:    2014/07/02                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import  static java.lang.System.out;

import  java.util.List;

import  libraries.RecordPath;
import  libraries.WXMLParser;

import  maps.Relation;
import  maps.Room;
import  maps.RoomLinker;
import  maps.RoomList;

public class DemoMaps {

    public static void main ( String[] args )
    {
        RoomList ls 
            =   WXMLParser.PULL(
                    RecordPath.GET("RecordMaps"),
                    RoomList.class
                );
        
        setRooms(ls.get());
        
        ls.get().stream()
                .forEach(r -> out.printf("Room: %s - %s.\n"
                        + "=======\n"
                        + "  MAP  \n"
                        + "=======\n"
                        + "\t\t\t\t\t\tN[%s]\n"
                        + "\tE[%s]\t\t\t\t\t\t\t\t\tW[%s]\n"
                        + "\t\t\t\t\t\tS[%s]\n\n",
                        r.getName(),
                        r.getDescription(),
                        r.getNorth(),
                        r.getEast(),
                        r.getWest(),
                        r.getSouth())
                );
    }

    /**
     *          Lab         -       Lecture
     *           |                      |
     *      Bugger shop     -       Student Pub
     */
    public static void setRooms ( List<Room> l )
    {
        RoomLinker.SET(l.get(0), Relation.NAS, l.get(1));
        RoomLinker.SET(l.get(3), Relation.WAE, l.get(0));
        RoomLinker.SET(l.get(2), Relation.NAS, l.get(3));
        RoomLinker.SET(l.get(2), Relation.WAE, l.get(1));
    }
}
