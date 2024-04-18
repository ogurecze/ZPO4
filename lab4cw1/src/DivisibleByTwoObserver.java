public class DivisibleByTwoObserver implements Observer {
    private int count = 0;

    public void update(int number) {
        if (number % 2 == 0) {
            count++;
        }
    }

    public void displayCount() {
        System.out.println("Final count of numbers divisible by 2: " + count);
    }
}