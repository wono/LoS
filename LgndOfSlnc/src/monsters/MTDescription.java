/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : MTDESCRIPTION
 *                                                                  *
 *      last modified:  2014/06/14                                  *
 *      first wrote:    2014/06/12                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

import  error_handlers.EHMessage;

import  monsters.interfaces.MTDescriptionInterface;
import  monsters.animals.GiantDuck;
import  monsters.animals.SquirrelGold;
import  monsters.humans.GunMan;
import  monsters.humans.KnifeMan;

/**
 *  Monster description handler. Notice that the method to get 
 *  description from outside method is static. To get description 
 *  from outside of this class call this method like this: 
 *
 *      String description = MTDescription.GET( aMonsterInstance );
 *  
 *  For extending more descriptions, you need:
 *      1.  Add descriptions into MTDescriptionInterface
 *      2.  Modify this class's GET() method by adding monster class 
 *          that you created.
 */
public class MTDescription implements MTDescriptionInterface {

    // preventing initialization from outside
    private MTDescription () {}

    // returns corresponding moster descriptions, or null 
    public static String GET ( Monster m )
    {
        if ( m instanceof GiantDuck     ) return MTD_AN_GIANT_DUCK; 
        if ( m instanceof SquirrelGold  ) return MTD_AN_SQUIRREL_GOLD;
        if ( m instanceof GunMan        ) return MTD_HM_GUN_MAN;
        if ( m instanceof KnifeMan      ) return MTD_HM_KNIFE_MAN;

        EHMessage.PRINT ( m ); System.exit (1);

        // never will happen
        return null;
    }

}
