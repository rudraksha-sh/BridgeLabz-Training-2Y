import java.util.Scanner;

public class Problem_4 {
    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];  // for ASCII characters

        // Count frequencies
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Count how many unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Store in 2D String array [char, frequency]
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // avoid duplicate entry
                index++;
            }
        }

        return result;
    }

    // Display Method
    public static void displayFrequency(String[][] freqTable) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("----------------------");

        for (String[] row : freqTable) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);
        displayFrequency(result);

        sc.close();
    }
}
