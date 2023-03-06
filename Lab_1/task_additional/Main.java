package task_additional;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        try {
            String str = method(list, 10);
            System.out.println(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());   
        }
    }

    public static String method(List<Integer> list, int size) throws IllegalArgumentException {
        if (size > list.size()) {
            throw new IllegalArgumentException("list size smaller than desired size");
        }

        StringBuilder builder = new StringBuilder();
        for (int i=0; i < size; i++) {
            builder.append(" ").append(list.get(i));
        }
        
        return builder.toString();
    }
}