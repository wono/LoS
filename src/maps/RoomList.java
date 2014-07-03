/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : ROOM LIST
 *                                                                  *
 *      last modified:  2014/07/02                                  *
 *      first wrote:    2014/07/02                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package maps;

import  java.util.List;

import  javax.xml.bind.annotation.XmlElement;
import  javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RoomList {

    @XmlElement ( name = "room" )
    private List<Room> list;
    
    public void set ( List<Room> l )
    {
        list = l;
    }
    
    public List<Room> get ()
    {
        return  list;
    }

}
