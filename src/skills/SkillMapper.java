/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : SKILL MAPPER
 *                                                                  *
 *      last modified:  2014/06/24                                  *
 *      first wrote:    2014/06/23                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills;

import  java.lang.reflect.Method;
import  java.util.HashMap;

import  java.lang.reflect.InvocationTargetException;

/**
 *  Skill Mapper is a core program that enables to map a skill set 
 *  with a key set. It can be used to map each skill set such as 
 *  SkillBFD, SkillBFO, and SkillPHA with numeric indices, that is 
 *  Integer type, respectively. 
 *  
 *  The mapping with numeric indices are 
 *  flexible and customizable. It means that this class can also be 
 *  used for some customization related to skill set. In instance, it 
 *  can be used to add a feature that user can customize skill set 
 *  with arbitary numeric keys. It would also be used as a key tool 
 *  for designing an adanced game system such as Hero leveling system 
 *  - adding or upgrading skill set along with level up.
 *
 *  Please note that the caller of the method - setSkill() requires to 
 *  specify following exception types to throw:
 *      java.lang.IllegalAccessException,
 *      java.lang.NoSuchMethodException,
 *      java.lang.reflect.InvocationTargetException
 */
public class SkillMapper {

    // a class type that extends Skill class
    private Class<? extends Skill>      sType;
    
    private HashMap<Integer, Method>    map;

    public SkillMapper ( Skill s )
    {
        if ( s instanceof SkillBFO )
            this.sType  = SkillBFO.class;
        
        if ( s instanceof SkillBFD )
            this.sType  = SkillBFD.class;
        
        if ( s instanceof SkillPHA )
            this.sType  = SkillPHA.class;
        
        // only allowing initialization of HashMap to concrete classes
        if ( s.getClass() != Skill.class )
            this.map    = new HashMap<Integer, Method> ();
    }
    
    public HashMap<Integer, Method> getMap ()
    {
        return  this.map;
    }
    
    public Method getSkill ( int key )
    {
        return  this.map.get(key);
    }
    
    public void setSkill ( int key, String skillName ) 
    throws NoSuchMethodException
    {
        map.put ( key, sType.getMethod ( skillName ) );
    }
}
