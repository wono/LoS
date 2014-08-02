import  java.util.HashMap;

import  controllers.Key;

import  skills.Skill;
import  skills.SMapDrive;

public class TestSMapDrive {

    public static void main ( String[] args )
    {
        HashMap<Key<Integer>, Skill<String>> map = new HashMap<> ();
        
        // mapping Keys with Skills by pseudo numbers and skill names
        for ( int i = 1; i < 10; i++ )
            SMapDrive.addSkill ( i, "skill " + i, map );
            
        SMapDrive.output ( map );
    }
}
