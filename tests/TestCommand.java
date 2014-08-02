import static java.lang.System.out;

import controllers.Command;

public class TestCommand {

    public static void main (String[] args)
    {
        out.println(Command.GET('a'));
        out.println(Command.GET('b'));
        out.println(Command.GET('c'));
        out.println(Command.GET('d'));
    }
}
