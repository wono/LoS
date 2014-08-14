import  static java.lang.System.out;

import  java.util.List;

import  libraries.RecordPath;

import  maps.Room;
import  maps.RoomLinker;
import  maps.RoomList;
import  maps.types.Relation;

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
                        + "%20s%20s\n"
                        + "%20s%20s%20s\n"
                        + "%20s%20s\n\n",
                        r.getName(),
                        r.getDescription(),
                        " ", r.getNorth(),
                        r.getEast(), " ", r.getWest(),
                        " ", r.getSouth())
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
