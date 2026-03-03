public class OOPSBannerApp {
    public static void main(String[] args) {
        // Define String Array variable to hold the OOPS banner lines
        String[] lines = {
            String.join(" ", " *** ", " *** ", " *** ", " *** "),   // Top row
            String.join(" ", "** **", "** **", "** **", "** **"),   // Row 2
            String.join(" ", "** **", "** **", "** **", "** **"),   // Row 3
            String.join(" ", "** **", "** **", " *** ", " *** "),   // Row 4
            String.join(" ", "** **", "** **", "**    ", "   **"),  // Row 5
            String.join(" ", "** **", "** **", "**    ", "**   "),  // Row 6
            String.join(" ", " *** ", " *** ", "**    ", " *** ")   // Bottom row
        };

        // Print each line of the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}