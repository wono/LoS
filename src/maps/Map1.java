/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : MAP1
 *                                                                  *
 *      last modified:  2014/07/06                                  *
 *      first wrote:    2014/07/06                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package maps;

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
        
        return  rList;
    }
    
    /**
     *          Lab         -       Lecture
     *           |                      |
     *      Bugger shop     -       Student Pub
     */
    @Override
    private void setRoomLocations ()
    {
        rList = getRoomRecordAsList ("RecordMaps");
        
        RoomLinker.SET(rList.get(1), Relation.NAS, rList.get(0));
        RoomLinker.SET(rList.get(2), Relation.NAS, rList.get(3));
        RoomLinker.SET(rList.get(2), Relation.WAE, rList.get(1));
        RoomLinker.SET(rList.get(3), Relation.WAE, rList.get(0));
    }

}
