/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  MONSTER.ABST_JAVA
 *                                                                  *
 *      last modified:  2014/06/10                                  *
 *      first wrote:    2014/06/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

abstract class Monster {

    protected int   hp;
    
    public Monster ()
    {
        
    }

    public int attack  ()
    {
        return  new Damage ();
    }
    
    
}
