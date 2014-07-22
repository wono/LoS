package maps;

import  maps.types.Relation;

/**
 *  @author Wonho Lim
 */
public class RoomLinker {

    /**
     *  In case of NAS relationship:
     *      r1 is north of r2
     *      r2 is south of r1.
     *  
     *  In case of WAE relationship:
     *      r1 is west of r2
     *      r2 is east of r1.
     */
    public static void SET ( Room r1, Relation r, Room r2 )
    {
        // north and south relationship
        if ( Relation.NAS == r ) {
            r1.setSouth(r2);
            r2.setNorth(r1);
        }

        // west and east relationship
        else {
            r1.setEast(r2);
            r2.setWest(r1);
        }
    }

}
