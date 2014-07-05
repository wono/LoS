/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : WPROCESS
 *                                                                  *
 *      last modified:  2014/07/04                                  *
 *      first wrote:    2014/07/04                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package libraries;

import  java.util.function.Predicate;
import  java.util.function.Consumer;

/**
 *  Wrapper of static method for generics with lambda expression
 */
public class WProces {

    /**
     *  @param T any type of single object
     *  @param Predicate<T> functional interface
     *  @param Consumer<T> functional interface
     */
    public static <T> void 
    WITH_FILTER (   T o, 
                    Predicate<T> filter, 
                    Consumer<T> action      )
    {
        if (filter.test(o)) action.accept(o);
    }
}
