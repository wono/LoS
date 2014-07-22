package maps;

import  java.util.List;

import  maps.types.Relation;

/**
 *  @author Wonho Lim
 */
public class Map1 extends Map {

    private static Map1 instance = null;

    private Map1 ()
    {
        setRoomLocations();
    }
    
    // singleton    
    public static List<Room> getRoomList ()
    {
        if ( null == instance ) instance = new Map1();
        
        return  instance.rList;
    }
    
    /**
     *          Lab         -       Lecture
     *           |                      |
     *      Bugger shop     -       Student Pub
     */
    @Override
    protected void setRoomLocations ()
    {
        rList = getRoomRecordAsList ("RecordMaps");
        
        RoomLinker.SET(rList.get(1), Relation.NAS, rList.get(0));
        RoomLinker.SET(rList.get(2), Relation.NAS, rList.get(3));
        RoomLinker.SET(rList.get(2), Relation.WAE, rList.get(1));
        RoomLinker.SET(rList.get(3), Relation.WAE, rList.get(0));
    }

}
