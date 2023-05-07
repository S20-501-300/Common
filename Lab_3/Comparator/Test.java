public class Test implements MyComparator<Unit> {
    @Override
    public int compare(Unit a, Unit b){
        return a.getMeasure() - b.getMeasure();
    }

}
