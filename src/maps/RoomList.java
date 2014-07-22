package maps;

import  java.util.List;

import  javax.xml.bind.annotation.XmlElement;
import  javax.xml.bind.annotation.XmlRootElement;

/**
 *  @author Wonho Lim
 */
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
    
    public Room getE ( int index )
    {
        return  list.get(index);
    }

}
