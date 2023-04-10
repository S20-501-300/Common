package Task11;

import javax.xml.stream.FactoryConfigurationError;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Main {
    public static String[] arrayCatalog1(File dir, String ext){
        return dir.list((dir1, name) -> {
            File file = new File(dir1, name);
            return file.isFile() && file.getName().endsWith(ext);
        });
    }



    public static void main(String[] args) {

        File folder = new File("C:\\Users\\dimak\\IdeaProjects\\Chapter3\\src");
        String[] files = arrayCatalog1(folder, "html");
        for(int i=0; i<files.length; i++){
            System.out.println(files[i]);
        }

    }
}
