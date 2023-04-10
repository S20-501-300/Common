package Task13;

import java.io.File;

public class Main {
    static Runnable runWithRun(Runnable ...tasks){
        return () -> {
            for(Runnable task : tasks){
                task.run();
            }
        };
    }

    public static void main(String[] args){
        Runnable r1 = () -> System.out.println("first");
        Runnable r2 = () -> System.out.println("second");
        Runnable r3 = () -> System.out.println("third");
        Runnable r4 = () -> System.out.println("fourth");

        runWithRun(r1, r2, r3, r4).run();
    }
}
