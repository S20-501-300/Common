package Task10;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static File[] arrayCatalog1(File dir){
//    public static ArrayList<String> arrayCatalog(File dir){
//        File[] listOfFiles = dir.listFiles();
//        ArrayList<String> files = new ArrayList<>();
//        for (int i = 0; i < listOfFiles.length; i++) {
//            if (listOfFiles[i].isDirectory()) {
//                files.add(listOfFiles[i].getName());
//            }
//        }
//        return files;
        return dir.listFiles(File::isDirectory);
    }

//    public static File[] arrayCatalog2(File dir){
//
//    }


    public static void main(String[] args) {

        File folder = new File("C:\\Users\\dimak\\IdeaProjects\\Chapter3\\src");

//        ArrayList<String> list = arrayCatalog(folder);
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

        File[] files = arrayCatalog1(folder);
        for(int i=0; i<files.length; i++){
            System.out.println(files[i].getName());
        }

//        File[] files = arrayCatalog1(folder);
//        for(int i=0; i<files.length; i++){
//            System.out.println(files[i].getName());
//        }

    }
}
