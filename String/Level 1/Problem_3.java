import java.util.Scanner;

public class Problem_3 {
    static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) arr[i] = str.charAt(i);
        return arr;
    }
    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] arr1 = customToCharArray(text);
        char[] arr2 = text.toCharArray();
        System.out.println("Are Arrays Equal: " + compareArrays(arr1, arr2));
        sc.close();
    }
}
