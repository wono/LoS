/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : MTDESCRIPTION
 *                                                                  *
 *      last modified:  2014/06/12                                  *
 *      first wrote:    2014/06/12                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

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
 *      String description = MTDescription::GET( aMonsterInstance );
 *  
 *  For extending more descriptions, you need:
 *      1.  Add descriptions into MTDescriptionInterface
 *      2.  Modify this class's GET() method by adding monster class 
 *          that you created.
 */
public class MTDescription implements MTDescriptionInterface {

    // preventing initialization from outside
    private MTDescription () {}
    
    // returns corresponding moster descriptions, or an error message 
    public static String GET (Monster m)
    {
        if ( m instanceof GiantDuck     ) returns MTD_AN_GIANT_DUCK; 
        if ( m instanceof SquirrelGold  ) returns MTD_AN_SQUIRREL_GOD;
        if ( m instanceof GunMan        ) returns MTD_HM_GUN_MAN;
        if ( m instanceof KnifeMan      ) returns MTD_HM_KNIFE_MAN;
        
        returns MTD_ERROR_MESSAGE;
    }

}
