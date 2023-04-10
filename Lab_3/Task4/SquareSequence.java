package Task4;

import java.util.ArrayList;

public class SquareSequence implements IntSequence{
    private int i;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        this.i++;
        return this.i * this.i;
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

}
