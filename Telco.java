public class Telco implements TelcoSubscription {
    private int dataAllowance;
    private double promoPrice;
    private boolean unliCallText;
    private String telcoName;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public String accept(UsagePromo visitor) {
        return visitor.showAllowance(this.telcoName, this.promoPrice);
    }

    @Override
    public String accept(UnliCallOffer visitor) {
        return visitor.showUnliCallsTextOffer(this.telcoName, this.unliCallText);
    }
}