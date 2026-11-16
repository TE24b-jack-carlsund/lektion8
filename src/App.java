import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {

    public void Main() {
        Djur[] djuren = new Djur[5];

        djuren[0] = new Katt();
        djuren[1] = new Katt();
        djuren[2] = new Katt();
        djuren[3] = new Katt();
        djuren[4] = new Katt();

        for (Djur f: djuren)
        {
            if (f instanceof Katt t)
            {
                t.leka("Garn nystan");
            }
            else if (f instanceof Hund h)
            {
                h.spåra("Kanin");
            }
            else if (f instanceof Mus m)
            {
                 m.klättra();
            }
        }
        
    }

}
