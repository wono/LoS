package error_handlers.types;

/**
 *  All the error types for monsters module are here.
 */
public enum TEHMonsters {
    TEMS0401 ("TEMS0401"),
    TEMS0301 ("TEMS0301");
    
    private String t;
    
    private TEHMonsters (String s)
    {
        this.t = s;
    }
    
    @Override
    public String toString ()
    {
        return  this.t;
    }
}
