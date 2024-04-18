public class Display implements Observer {
    private StockMarket stockMarket;

    public Display(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        this.stockMarket.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Updated Stock Prices:");
        for (Company company : stockMarket.getCompanies()) {
            System.out.println(company.getName() + ": $" + company.getPrice());
        }
    }
}
