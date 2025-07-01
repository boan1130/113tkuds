public class array_sum_trace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("加總過程：total = " + total + " + " + arr[i] + " = " + (total + arr[i]));
            total += arr[i];
        }

        System.out.println("總和為：" + total);
    }
}
 //這個程式用了一個 for 迴圈來走訪陣列，每個元素進行一次加總操作，因此：時間複雜度：  𝑂(𝑛)時間複雜度：O(n)其中 n 是陣列的長度。