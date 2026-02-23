/**
 * OOPSBannerApp
 * UC3: Prints OOPS in Banner Format using String.join()
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        printOOPSBanner();
    }

    // Function to print OOPS in banner format using String.join()
    public static void printOOPSBanner() {
        System.out.println(String.join("", "   **     **   ******   ****** "));
        System.out.println(String.join("", " **  ** **  ** **    ** **     "));
        System.out.println(String.join("", " **  ** **  ** **    ** **     "));
        System.out.println(String.join("", " **  ** **  ** ******   ****** "));
        System.out.println(String.join("", " **  ** **  ** **           **  "));
        System.out.println(String.join("", "   **     **   **      *******  "));
    }
}