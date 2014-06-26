/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : KEY
 *                                                                  *
 *      last modified:  2014/06/25                                  *
 *      first wrote:    2014/06/25                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers;

public class Key<T> {

    private T t;
    
    public Key ( T t )
    {
        this.t  = t;
    }

    public T get ()
    {
        return  t;
    }
}
