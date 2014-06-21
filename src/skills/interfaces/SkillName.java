/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, INTERFACE : SKILL NAME
 *                                                                  *
 *      last modified:  2014/06/21                                  *
 *      first wrote:    2014/06/21                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills.interfaces;

/**
 *  All the skill names which are string type are here.
 *
 *  Prefix naming convention:
 *      NBFD_   - Deffensive buff
 *      NBFO_   - Offensive buff
 *      NPHA_   - Phiscial attack
 */
public interface SkillName {
        
    /** Buffs - Offensive */
    static final String NBFO_SWEATING
        = "Sweating";

    /** Physical attacks */
    static final String NPHA_PUNCH
        = "Punch";
}       
