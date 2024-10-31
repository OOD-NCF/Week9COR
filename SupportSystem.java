public class SupportSystem {
    private static SupportHandler setupChain() {
        SupportHandler tier1 = new Tier1Support();
        SupportHandler tier2 = new Tier2Support();
        SupportHandler tier3 = new Tier3Support();

        // Set up the chain of responsibility
        tier1.setNextHandler(tier2);
        tier2.setNextHandler(tier3);

        return tier1; // Return the start of the chain
    }

    public static void main(String[] args) {
        SupportHandler supportChain = setupChain();

        // Test requests with different severity levels
        SupportRequest request1 = new SupportRequest("Password reset request", 1);
        SupportRequest request2 = new SupportRequest("Account access issue", 2);
        SupportRequest request3 = new SupportRequest("System outage in production", 3);

        supportChain.handleRequest(request1);  // Expected to be handled by Tier 1
        supportChain.handleRequest(request2);  // Expected to be handled by Tier 2
        supportChain.handleRequest(request3);  // Expected to be handled by Tier 3
    }
}