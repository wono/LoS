/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : ListDr
 *                                                                  *
 *      last modified:  2014/07/12                                  *
 *      first wrote:    2014/07/12                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers;

import java.util.List;

import controllers.types.TPrmpt;

/**
 *  ListDr is a driver class to manipulates list of elements with 
 *  numeric user input as their keys such as list of skills or items.
 *
 *  @author Wonho Lim (wono@live.com)
 */
public class ListDr {

    // Prevents being initialized.
    private ListDr () {}
    
    /**
     *  GET_E is a static generic method that prompts numeric input 
     *  from user with respective prompt message and returns 
     *  corresponding element of the list only if the numeric input is 
     *  valid. In case that the input is invalid, it prompts again 
     *  recursively.
     */
    public static <T> T GET_E ( List<T> ls )
    {
        int i = Character.getNumericValue(
            UInput.GET_KEY(TPrmpt.KEY_SKILLS)
        );
        
        return  0 <= i && i < ls.size()
            ?   ls.get(i)
            :   GET_E(ls);
    }
}
