/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, ENUMERATION : TYPEMONSTER
 *                                                                  *
 *      last modified:  2014/06/09                                  *
 *      first wrote:    2014/06/09                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

/**
 *  TypeMonster is used to determine monster type. Monster type may be 
 *  used to design some fun game rules such as different skill effect,
 *  item drops. 
 */
enum TypeMonster {

    ANIMAL  ( "Animal"  ),
    HUMAN   ( "Human"   );
    
    private String monsterType;
    
    private TypeMonster ( String s )
    {
        this.monsterType = s;
    }

    @Override public
    String toString()
    {
        return  this.monsterType;
    }
}
