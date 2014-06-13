/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : RANDOMMONSTERGEN
 *                                                                  *
 *      last modified:  2014/06/10                                  *
 *      first wrote:    2014/06/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

import java.util.Random;

import monsters.Monster;
import monsters.interfaces.MTIndexInterface;
import monsters.animals.GiantDuck;
import monsters.animals.SquirrelGold;
import monsters.humans.GunMan;
import monsters.humans.KnifeMan;

/**
 * Randomized Monster instance generator. Notice that the generator
 * method is static - no need initilization. Within any class 
 * out here, which imports this class, call it like this:  
 *
 *          Monster m = RandomMonsterGen.GET();
 *
 */
public class RandomMonsterGen implements MTIndexInterface {
	
	private static int rnGen()
	{
		return  new Random().nextInt ( DEFAULT_MONSTER_KINDS_NUMBER );
	}
	
	public static Monster GET()
	{
		switch ( rnGen() ) {
			case MTI_ANIMAL_GIANT_DUCK: return new GiantDuck    ();
			case MTI_HUMAN_GUN_MAN:     return new GunMan       ();
			case MTI_HUMAN_KNIFE_MAN:   return new KnifeMan     ();
			default:                    return new SquirrelGold ();
		}
	}
}
