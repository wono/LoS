/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : TESTMONSTERS
 *                                                                  *
 *      last modified:  2014/06/10                                  *
 *      first wrote:    2014/06/09                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package tests;

import java.lang.StackTraceElement;
import static java.lang.System.out;

import src.monsters.Monster;
import src.monsters.RandomMonsterGen;

class TestMonsters {

    public static void main ( String[] args )
    {
        out.printf ("======================\n");
        out.printf ("TESTING.......Monsters\n");
        out.printf ("======================\n");

        test_random_monster ();
    }

    private static void test_random_monster ()
    {
        int i = 0;
        while ( i++ < 32 )
            out.printf ("TESTING......test_random_monster:\t%s\n", 
                RandomMonsterGen.GET());
    }        

}
