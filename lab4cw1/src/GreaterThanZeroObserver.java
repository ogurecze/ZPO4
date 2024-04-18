public class GreaterThanZeroObserver implements Observer {
    private int count = 0;

    public void update(int number) {
        if (number > 0) {
            count++;
        }
    }

    public void displayCount() {
        System.out.println("Final count of numbers > 0: " + count);
    }
}
