package Task5;

public class Infinity implements IntSequence{
    private int number;
    public Infinity(int i){ this.number = i; }
    @Override
    public boolean hasNext() {
        return true;
    }

    public int next(){
        return this.number;
    }

    //вернуть бесконечную последовательность

}
