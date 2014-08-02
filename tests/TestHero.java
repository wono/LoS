import static java.lang.System.out;

import hero.Hero;

public class TestHero {

    public static void main ( String[] args )
    {
        out.println ( "===============" );
        out.println ( "  TEST : HERO  " );
        out.println ( "===============" );
        out.println ();
        test_instance_get ();
        out.println ();
    }
    
    private static void test_instance_get ()
    {
        Hero h1 = Hero.GET ();
        Hero h2 = Hero.GET ();
        
        out.println ( "TEST 1 : Hero Instance ( Singletone )" );
        out.println ( "-------------------------------------" );
        out.println ( "Hero h1 = Hero.GET ()" );
        out.println ( "Hero h2 = Hero.GET ()" );
        out.println ();

        out.printf  ( "h1 == h2 ? %s\n",
            h1.equals ( h2 ) ? "YES" : "NO" );
        out.println ();
        
        out.printf ( "Hero name: %s\n", Hero.GET () );
    }
}
