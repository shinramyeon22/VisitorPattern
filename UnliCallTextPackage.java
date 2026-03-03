public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean hasUnli) {
        if (!hasUnli) {
            return "No unlimited calls and texts package";
        }
        
        if (telcoName.equalsIgnoreCase("Globe")) {
            return "Unlimited calls and texts to Globe subscribers only";
        } 
        else if (telcoName.equalsIgnoreCase("Ditto")) {
            return "Unlimited calls and texts to all networks";
        } 
        else {
            return "No unlimited calls and texts package";
        }
    }
}