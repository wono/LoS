/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA, INTERFACE : PROMPTMESSAGE
 *                                                                  *
 *      last modified:  2014/07/11                                  *
 *      first wrote:    2014/06/18                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers.interfaces;

/**
 *  All the messeges prompting the user input are here.
 */

public interface PromptMessage {

    static final String PMSG_PREFIX
        = "Hero, we need your decision";
        
    static final String PMSG_ATTACK_RUN
        = "Attack or Run";
        
    static final String PMSG_DIRECTIONS
        = "Where to go";
    
    static final String PMSG_KEY_SKILLS
        = "What skill to use";
}
