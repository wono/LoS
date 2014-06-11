/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, INTERFACE : MONSTERINDEX
 *                                                                  *
 *      last modified:  2014/06/10                                  *
 *      first wrote:    2014/06/10                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters.interfaces;

/**
 *  All the monster index information of LOS are here.
 *  
 *  Note: later on, index numbers need to be re-arranged like this: 
 *      Animal  type of Monster indices:  0 to 19
 *      Human   type of Monster indices: 20 to 39
 */
public interface MonsterIndex {
    
    // default number of monsters LOS limits currently
    static final int DEFAULT_MONSTER_MAX_COUNT      = 100; 
    
    // total number of sorts of monsters LOS has currently
    static final int DEFAULT_MONSTER_KINDS_NUMBER   = 4;

    // total number of monster types LOS has currently
    static final int DEFAULT_MONSTER_TYPES_NUMBER   = 2;
    
    // monster indices
    static final int MI_ANIMAL_GIANT_DUCK       =  0;
    static final int MI_ANIMAL_SQUIRREL_GOLD    =  1;
    static final int MI_HUMAN_GUN_MAN           =  2;
    static final int MI_HUMAN_KNIFE_MAN         =  3;
}
