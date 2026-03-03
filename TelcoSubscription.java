public interface TelcoSubscription {
    int getDataAllowance();
    double getPromoPrice();
    boolean getUnliCallText();
    String getTelcoName();
    
    String accept(UsagePromo visitor);
    String accept(UnliCallOffer visitor);
}