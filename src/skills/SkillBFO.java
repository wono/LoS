/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : SKILL BFO
 *                                                                  *
 *      last modified:  2014/06/24                                  *
 *      first wrote:    2014/06/21                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills;

import  static java.lang.System.out;

import  skills.interfaces.SkillName;

/**
 *  Offensive Buff Skill set. To use a skill from the outside where 
 *  imports this class, call the method like this:
 *
 *      SkillBFO.A_SKILL_METHOD_NAME ();
 *
 *  For now, each skill returns integer that dosen't mean nothing. 
 *  Later on, it would be modified to return an Object or special type 
 *  to effect something interesting.
 */
public class SkillBFO   extends     Skill
                        implements  SkillName {

    private static SkillBFO instance = null;
    
    // preventing to be initialize from outside
    public SkillBFO () {}
    
    // singletone    
    public static SkillBFO INSTANCE ()
    {
        if ( null == instance )
            instance = new SkillBFO ();
            
        return instance;
    }
    
    /**
     *  Sweats monsters near Hero. If the monster is listenable that 
     *  is Human type, they get a chance to be scared.
     */
    public static int SWEATING ()
    {
        out.printf ( "H*** c*** m**** f*****!! F*** o**!!\n" );
        
        return  1;
    }
}
