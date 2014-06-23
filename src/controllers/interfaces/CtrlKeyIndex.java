/* * * * * * * * * * * * * * * * * * * * * * * *        
 *  JAVA : CTRL KEY INDEX
 *                                                                  *
 *      last modified:  2014/06/22                                  *
 *      first wrote:    2014/06/22                                  *
 *                                                                  *
 *      wono (wonho lim: wono@live.com)                             *
 *                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package controllers.interfaces;

/**
 *  All the key information to proceed user input are here.
 *
 *  Note that characters representing their keys are uppercase.
 *  Prefix naming convention:
 *      CKAR_   - Control Key that represents Attack or Run
 *      CKDR_   - Control Key that represents Direction
 */
public interface CtrlKeyIndex {

    /** Keys that represent attack and run */
    static final char CKAR_ATTACK    = 'A';
    static final char CKAR_RUN       = 'R';
       
    /** Keys that represent directions */
    static final char CKDR_EAST      = 'E';
    static final char CKDR_NORTH     = 'N';
    static final char CKDR_SOUTH     = 'S';
    static final char CKDR_WEST      = 'W';    
}
