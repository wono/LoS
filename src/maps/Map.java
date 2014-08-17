package maps;

import  java.util.List;

import  maps.types.Relation;
import  maps.Room;
import  maps.RoomLinker;
import  maps.RoomList;

/**
 *  @author Wonho Lim
 */
public abstract class Map {
    
    protected String        mapName;
    protected List<Room>    rList;
    
    protected static List<Room>
    getRoomRecordAsList ( String recordTitle )
    {
        RoomList ls =   WXMLParser.PULL(
                            RecordPath.GET(recordTitle),
                            RoomList.class
                        );
        
        return  ls.get();
    }

    protected abstract void setRoomLocations();

    public void setMapName ( String mapName )
    {
        this.mapName = mapName;
    }

}
