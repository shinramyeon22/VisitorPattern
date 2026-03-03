public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double price) {
        return telcoName + " ₱" + String.format("%.0f", price) + 
               " per month with data allowance.";
    }
}