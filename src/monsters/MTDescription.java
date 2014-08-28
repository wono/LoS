package monsters;

import error_handlers.EHMessage;
import error_handlers.types.TEHMonsters;

import monsters.interfaces.MTDescriptionInterface;
import monsters.animals.GiantDuck;
import monsters.animals.SquirrelGold;
import monsters.humans.GunMan;
import monsters.humans.KnifeMan;

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
 *
 *  @author Wonho Lim
 */
public class MTDescription implements MTDescriptionInterface {

    // preventing initialization from outside
    private MTDescription () {}

    /** 
     *  Returns corresponding moster descriptions. Otherwise, prints 
     *  eorror message then exits.
     */
    public static String GET ( Monster m )
    {
        if ( m instanceof GiantDuck     ) return MTD_AN_GIANT_DUCK; 
        if ( m instanceof SquirrelGold  ) return MTD_AN_SQUIRREL_GOLD;
        if ( m instanceof GunMan        ) return MTD_HM_GUN_MAN;
        if ( m instanceof KnifeMan      ) return MTD_HM_KNIFE_MAN;

        EHMessage.PRINT ( TEHMonsters.TEMS0301 );
        System.exit (1);

        // never will happen
        return null;
    }

}
