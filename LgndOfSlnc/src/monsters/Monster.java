/* * * * * * * * * * * * * * * * * * * * * * * *
 *  JAVA ABSTRACT : MONSTER
 *                                                                  *
 *      last modified:  2014/06/11                                  *
 *      first wrote:    2014/06/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

import  static java.lang.System.out;

public abstract class Monster {

	public void describe () 
	{
        out.printf ( "%s\n", MTDescription.GET ( this );
	}

}
