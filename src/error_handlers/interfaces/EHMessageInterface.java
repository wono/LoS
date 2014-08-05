package error_handlers.interfaces;

/**
 *  For now, it is used to prefix error messages of each module.
 *  Later on, it would be used as library that holds more specific 
 *  and user-friendly error messages for all the modules.
 */       
public interface EHMessageInterface {

    static final String EH_MSG_PREFIX
        = "An error occurs - LoS ERROR: ";
}
