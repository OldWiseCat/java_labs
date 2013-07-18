/**
 * Created with IntelliJ IDEA.
 * User: kuraev
 * Date: 12.07.13
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
public class NoSuchArgumentException extends Exception{
    public String argument;
    NoSuchArgumentException(String argument) {
        super("No argument named \"" + argument + "\" found");
        this.argument = argument;
    }
}
