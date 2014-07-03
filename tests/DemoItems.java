/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, TEST : DEMO ITEMS
 *                                                                  *
 *      last modified:  2014/07/03                                  *
 *      first wrote:    2014/07/01                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

import  static java.lang.System.out;

import  java.util.ArrayList;

import  libraries.RecordPath;
import  libraries.WXMLParser;

import  items.Item;
import  items.ItemList;

public class DemoItems {

    public static void main ( String[] args )
    {
        ItemList ls
            =   WXMLParser.PULL(
                    RecordPath.GET("RecordItems"),
                    ItemList.class
                );

        ls.get().stream()
                .forEach( 
                    i -> out.printf("Item %s's bonus point is %d\n",
                        i.getName(), i.getBonusPoint())
                );
    }

}
