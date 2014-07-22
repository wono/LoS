package items;

import  java.util.List;

import  javax.xml.bind.annotation.XmlElement;
import  javax.xml.bind.annotation.XmlElementWrapper;
import  javax.xml.bind.annotation.XmlRootElement;

/**
 *  @author Wonho Lim
 */
@XmlRootElement
public class ItemList {
    
    @XmlElement ( name = "item" )
    private List<Item> list;
    
    public void set ( List<Item> l )
    {
        list = l;
    }

    public List<Item> get ()
    {
        return  list;
    }
}
