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
    
    public Monster ()
    {
        this.description = MTDescription.GET ( this );
    }
    
	public void describe () 
	{
        out.printf ( "%s\n", this.description );
	}

}
