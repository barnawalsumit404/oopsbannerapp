/**
 * OOPSBannerApp
 * UC2: Prints OOPS in Banner Format using * and spaces
 * @author Sumit
 * @version 2.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        printOOPSBanner();
    }

    // Function to print OOPS in banner format
    public static void printOOPSBanner() {
        String[] banner = {
            " ***   ***   ****   **** ",
            "*   * *   * *    * *     ",
            "*   * *   * *    * *     ",
            "*   * *   * ****   **** ",
            "*   * *   * *          *",
            " ***   ***  *     ****  "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}