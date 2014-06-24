/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : SKILL MAPPER
 *                                                                  *
 *      last modified:  2014/06/24                                  *
 *      first wrote:    2014/06/24                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import  static java.lang.System.out;

import  java.lang.reflect.Method;
import  java.lang.reflect.InvocationTargetException;
import  java.util.ArrayList;

import  skills.Skill;
import  skills.SkillMapper;
import  skills.SkillBFO;
import  skills.SkillPHA;

public class TestSkillMapper {
    
    private static final int KEY_NUM_MIN        = 1;
    
    // skills of SkillBFO
    private static final String BFO_METHOD_1    = "SWEATING";
    
    // skills of SkillPHA
    private static final String PHA_METHOD_1    = "PUNCH";
    
    public static void main ( String[] args )
        throws  IllegalAccessException,
            InvocationTargetException,
            NoSuchMethodException
    {
        out.println ( "=======================" );
        out.println ( "  TEST : SKILL MAPPER  " );
        out.println ( "=======================" );
        out.println ();
        
        test_bfo    ();    
        out.println ();
        test_pha    ();
        out.println ();
    }
    
    private static void test_bfo () throws  IllegalAccessException,
                                            InvocationTargetException,
                                            NoSuchMethodException
    {
        out.println ( "Skill Map 1 : Offensive Buffs" );
        out.println ( "-----------------------------" );
        
        // setting skill set from bfo skill name list
        SkillMapper m 
            = map_set ( SkillBFO.INSTANCE (), list_get_bfo () );
        
        // printing keys and their skills fired
        skill_fire ( skill_get ( m ) );
    }
    
    private static void test_pha () 
    throws  IllegalAccessException,
            InvocationTargetException,
            NoSuchMethodException
    {
        out.println ( "Skill Map 2 : Physical Attacks" );
        out.println ( "------------------------------" );
        
        // setting skill set from pha skill name list
        SkillMapper m 
            = map_set ( SkillPHA.INSTANCE (), list_get_pha () );
        
        // printing keys and their skills fired
        skill_fire ( skill_get ( m ) );
    }
     
    private static SkillMapper 
    map_set (   Skill               type, 
                ArrayList<String>   list    )
    throws NoSuchMethodException
    {
        int         i   = KEY_NUM_MIN;
        SkillMapper map = new SkillMapper ( type );
        
        for ( String s : list )
            map.setSkill ( i++, s );
        
        return  map;
    }
    
    private static ArrayList<Method> skill_get ( SkillMapper map ) 
    {
        ArrayList<Method> list = new ArrayList<Method> ();
        
        for ( int i = KEY_NUM_MIN; i <= map.getMap().size(); i++ )
            list.add ( map.getSkill ( i ) );
        
        return  list;
    }
    
    private static void 
    skill_fire ( ArrayList<Method> l ) 
    throws  IllegalAccessException,
            InvocationTargetException
    {
        int i = KEY_NUM_MIN;
        for ( Method m : l ) {
            out.printf  ( "A skill of key %d fire: ", i++);
            m.invoke    ( null );
        }
    }
    
    private static ArrayList<String> list_get_bfo ()
    {
        ArrayList<String> l = new ArrayList<String> ();
        
        l.add ( BFO_METHOD_1 );
        l.add ( BFO_METHOD_1 );
        l.add ( BFO_METHOD_1 );
        l.add ( BFO_METHOD_1 );
        l.add ( BFO_METHOD_1 );
        l.add ( BFO_METHOD_1 );
        l.add ( BFO_METHOD_1 );
        l.add ( BFO_METHOD_1 );
        l.add ( BFO_METHOD_1 );
        
        return  l;
    }
    
    private static ArrayList<String> list_get_pha ()
    {
        ArrayList<String> l = new ArrayList<String> ();
        
        l.add ( PHA_METHOD_1 );
        l.add ( PHA_METHOD_1 );
        l.add ( PHA_METHOD_1 );
        l.add ( PHA_METHOD_1 );
        l.add ( PHA_METHOD_1 );
        l.add ( PHA_METHOD_1 );
        l.add ( PHA_METHOD_1 );
        l.add ( PHA_METHOD_1 );
        l.add ( PHA_METHOD_1 );
        
        return  l;
    }
}
