/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : TESTMONSTERS
 *                                                                  *
 *      last modified:  2014/06/12                                  *
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

    private static int      TEST_TIME       = 16;
    private static String   TEST_DECORATION = "==";    
    private static String   TEST_PREFIX     = "TESTING......";

    public static void main ( String[] args )
    {
        test_monster_init   ();
        test_random_monster ();
    }
    
    private static void test_monster_init ()
    {
        int     i   = 0;

        print_title ( "MonsterInit" );

        while ( i++ < TEST_TIME )
            out.printf ( "%s\n", new MonsterInit() );
    }
    
    private static void test_random_monster ()
    {
        int     i   = 0;
        
        print_title ( "RandomMonsterGen" );
        
        while ( i++ < TEST_TIME )
            out.printf ( "%ss\n", RandomMonsterGen.GET() );
    }
    
    private static void print_title ( String s )
    {
        int l   = TEST_PREFIX.length() + s.length();
        
        // halves length to minimize loops
        l   = 0 == ( TEST_PREFIX.length() + s.length() ) % 2
            ? l / 2 
            : l / 2 + 1;
                    
        print_decoration    ( l );
        out.println         ( title_get (s) ); 
        print_decoration    ( l );
    }
    
    /* Prints decorated line */
    private static void print_decoration ( int repeatTime )
    {
        int i = 0;
        while ( i++ < repeatTime )  out.print ( TEST_DECORATION );
        out.println();
    }
    
    /*  Returns title combined */
    private static String title_get ( String s )
    {
        return  TEST_PREFIX + s;
    }                                

}
