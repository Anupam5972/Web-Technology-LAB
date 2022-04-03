public class Q4 {
    public static void main(String[] args) {
        String[] s = { "abc", "123", null, "xyz" };
        for (int i = 0; i <= s.length; i++) {
            try {
                int a = s[i].length() + Integer.parseInt(s[i]);
                int c = a / 0;
            } catch (ArithmeticException e) {
                System.out.println("\nArithmeticException will be caught here");
            } catch (NumberFormatException e) {
                System.out.println("\nNumberFormatException will be caught here");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArrayIndexOutOfBoundsException will be caught here");
            } catch (NullPointerException e) {
                System.out.println("\nNullPointerException will be caught here");
            } catch (Exception e) {
                System.out.println("\nhandled the exception (outer catch)\n");
            }
        }
    }
}