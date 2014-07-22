package controllers;

import java.util.List;

import libraries.WConsume;

import controllers.Control;
import hero.Hero;
import maps.Room;
import monsters.Monster;

/**
 *  @author Wonho Lim
 */
public class Combat {

    public static void INIT ( Room r )
    {
        List<Skill> sL = Hero.GET().getSkillSet();
        WConsume.ONLY_IF(
            UInput.GET_KEY(            
        );
        r.getMonster().die();
        r.setMonster(null);
    }

}
