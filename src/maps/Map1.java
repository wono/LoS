/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, DATA : MAP1
 *                                                                  *
 *      last modified:  2014/07/05                                  *
 *      first wrote:    2014/07/05                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package data.maps;

import  java.util.List;

import  libraries.RecordPath;
import  libraries.WXMLParser;

import  maps.Relation;
import  maps.Room;
import  maps.RoomLinker;
import  maps.RoomList;

public class Map1 {

    static private Map1 instance = null;
        
    /**
     *          Lab         -       Lecture
     *           |                      |
     *      Bugger shop     -       Student Pub
     */
    private Map1 ()
    {
        RoomList ls =   WXMLParser.PULL(
                            RecordPath.GET("RecordMaps"),
                            RoomList.class
                        );
        
        List<Room> l = ls.get();
        
        RoomLinker.SET(l.get(1), Relation.NAS, l.get(0));
        RoomLinker.SET(l.get(2), Relation.NAS, l.get(3));
        RoomLinker.SET(l.get(2), Relation.WAE, l.get(1));
        RoomLinker.SET(l.get(3), Relation.WAE, l.get(0));
    }

}
