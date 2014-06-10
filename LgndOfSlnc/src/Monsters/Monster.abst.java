/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, ABSTRACT : MONSTER
 *                                                                  *
 *      last modified:  2014/06/09                                  *
 *      first wrote:    2014/06/09                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package los.lgndofslnc.src.monsters;

/**
 *  Proto type of every monster in LOS.
 *
 *  TypeMonster     is defined in TypeMonster.java.
 */
public abstract class Monster {

    protected String        name;
    protected TypeMonster   type;
    protected int           hp;
    protected int           level;
    
    abstract int attack     ();
    abstract int describe   ();
    abstract int die        ();

}
