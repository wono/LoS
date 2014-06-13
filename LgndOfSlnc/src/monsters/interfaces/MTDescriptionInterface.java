/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, INTERFACE : MTDESCRIPTIONINTERFACE
 *                                                                  *
 *      last modified:  2014/06/12                                  *
 *      first wrote:    2014/06/12                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters.interfaces;

/**
 *  All monster descriptions of LOS are here.
 *  It would may be replaced with external file such as XML or JASON.
 */ 
public interface MTDescriptionInterface {

    static final String MTD_ERROR_MESSAGE
        =   "An error occurs - LOS_ERROR: MS009401.";

    static final String MTD_AN_GIANT_DUCK
        =   "A fearsome beast with a hulking chest and a beak " 
        +   "dripping with the blood of it's last victim.";

    static final String MTD_AN_SQUIRREL_GOLD
        =   "A clockwork squirrel plated with pure gold.";
        
        
    static final String MTD_HM_GUN_MAN
        =   "A swashbuckling ill-do-weller of low moral fiber.";
        
    static final String MTD_HM_KNIFE_MAN
        =   "A nimble swashbuckler who invites your internal organs "
        +   "to meet his knife.";
}
