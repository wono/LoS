package monsters;

/**
 *  TypeMonster is used to determine monster type. Monster type may be 
 *  used to design some fun game rules such as different skill effect,
 *  item drops. 
 *
 *  @author Wonho Lim
 */
enum TypeMonster {

    ANIMAL  ( "Animal"  ),
    HUMAN   ( "Human"   );
    
    private String monsterType;
    
    private TypeMonster ( String s )
    {
        this.monsterType = s;
    }

    @Override 
    public String toString()
    {
        return  this.monsterType;
    }
}
