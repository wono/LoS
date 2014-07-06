/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, ENUMERATION : DIRECTION
 *                                                                  *
 *      last modified:  2014/07/06                                  *
 *      first wrote:    2014/07/06                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package maps.types;

public enum Direction {

    private String name;
    
    EAST("East"),
    NORTH("North"),
    SOUTH("South"),
    WEST("West");
    
    private Direction ( String s )  { name = s; }
    
    @Override
    public String toString ()
    { 
        return  name; 
    }

}
