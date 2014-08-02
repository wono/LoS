import static java.lang.System.out;

import libraries.WXMLParser;
import libraries.RecordPath;

import controllers.ListDr;
import skills.Skill;
import skills.SkillList;

public class TestListDr {

    public static void main (String[] args)
    {
        // gets list object recorded from 'records/RecordSkills.xml'
        SkillList sL = WXMLParser.PULL(
            RecordPath.GET("RecordSkills"),
            SkillList.class
        );
        
        Skill s = ListDr.GET_E(sL.get());
        out.printf("%s - %s\n", s.getName(), s.getDescription());
    }
}
