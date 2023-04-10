package Task1;

public class Square implements Measurable {
    private int measurable;

    public Square(int side) { this.measurable = side; }

    /**
     * Get perimeter
     * @return Square's perimeter
     */
    @Override
    public double getMeasure() {
        return 4 * this.measurable;
    }
}
