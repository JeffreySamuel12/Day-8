

import java.util.*;
class FraudulentClaimException extends RuntimeException {
    public FraudulentClaimException(String message) {
        super(message);
    }
}

class InvalidClaimAmountException extends RuntimeException {
    public InvalidClaimAmountException(String message) {
        super(message);
    }
}


public class Ehr2 {

    public void processClaim(double claimAmount, String claimDate, double policyCoverage, String policyEndDate) {
        
        if (claimAmount <= 0 || claimAmount > policyCoverage) {
            throw new InvalidClaimAmountException("Invalid claim amount: " + claimAmount);
        }

        
        if (claimDate.compareTo(policyEndDate) > 0) {
            throw new FraudulentClaimException("Claim date is after policy end date: " + claimDate);
        }

        
        System.out.println("Claim processed successfully.");
    }

    public static void main(String[] args) {
        ClaimProcessingSystem cps = new ClaimProcessingSystem();

        try {
            cps.processClaim(50000, "2024-08-01", 10000, "2024-12-31");
        } catch (FraudulentClaimException | InvalidClaimAmountException e) {
            System.out.println("Exception: " + e.getMessage());
            
            notifyClaimsDepartment(e.getMessage());
        }
    }

    private static void notifyClaimsDepartment(String message) {
        System.out.println("Notification to claims department: " + message);
    }
}
