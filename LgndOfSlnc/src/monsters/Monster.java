/* * * * * * * * * * * * * * * * * * * * * * * *
* JAVA ABSTRACT : MONSTER
* *
* last modified: 2014/06/10 *
* first wrote: 2014/06/10 *
* *
* wono (wonho lim: wono@live.com) *
* *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **/

package monsters;

import main.Engine;

public abstract class Monster {

	protected String description;
	
	
    public Monster (String desc)
    {
        description = desc;
    }

	public void describe() {
	
		Engine.outln(description);
		
	}

}