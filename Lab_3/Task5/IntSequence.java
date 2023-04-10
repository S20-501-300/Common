package Task5;

public interface IntSequence {
    default boolean hasNext(){
        return true;
    };
    int next();
//    int[] of(int k, int ...values);
    static IntSequence constant(int i){
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return i;
            }
        };
    }

    static IntSequence constant2(int i){
        return () -> i;
    }

}