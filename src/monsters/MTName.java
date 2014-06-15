/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : MTNAME
 *                                                                  *
 *      last modified:  2014/06/15                                  *
 *      first wrote:    2014/06/15                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

import  error_handlers.EHMessage;
import  error_handlers.types.TEHMonsters;

import  monsters.interfaces.MTNameInterface;
import  monsters.animals.GiantDuck;
import  monsters.animals.SquirrelGold;
import  monsters.humans.GunMan;
import  monsters.humans.KnifeMan;

/**
 *  Monster name handler. Notice that the method to get name from 
 *  outside of this class is static. To get a name of monster from the 
 *  outside, call the method like this:
 *
 *      String name = MTName.GET ( aMonsterInstance );
 *
 */
public class MTName implements MTNameInterface {

    // prevents being initialized
    private MTName () {}

    /** 
     *  Returns corresponding monster name. Otherwise, prints error 
     *  then exit.
     */
    public static String GET ( Monster m )
    {
        if ( m instanceof GiantDuck    ) return MTN_AN_GIANT_DUCK;
        if ( m instanceof SquirrelGold ) return MTN_AN_SQUIRREL_GOLD;
        if ( m instanceof GunMan       ) return MTN_HM_GUN_MAN;
        if ( m instanceof KnifeMan     ) return MTN_HM_KNIFE_MAN;
        
        EHMessage.PRINT ( TEHMonsters.TEMS0401 );
        System.exit (1);
        
        // never happens
        return null;
    }
}
