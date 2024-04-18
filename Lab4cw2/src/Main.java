public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.addCompany(new Company("FunnyCompanyName", 100));
        market.addCompany(new Company("UnfunnyCompanyName", 200));
        market.addCompany(new Company("RacistCompanyName", 50));

        Display display = new Display(market);

        for (int i = 0; i < 10; i++) {
            market.updateStockPrices();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
