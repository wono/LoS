package items;

import  javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement ( name = "ItemList" )
public class Item {

    private int     bonusPoint;
    private String  name;
    
    public void setBonusPoint ( int p )
    {
        bonusPoint = p;
    }

    public void setName ( String n )
    {
        name = n;
    }
    
    public int getBonusPoint ()
    {
        return  bonusPoint;
    }
    
    public String getName ()
    {
        return  name;
    }
}
