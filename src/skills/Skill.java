/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, ABSTRACT : SKILL
 *                                                                  *
 *      last modified:  2014/06/23                                  *
 *      first wrote:    2014/06/23                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills;

/**
 *  Skill is wrapper class that enables to access its child classes by
 *  other driver classes (e.g., SkillMapper) with polimorphical 
 *  behaviour.
 */
public abstract class Skill {

    // preventing to be initialized from outside of this family
    protected Skill () {}

}
