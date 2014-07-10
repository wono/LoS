/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : COMBAT
 *                                                                  *
 *      last modified:  2014/07/10                                  *
 *      first wrote:    2014/07/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers;

import  hero.Hero;
import  monsters.Monster;

public class Combat {

    public static void INIT ( Hero h, Monster m )
    {
        m.die();
    }

}
