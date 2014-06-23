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
 *  All the key information to control are here.
 *
 *  Note that characters representing their keys are uppercase.
 *  Prefix naming convention:
 *      CKAR_   - Control Key that represents Attack or Run
 *      CKDR_   - Control Key that represents Direction
 */

pulbic interface CtrKeyIndex {

    /** Keys that represent attack and run */
    static final String CKAR_ATACK      = 'A';
    static final String CKAR_RUN        = 'R';
       
    /** Keys that represent directions */
    static final String CKDR_EAST       = 'E';
    static final String CKDR_NORTH      = 'N';
    static final String CKDR_SOUTH      = 'S';
    static final String CKDR_WEST       = 'W';    
}
