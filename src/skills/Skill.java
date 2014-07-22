package skills;

import  javax.xml.bind.annotation.XmlRootElement;

/**
 *  @author Wonho Lim
 */
@XmlRootElement ( name = "SkillList" )
public class Skill {

    private int     power;
    private String  description;
    private String  name;
    
    public Skill () {}
    
    public Skill ( String name, String description, int power  )
    {
        this.name           = name;
        this.description    = description;
        this.power          = power; 
    }

    public void setPower        ( int i     ) { power         = i; }
    public void setDescription  ( String s  ) { description   = s; }
    public void setName         ( String s  ) { name          = s; }
    
    public int      getPower        () { return power;          }
    public String   getDescription  () { return description;    }
    public String   getName         () { return name;           }
    
    @Override
    public String toString ()
    {
        return  name;
    }
}
