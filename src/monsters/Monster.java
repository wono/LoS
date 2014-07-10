/* * * * * * * * * * * * * * * * * * * * * * * *
 *  JAVA ABSTRACT : MONSTER
 *                                                                  *
 *      last modified:  2014/07/10                                  *
 *      first wrote:    2014/06/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

import  static java.lang.System.out;

public abstract class Monster {

    protected String description;
    protected String name;
    
    /**
     *  Preventing to be initialized from outside of this family. 
     *  Please use RandomMonsterGen.GET() to get its concrete 
     *  instance instead.
     */
    protected Monster ()
    {
        this.description    = MTDescription.GET ( this );
        this.name           = MTName.GET        ( this );
    }

    public void describe () 
    {
        out.printf("%s.\n", this.description);
    }
    
    public void die ()
    {
        out.printf("%s is dead.\n", this);
        this = null;
    }
    
    @Override
    public String toString ()
    {
        return  this.name;
    }

}
