public class NumberSubject implements Subject {
    private Observer observer;

    public void attach(Observer o) {
        this.observer = o;
    }

    public void detach(Observer o) {
        this.observer = null;
    }

    public void notifyObservers(int number) {
        if (observer != null) {
            observer.update(number);
        }
    }

    public void displayFinalCount() {
        if (observer != null) {
            observer.displayCount();
        }
    }
}
