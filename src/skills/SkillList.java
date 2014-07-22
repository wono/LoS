package skills;

import  java.util.List;

import  javax.xml.bind.annotation.XmlElement;
import  javax.xml.bind.annotation.XmlRootElement;

/**
 *  @author Wonho Lim
 */
@XmlRootElement
public class SkillList {

    @XmlElement ( name = "skill" )
    private List<Skill> list;
    
    public void set ( List<Skill> l )
    {
        list = l;
    }
    
    public List<Skill> get ()
    {
        return  list;
    }
    
}

