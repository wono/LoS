/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : TESTUINPUT
 *                                                                  *
 *      last modified:  2014/07/12                                  *
 *      first wrote:    2014/07/12                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import static java.lang.System.out;

import controllers.UInput;
import controllers.types.TPrmpt;

public class TestUInput {

    public static void main(String[] args)
    {
        out.println("=================");
        out.println("  TEST : UINPUT  ");
        out.println("=================");
        
        out.println(
            Character.getNumericValue(
                UInput.GET_KEY(TPrmpt.KEY_SKILLS))
        );
    }
}
