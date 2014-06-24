/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : SKILL PHA
 *                                                                  *
 *      last modified:  2014/06/24                                  *
 *      first wrote:    2014/06/21                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills;

import  static java.lang.System.out;

import  skills.interfaces.EffectPHA;
import  skills.interfaces.SkillName;

/**
 *  Physical Attack Skill set. To use a skill from the outside where 
 *  imports this class, call the method like this:
 *
 *      SkillPHA.A_SKILL_METHOD_NAME ();
 */
public class SkillPHA   extends     Skill 
                        implements  EffectPHA,
                                    SkillName   {
    
    private static SkillPHA instance = null;

    // reventing to be initialized from outside
    private SkillPHA () {}
    
    // singleton
    public static SkillPHA INSTANCE ()
    {
        if ( null == instance )
            instance = new SkillPHA ();
        
        return instance;
    }
    
    /**
     *  Punches a monster. Returns the damage.
     */
    public static int PUNCH ()
    {
        out.printf ( "%s!\n", NPHA_PUNCH );
        
        return  EPHA_PUNCH;
    }
}
