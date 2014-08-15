import  static java.lang.System.out;

import  skills.SkillList;

public class DemoSkills {

    public static void main ( String[] args )
    {
        SkillList ls = WXMLParser.PULL(
            "../records/RecordSkills.xml",
            SkillList.class
        );
        
        ls.get().stream()
                .forEach(
                    i -> out.printf("Skill %s - %s, power is %d\n",
                        i.getName(),
                        i.getDescription(), 
                        i.getPower())
                );
    }
}
