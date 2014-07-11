/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : SKILL LIST
 *                                                                  *
 *      last modified:  2014/07/11                                  *
 *      first wrote:    2014/07/11                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package skills;

import  java.util.List;

import  javax.xml.bind.annotation.XmlElement;
import  javax.xml.bind.annotation.XmlRootElement;

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

