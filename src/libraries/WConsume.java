/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : WCONSUME
 *                                                                  *
 *      last modified:  2014/07/09                                  *
 *      first wrote:    2014/07/04                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package libraries;

import  java.util.function.Predicate;
import  java.util.function.Consumer;

/**
 *  Wconsume is a set of static generic methods that are mixtures of
 *  the standard functioanl interface - Consumer with other standard 
 *  functional interfaces to simply manipulate codes that have 
 *  particular patterns that can be used by lambda expressions.
 */
public class WConsume {

    /**
     *  Only consumes if the filter condition is true.
     *
     *  @param T any type of single object
     *  @param Predicate<T> the standard functional interface
     *  @param Consumer<T> the standard functional interface
     */
    public static <T> void 
    ONLY_IF (   T o, 
                Predicate<T> filter, 
                Consumer<T> action      )
    {
        if (filter.test(o)) action.accept(o);
    }

    /**
     *  If the filter condition is true, it consumes action1. 
     *  Otherwise, it consumes action2.
     *
     *  @param T any type of single object
     *  @param Predicate<T> the standard functional interface
     *  @param Consumer<T> the standard functional interface
     */
    public static <T> void
    IF_ELSE (   T t,
                Predicate<T> filter,
                Consumer<T> action1,
                Consumer<T> action2     )
    {
        if (filter.test(t)) action1.accept(t);
        else                action2.accept(t);
    }
    
}
