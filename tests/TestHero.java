/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : TESTHERO
 *                                                                  *
 *      last modified:  2014/06/16                                  *
 *      first wrote:    2014/06/16                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import static java.lang.System.out;

import hero.Hero;

public class TestHero {

    public static void main ( String[] args )
    {
        out.println ( "===============" );
        out.println ( "  TEST : HERO  " );
        out.println ( "===============" );

        test_instance_get ();
        
        out.println ( "\n" );
    }
    
    private static void test_instance_get ()
    {
        Hero h1 = Hero.GET ();
        Hero h2 = Hero.GET ();
        
        out.printf ( "h1 == h2 ? %s\n", 
            h1.equals ( h2 ) ? "YES" : "NO" );
        
        out.printf ( "Hero name: %s\n", Hero.GET () );
    }
}
