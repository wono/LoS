/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : SKILL MAPPER
 *                                                                  *
 *      last modified:  2014/06/23                                  *
 *      first wrote:    2014/06/23                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills;

import  static java.lang.System.out;

import  java.lang.reflect.Method;
import  java.util.HashMap;

import  java.lang.reflect.InvocationTargetException;

/**
 *  Skill Mapper is a core program that enables to map a skill set 
 *  with a key set.
 *
 *  Note that the caller of this method set requires to throws the 
 *  following exception types:
 *      java.lang.IllegalAccessException,
 *      java.lang.NoSuchMethodException,
 *      java.lang.reflect.InvocationTargetException
 */
public class SkillMapper {

    private static Class<Skill> s = Skill.class;
    private static HashMap<Integer, Method> map
        = new HashMap<Integer, Method>;

    // preventing to be initialized
    private SkillMapper () {}
    
    public static HashMap<Integer, Method> GET_MAP ()
    {
        return  map;
    }
    
    public static Method GET_SKILL ( int key )
    {
        return  map.get(key);
    }
    
    public static void 
    SET_SKILL ( int key, String skillName )
    throws NoSuchMethodException
    {
        map.put ( key, s.getMethod ( skillName ) );
    }
}
