import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        System.out.println("2024503543 Risah Ruth R");
        Scanner ip = new Scanner(System.in);
        String a;
        System.out.println("Enter the String");
        a = ip.nextLine();
        char[] arr = a.toCharArray();
        int[] freq = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            freq[i] = 0;
            for (int j = 0; j < a.length(); j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                }
            }
        }
        System.out.println("The characters and their frequencies are:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(arr[i] + "-" + freq[i]);
        }
    }

}
