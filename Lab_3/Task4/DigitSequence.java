package Task4;

import java.util.ArrayList;

public class DigitSequence implements IntSequence{
    private int number;

    public DigitSequence(int number){ this.number = number; }

    @Override
    public boolean hasNext() {
        return this.number != 0;
    }

    public int next(){
        int result = this.number % 10;
        this.number/=10;
        return result;
    }

    public int[] of(int k, int ...values){
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(k);
        for(int val: values)
            obj.add(val);
        int[] posled = new int[obj.size()+1];
        posled[0] = k;
        for(int i=1; i<=obj.size(); i++){
            posled[i] = obj.get(i);
        }
        return posled;
    }

    public int rest(){
        return this.number;
    }
}
