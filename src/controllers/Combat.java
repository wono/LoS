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

import java.util.List;

import libraries.WConsume;

import controllers.Control;
import hero.Hero;
import maps.Room;
import monsters.Monster;

public class Combat {

    public static void INIT ( Room r )
    {
        List<Skill> sL = Hero.GET().getSkillSet();
        WConsume.ONLY_IF(
            
        );
        r.getMonster().die();
        r.setMonster(null);
    }

}
