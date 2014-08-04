package controllers.interfaces;

/**
 *  All the key information to proceed user input are here.
 *
 *  Note that characters representing their keys are uppercase.
 *  Prefix naming convention:
 *      CKAR_   - Control Key that represents Attack or Run
 *      CKDR_   - Control Key that represents Direction
 *      CKNB_   - Control Key Number
 */
public interface CtrlKeyIndex {

    /** Keys that represent attack and run */
    static final char   CKAR_ATTACK     = 'A';
    static final char   CKAR_RUN        = 'R';
       
    /** Keys that represent directions */
    static final char   CKDR_EAST       = 'E';
    static final char   CKDR_NORTH      = 'N';
    static final char   CKDR_SOUTH      = 'S';
    static final char   CKDR_WEST       = 'W';

    /** Numeric keys that are mapped with skills and items */
    static final int    CKNB_1          = 1;
    static final int    CKNB_2          = 2;
    static final int    CKNB_3          = 3;
    static final int    CKNB_4          = 4;
    static final int    CKNB_5          = 5;
    static final int    CKNB_6          = 6;
    static final int    CKNB_7          = 7;
    static final int    CKNB_8          = 8;
    static final int    CKNB_9          = 9;
    static final int    CKNB_0          = 0;
}
