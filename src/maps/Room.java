package maps;

import  javax.xml.bind.annotation.XmlRootElement;

/**
 *
 *  @author T-Dawg, Wonho Lim
 */
@XmlRootElement ( name = "Map" )
public class Room {

    private String  description;
    private String  name;
    
    private Room    north;
    private Room    south;
    private Room    east;
    private Room    west;

    public Room () {}

    /**
     *  @param String description of this room
     *  @param String name of this room
     */
    public Room ( String d, String n )
    {
        setDescription  (d);
        setName         (n);
    }
    
    public void setDescription ( String d )
    {
        description = d;
    }
    
    public void setName ( String n )
    {
        name = n;
    }
    
    public String getDescription ()
    {
        return  description;
    }
    
    public String getName ()
    {
        return  name;
    }
}
