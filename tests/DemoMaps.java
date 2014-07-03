/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : DEMO MAPS
 *                                                                  *
 *      last modified:  2014/07/02                                  *
 *      first wrote:    2014/07/02                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import  static java.lang.System.out;

import  java.util.ArrayList;

import  libraries.RecordPath;
import  libraries.WXMLParser;

import  maps.Room;
import  maps.RoomList;

public class DemoMaps {

    public static void main ( String[] args )
    {
        int i = 0;
                
        RoomList ls 
            =   WXMLParser.PULL(
                    RecordPath.GET("RecordMaps"),
                    RoomList.class
                );

        for ( Room r : ls.get() ) {
            out.printf ("Room #%d %s: %s\n",
                ++i, r.getName(), r.getDescription()); 
        }
    }

}
