package Task7;

import Task6.DigitSequence;

import java.util.*;

//плохо перевели, в условии "до тех пор пока"
public class LuckSort {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        boolean flag = false;
        while (!flag) {
            for (int i = 0; i < strings.size()-1; i++) {
                if (comp.compare(strings.get(i), strings.get(i+1)) > 0){
                    flag = false;
                    Collections.shuffle(strings);
                    break;
                }
                if(i==strings.size()-2)
                    flag = true;
            }
        }
    }
    public static void main(String[] args) {

        ArrayList<String> strings= new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("e");
        strings.add("d");
        //Comparator<String> comp = String::compareTo;

        luckySort(strings, String::compareTo);

        for(int i=0; i< strings.size(); i++){
            System.out.println(strings.get(i));
        }
    }




}
