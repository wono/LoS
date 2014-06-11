/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : MONSTERINIT
 *                                                                  *
 *      last modified:  2014/06/10                                  *
 *      first wrote:    2014/06/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package src.monsters;

import static java.lang.System.out;

import src.monsters.Monster;
import src.monsters.RandomMonsterGen;

/**
 *  Neat, and easy going monster initialization. Within any room, just 
 *  it, then you would get random monster object with their 
 *  description printing out.
 */

public class MonsterInit {

    public MonsterInit ()
    {
        Monster m = RandomMonsterGen.GET();
        
        m.describe ();
    }
}
