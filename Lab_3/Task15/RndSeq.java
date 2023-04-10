package Task15;

import Task5.IntSequence;

import java.util.Random;

public class RndSeq {

    private static Random generator = new Random();
    class RandomSequence implements IntSequence {
        int low;
        int high;
        Random generator;
        public RandomSequence(int low, int high, Random generator){ this.generator = generator; this.low = low; this.high = high; }

        public int next() { return low + generator.nextInt(high - low +1); }
        public boolean hasNext(){ return true; }
    }
    public IntSequence randomInts(int low, int high) {

        return new RandomSequence(low, high, generator);
    }
}
