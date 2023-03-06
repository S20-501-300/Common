package task_additional;

import java.util.Arrays;

// import java.util.Arrays;
// import java.util.List;

public class Main {
    public static String method(int[] arr, int size){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i=0; i < size; i++) {
            if (i > 0)
                builder.append(", ");
                
            builder.append(arr[i]);
        }
        builder.append("]");
        
        return builder.toString();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String str= method(arr, 4);
        System.out.println(str);
        System.out.println(Arrays.toString(arr));
    }
}
