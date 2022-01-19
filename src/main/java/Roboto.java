import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Roboto {

    public String responder(String frase){

        Pattern pattern = Pattern.compile("Que tiempo hace en (?<ciudad>\\w+)\\?");
        Matcher matcher = pattern.matcher(frase);
        if(matcher.find()){
            return "Te vas a " +matcher.group("ciudad")+ " y lo miras.";
        }
        return "Hola humano!";
    }

}
