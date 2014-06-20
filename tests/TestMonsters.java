/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : TESTMONSTERS
 *                                                                  *
 *      last modified:  2014/06/20                                  *
 *      first wrote:    2014/06/09                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import static java.lang.System.out;

import monsters.Monster;
import monsters.MonsterInit;
import monsters.RandomMonsterGen;

class TestMonsters {

    private static final int    TEST_TIME       = 16;

    public static void main ( String[] args )
    {
        out.println ( "===================" );
        out.println ( "  TEST : MONSTERS  " );
        out.println ( "===================" );
        out.println ();

        test_monster_init   ();
        out.println ();
        test_random_monster ();
        out.println ();
    }
    
    private static void test_monster_init ()
    {
        int     i   = 0;

        out.println ( "TEST 1 : MonsterInit" );
        out.println ( "--------------------" );
        
        while ( i++ < TEST_TIME )
            out.printf ( "%s\n", new MonsterInit() );
    }
    
    private static void test_random_monster ()
    {
        int     i   = 0;
        
        out.println ( "TEST 2 : RandomMonsterGen" );
        out.println ( "-------------------------" );
        
        while ( i++ < TEST_TIME )
            out.printf ( "%s\n", RandomMonsterGen.GET() );
    }
}
