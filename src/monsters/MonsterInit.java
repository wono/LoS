/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : MONSTERINIT
 *                                                                  *
 *      last modified:  2014/06/10                                  *
 *      first wrote:    2014/06/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

import static java.lang.System.out;

import monsters.Monster;
import monsters.RandomMonsterGen;

/**
 *  Neat, and easy going monster initialization. Within any room, just 
 *  call it like this:
 *
 *      new MonsterInit ();
 *
 *  You would get random monster object with their description 
 *  printing out.
 */

public class MonsterInit {

    public MonsterInit ()
    {
        Monster m = RandomMonsterGen.GET();
        
        m.describe();
    }
}
