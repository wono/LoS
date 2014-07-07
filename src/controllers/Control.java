/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : CONTROL
 *                                                                  *
 *      last modified:  2014/07/06                                  *
 *      first wrote:    2014/07/06                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers;

/**
 *  Wrapper of static generic method to manipulate basic control 
 *  pattern.
 */
public class Control {

    
    public static <T> boolean MOVE ( T current, T next )
    {
        if ( null == next ) return false;
        
        current = next;     return true;        
    }

}
