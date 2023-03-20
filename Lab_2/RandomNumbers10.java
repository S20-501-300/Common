import java.util.ArrayList;
import java.util.Random;
public class RandomNumbers10 {
    int number;

    RandomNumbers10(){ this.number=1;}
    int randomElement(int []arr){
        if(arr.length == 0)
            return 0;
        else{
            Random random = new Random();
            int i = random.nextInt() % arr.length;
            return arr[i];
        }
    }

    int randomElementList(ArrayList<Integer> arr){
        if(arr.size() == 0)
            return 0;
        else{
            Random random = new Random();
            int i = random.nextInt() % arr.size();
            return arr.get(i);
        }
    }
    //хз, почему, покачену
}
