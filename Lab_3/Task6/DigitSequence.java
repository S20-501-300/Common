package Task6;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer>{
    private int number;

    public DigitSequence(int number){ this.number = number; }

    @Override
    public boolean hasNext() {
        return this.number != 0;
    }

    public Integer next(){
        int result = this.number % 10;
        this.number/=10;
        return result;
    }

    public void remove(){}


}
