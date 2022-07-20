public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int croppedMiddle() {
        int max = -1, cm, sum = 0;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
            sum += sale;
        }
        long min = max;
        for (int sale : sales) {
            if (sale < min) {
                min = (int) sale;
            }
        }
        cm = (int) ((sum - (min + max))/ (sales.length - 2));
        return cm;
    }
}