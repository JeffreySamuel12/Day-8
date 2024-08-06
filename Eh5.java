public class Eh5 {
    public static void main(String[] args) {
        try {
            
            int result = 10 / 0; 
            String str = null;
            System.out.println(result);
            System.out.println(str.length()); 
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic exception: " + e.getMessage());
        }
    }
}
