/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : ITEM LIST
 *                                                                  *
 *      last modified:  2014/07/01                                  *
 *      first wrote:    2014/07/01                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package items;

import  java.util.List;

import  javax.xml.bind.annotation.XmlElement;
import  javax.xml.bind.annotation.XmlElementWrapper;
import  javax.xml.bind.annotation.XmlRootElement;

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
