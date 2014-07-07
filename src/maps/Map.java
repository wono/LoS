/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : MAP
 *                                                                  *
 *      last modified:  2014/07/06                                  *
 *      first wrote:    2014/07/05                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package data.maps;

import  java.util.List;

import  libraries.RecordPath;
import  libraries.WXMLParser;

import  maps.types.Relation;
import  maps.Room;
import  maps.RoomLinker;
import  maps.RoomList;

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
