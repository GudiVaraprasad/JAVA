import java.util.*;
// Maximum Number for 3 integers input
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in .next();
        String s2 = in .next();
        String s3 = in .next();

        String numStr = s1 + s2 + s3;
        int num = Integer.parseInt(numStr);

        Int_to_array(num);

    }

    static void Int_to_array(int n) {
        int j = 0, temp = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while (n != 0) {
            arr[len - j - 1] = n % 10;
            n = n / 10;
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] < arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
