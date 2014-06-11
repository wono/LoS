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

import static java.lang.System.out;

import src.monsters.Monster;
import src.monsters.RandomMonsterGen;

class TestMonsters {

    public static void main ( String[] args )
    {
        out.printf ("TESTING.......Monsters");
        
        out.printf ("%s\n", RandomMonsterGen.GET ());
        out.printf ("%s\n", RandomMonsterGen.GET ());
        out.printf ("%s\n", RandomMonsterGen.GET ());
        out.printf ("%s\n", RandomMonsterGen.GET ());
        out.printf ("%s\n", RandomMonsterGen.GET ());
    }
}
