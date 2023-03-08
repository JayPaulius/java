public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    
    enum MarketState {
        ComeMarket, 
        LeftMarket
    }

    private MarketState marketState;

    public Buyer(String name) {
        this.name = name;
        marketState = MarketState.LeftMarket;
    }

    abstract String getName();


    public MarketState getMarketState() {
        return marketState;
    }

    public void setMarketState(MarketState marketState) {
        this.marketState = marketState;
    }
}
