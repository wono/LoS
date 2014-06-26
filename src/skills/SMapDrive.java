/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : SMAP DRIVE
 *                                                                  *
 *      last modified:  2014/06/25                                  *
 *      first wrote:    2014/06/25                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills;

import  static java.lang.System.out;
import  java.util.Map;

import  controllers.Key;

/**
 *  Skill Map driver class. Enables to map a skill with a key board 
 *  key. It will replace SkillMapper class.
 */
public class SMapDrive {

    public static <K, S> void
    addSkill ( K k, S s, Map<Key<K>, Skill<S>> map )
    {
        Key<K>      key     = new Key<K>    ( k );
        Skill<S>    skill   = new Skill<S>  ( s );        
        map.put ( key, skill );
    }
    
    public static <K, S> void output ( Map<Key<K>, Skill<S>> map )
    {
        for ( Key k : map.keySet() )
        {
            out.printf ( "Key [#%d]\tSkill [%s]\n", 
                k.get(), map.get(k) );
        }
    }
}
