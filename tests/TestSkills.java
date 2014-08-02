import  static java.lang.System.out;

import  skills.SkillBFO;
import  skills.SkillPHA;

public class TestSkills {

    public static void main ( String[] args )
    {
        out.println ( "=================" );
        out.println ( "  TEST : SKILLS  " );
        out.println ( "=================" );
        out.println ();
        
        test_bfo ();
        out.println ();
        
        test_pha ();
        out.println ();
    }
    
    private static void test_bfo ()
    {
        out.println ( "TEST 1 : Offensive Buffs" );
        out.println ( "------------------------" );
        
        SkillBFO.SWEATING ();   
    }
    
    private static void test_pha ()
    {
        out.println ( "TEST 2 : Physical Attacks" );
        out.println ( "-------------------------" );
        
        out.printf ( "Punch Damage: %d\n", SkillPHA.PUNCH () );
    }
}


