public class EqualThreeObserver implements Observer {
    private int count = 0;

    public void update(int number) {
        if (number == 3) {
            count++;
        }
    }

    public void displayCount() {
        System.out.println("Final count of numbers = 3: " + count);
    }
}
