import java.util.logging.Level;
import java.util.logging.Logger;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class PoorDrivingRecordException extends Exception {
    public PoorDrivingRecordException(String message) {
        super(message);
    }
}

class HealthIssueException extends Exception {
    public HealthIssueException(String message) {
        super(message);
    }
}
class PolicyApplication {
    private int age;
    private boolean hasPoorDrivingRecord;
    private boolean hasHealthIssues;

    public PolicyApplication(int age, boolean hasPoorDrivingRecord, boolean hasHealthIssues) {
        this.age = age;
        this.hasPoorDrivingRecord = hasPoorDrivingRecord;
        this.hasHealthIssues = hasHealthIssues;
    }

    public void validateAge() throws InvalidAgeException {
        if (age < 18 || age > 75) {
            throw new InvalidAgeException("Invalid age for insurance policy: " + age);
        }
    }

    public void validateDrivingRecord() throws PoorDrivingRecordException {
        if (hasPoorDrivingRecord) {
            throw new PoorDrivingRecordException("Poor driving record detected.");
        }
    }

    public void validateHealthRecords() throws HealthIssueException {
        if (hasHealthIssues) {
            throw new HealthIssueException("Health issues detected.");
        }
    }

    public void processApplication() throws InvalidAgeException, PoorDrivingRecordException, HealthIssueException {
        validateAge();
        validateDrivingRecord();
        validateHealthRecords();
        System.out.println("Policy application processed successfully.");
    }
}


public class Ehr1 {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        PolicyApplication application = new PolicyApplication(20, false, true);

        try {
            application.processApplication();
        } catch (InvalidAgeException | PoorDrivingRecordException | HealthIssueException e) {
            logger.log(Level.SEVERE, "Error processing policy application: " + e.getMessage());
        }
    }
}

