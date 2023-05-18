import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Unit a = new Unit(1, 5);
        Unit b = new Unit(1, 10);
        Unit c = new Unit(1, 3);
        Unit d = new Unit(2, 1);
        List<Unit> mas = new ArrayList<>();
        mas.add(a);
        mas.add(b);
        mas.add(c);
        mas.add(d);

        mas.sort(new Test());
        for (Unit i : mas){
            System.out.println(i.toString());
        }
    }
}
