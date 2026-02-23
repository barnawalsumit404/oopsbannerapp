/**
 * OOPSBannerApp
 * UC4: Render OOPS as Banner using String Array and Loop
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        printOOPSBanner();
    }

    // Function to print OOPS in banner format using String Array + Loop
    public static void printOOPSBanner() {
        // Store all banner lines in a String array
        String[] bannerLines = {
            String.join("", "   **     **   ******   ****** "),
            String.join("", " **  ** **  ** **    ** **     "),
            String.join("", " **  ** **  ** **    ** **     "),
            String.join("", " **  ** **  ** ******   ****** "),
            String.join("", " **  ** **  ** **           **  "),
            String.join("", "   **     **   **       ******  ")
        };

        // Use enhanced for loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}