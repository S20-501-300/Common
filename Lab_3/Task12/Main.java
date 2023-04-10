package Task12;

import java.io.File;
import java.util.Arrays;


public class Main {
    public static void arrayCatalog1(File[] files){


        Arrays.sort(files, (first, second) -> {
            boolean isFile1 = first.isFile();
            boolean isFile2 = second.isFile();
            if(isFile1 != isFile2) {
                if (isFile2) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return first.compareTo(second);
        });
    }




    public static void main(String[] args) {

        File folder = new File("C:\\Users\\dimak\\IdeaProjects\\Chapter3\\src");
        File[] files = folder.listFiles();
        arrayCatalog1(files);

        for(int i=0; i<files.length; i++){
            System.out.println(files[i].getName());
        }


    }
}
