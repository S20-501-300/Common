public class Test implements MyComparator<Unit> {
    @Override
    public int compare(Unit a, Unit b){
        int MeasureCompare = a.getMeasure() - b.getMeasure();
        int SecondCompare = a.getSecond() - b.getSecond();
        return (MeasureCompare == 0) ? SecondCompare : MeasureCompare;
    }
}
