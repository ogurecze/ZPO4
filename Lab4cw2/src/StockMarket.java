import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockMarket {
    private List<Company> companies = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCompany(Company company) {
        companies.add(company);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void updateStockPrices() {
        Random random = new Random();
        for (Company company : companies) {
            int change = random.nextInt(10) - 3;
            company.setPrice(company.getPrice() + change);
        }
        notifyObservers();
    }

    public List<Company> getCompanies() {
        return companies;
    }
}

