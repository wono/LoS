package hero;

/**
 *  Representing hero. Singletone design pattern. To get the Hero 
 *  instance invoke the method like this:
 *
 *      Hero hero = Hero.GET ();
 * 
 */
public class Hero {

    private static Hero _instance = null;
    
    //  prevents being called from outside
    private Hero ()
    {

    }
    
    public static Hero GET ()
    {
        if ( null == _instance )    _instance = new Hero ();

        return  _instance;
    }
    
    @Override
    public String toString ()
    {
        return  "The hero";
    }
}
