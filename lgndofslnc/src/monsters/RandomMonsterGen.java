/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : RANDOMMONSTERGEN
 *                                                                  *
 *      last modified:  2014/06/10                                  *
 *      first wrote:    2014/06/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package src.monsters;

import java.util.Random;

import src.monsters.interfaces.MonsterIndex;

import src.monsters.animals.GiantDuck;
import src.monsters.animals.SquirrelGold;

import src.monsters.humans.GunMan;
import src.monsters.humans.KnifeMan;

/**
 *  Randomized Monster instance generator. Use this like this:
 *      
 */
public class RandomMonsterGen implements MonsterIndex {
    
    private static int rnGen ()
    {
        return  new Random().nextInt ( DEFAULT_MONSTER_KINDS_NUMBER );
    }
    
    public static Monster GET ()
    {
        switch ( rnGen() ) {
            case MI_ANIMAL_GIANT_DUCK:  return  new GiantDuck    ();
            case MI_HUMAN_GUN_MAN:      return  new GunMan       ();
            case MI_HUMAN_KNIFE_MAN:    return  new KnifeMan     ();
            default:                    return  new SquirrelGold ();
        }
    }
}
