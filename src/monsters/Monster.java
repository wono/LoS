/* * * * * * * * * * * * * * * * * * * * * * * *
 *  JAVA ABSTRACT : MONSTER
 *                                                                  *
 *      last modified:  2014/06/14                                  *
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
     *  preventing to be initialized from outside of this family. 
     *  Use either RandomMonsterGen.GET() to get its concrete instance 
     *  or new MonsterInit() to process a concrete instance with some 
     *  house-keeping play.
     */
    protected Monster ()
    {
        this.description    = MTDescription.GET ( this );
        this.name           = MTName.GET        ( this );
    }

    public void describe () 
    {
        out.printf ( "%s\n", this.description );
    }
    
    @Override
    public String toString ()
    {
        return  this.name;
    }

}
