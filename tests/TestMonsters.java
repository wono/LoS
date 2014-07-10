/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : TESTMONSTERS
 *                                                                  *
 *      last modified:  2014/07/09                                  *
 *      first wrote:    2014/06/09                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import static java.lang.System.out;

import maps.Room;
import monsters.Monster;
import monsters.RandomMonsterGen;

class TestMonsters {

    private static final int    TEST_TIME       = 16;

    public static void main ( String[] args )
    {
        out.println ( "===================" );
        out.println ( "  TEST : MONSTERS  " );
        out.println ( "===================" );
        out.println ();

        test_random_monster();
        out.println();
        
        test_monsters_with_rooms();
        out.println();
    }
    
    private static void test_random_monster ()
    {
        int     i   = 0;
        
        out.println ( "TEST 1 : RandomMonsterGen" );
        out.println ( "-------------------------" );
        
        while ( i++ < TEST_TIME )
            out.printf ( "%s\n", RandomMonsterGen.GET() );
    }

    private static void test_monsters_with_rooms ()
    {
        int     i   = 0;

        out.println ( "TEST 2 : MonsterWithRooms" );
        out.println ( "-------------------------" );
        
        while ( i++ < TEST_TIME ) {
            out.printf ( "%s\n", new Room().getMonster());
        }
    }
}
