import  static java.lang.System.out;

import java.util.ArrayList;

import libraries.RecordPath;

import items.Item;
import items.ItemList;

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
