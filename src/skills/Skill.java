/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, ABSTRACT : SKILL
 *                                                                  *
 *      last modified:  2014/06/25                                  *
 *      first wrote:    2014/06/23                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills;

/**
 *  Representing each skill.
 */
public class Skill<T> {

    private T t;

    public Skill    ( T t )
    {
        this.t  = t;
    }
    
    public void set ( T t )
    {
        this.t  = t;
    }

    public T get  ()
    {
        return  t;
    }

    @Override
    public String toString ()
    {
        return  (String) t;
    }
}