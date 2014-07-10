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
        description = MTDescription.GET ( this );
        name        = MTName.GET        ( this );
    }

    public String getDescription()
    {
        return  description;
    }
    
    public void die ()
    {
        try {

            out.printf("%s is dead.\n", this);
            this.finalize();
            
        } catch ( Throwable e ) {
        
            e.printStackTrace();
            
        }
    }
    
    @Override
    public String toString ()
    {
        return  this.name;
    }

}
