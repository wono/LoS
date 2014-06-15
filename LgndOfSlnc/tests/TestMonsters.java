/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : TESTMONSTERS
 *                                                                  *
 *      last modified:  2014/06/14                                  *
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
    private static final String TEST_DECORATION = "==";    
    private static final String TEST_PREFIX     = "TESTING......";

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
        int     l = TEST_PREFIX.length() + s.length();
        String  d = "";
        
        // halves length to minimize loops
        l   = 0 == l % 2 
            ? l / 2 
            : l / 2 + 1;
        d = decorated_bar_get ( l );
        
        out.println ( d );        
        out.println ( title_get (s) ); 
        out.println ( d );
    }
    
    /* Prints decorated line */
    private static String decorated_bar_get ( int repeatTime )
    {
        int     i = 0;
        String  d = "";
         
        while ( i++ < repeatTime )  d += TEST_DECORATION;
        
        return d;
    }
    
    /*  Returns title combined */
    private static String title_get ( String s )
    {
        return  TEST_PREFIX + s;
    }                                

}

