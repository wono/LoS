package maps;

import  javax.xml.bind.annotation.XmlRootElement;

import  monsters.Monster;
import  monsters.RandomMonsterGen;

/**
 *
 *  @author T-Dawg, Wonho Lim
 */
@XmlRootElement ( name = "Map" )
public class Room {

    private static Room     current;

    private String  description;
    private String  name;
    
    private Monster monster;
    
    private Room    north;
    private Room    south;
    private Room    east;
    private Room    west;

    public Room () { monster = RandomMonsterGen.GET(); }

    /**
     *  @param String description of this room
     *  @param String name of this room
     */
    public Room ( String d, String n )
    {
        description = d;
        name        = n;
        monster     = RandomMonsterGen.GET();
    }
    
    public static void setCurrentRoom(Room r)   { current = r;      }
    public static Room getCurrentRoom()         { return current;   }

    public void setDescription  ( String d  ) { description = d; }
    public void setName         ( String n  ) { name        = n; }
    public void setMonster      ( Monster m ) { monster     = m; }
    public void setNorth        ( Room r    ) { north       = r; }
    public void setSouth        ( Room r    ) { south       = r; }
    public void setEast         ( Room r    ) { east        = r; }
    public void setWest         ( Room r    ) { west        = r; }

    public String   getDescription  ()  { return description;   }
    public String   getName         ()  { return name;          }
    public Monster  getMonster      ()  { return monster;       }
    public Room     getNorth        ()  { return north;         }
    public Room     getSouth        ()  { return south;         }
    public Room     getEast         ()  { return east;          }
    public Room     getWest         ()  { return west;          }

    @Override
    public String   toString        ()  { return name;          }

}
