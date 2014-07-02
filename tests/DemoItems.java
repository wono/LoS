/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : DEMO ITEMS
 *                                                                  *
 *      last modified:  2014/07/01                                  *
 *      first wrote:    2014/07/01                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import  static java.lang.System.out;

import  java.net.URI;
import  java.nio.file.Path;
import  java.nio.file.Paths;
import  java.util.ArrayList;

import  libraries.WXMLParser;
import  items.Item;
import  items.ItemList;

public class DemoItems {

    private static final String PATH 
        = URI.create("../records/RecordItems.xml")
            .normalize().getPath();

        
    public static void main ( String[] args )
    {
        int i = 0;
        
        ItemList ls
            = WXMLParser.PULL(PATH, ItemList.class);

        for ( Item it : ls.get() ) {
            out.printf ("Item #%d - %s (bonus point: %d)\n",
                ++i, it.getName(), it.getBonusPoint());
        }
        
    }

}
