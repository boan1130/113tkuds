package finalexam;

import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] qtys = new int[n];

        
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            names[i] = parts[0];
            qtys[i] = Integer.parseInt(parts[1]);
        }

       
        for (int i = 1; i < n; i++) {
            int keyQty = qtys[i];
            String keyName = names[i];
            int j = i - 1;

            while (j >= 0 && qtys[j] < keyQty) {
                qtys[j + 1] = qtys[j];
                names[j + 1] = names[j];
                j--;
            }

            qtys[j + 1] = keyQty;
            names[j + 1] = keyName;
        }

        
        int limit = Math.min(n, 10);
        for (int i = 0; i < limit; i++) {
            System.out.println(names[i] + " " + qtys[i]);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：使用插入排序法對 n 筆資料進行排序，最壞情況下每一項都需要與前面所有項目比較與移動，因此時間複雜度為 O(n²)。
 */

