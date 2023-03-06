package task_additional;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String str = method(list);
        System.out.println(str);
    }

    public static String method(List<Integer> list) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i < list.size(); i++) {
            builder.append(" ").append(list.get(i));
        }
        
        return builder.toString();
    }
}