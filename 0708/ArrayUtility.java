import java.util.Arrays;

public class ArrayUtility {

    // 方法 1: 列印陣列內容
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // 方法 2: 原地反轉陣列
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // 方法 3: 建立陣列副本
    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    // 方法 4: 找出第二大的數值
    public static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        // 1. 建立原始陣列
        int[] original = {3, 7, 1, 9, 4, 6, 8, 2, 5};
        System.out.print("原始陣列：");
        printArray(original);

        // 2. 測試 copyArray
        int[] copied = copyArray(original);
        System.out.print("複製陣列：");
        printArray(copied);

        // 3. 測試 reverseArray
        reverseArray(original);
        System.out.print("反轉後陣列：");
        printArray(original);

        // 4. 測試 findSecondLargest（用複製的原始陣列）
        int secondLargest = findSecondLargest(copied);
        System.out.println("第二大數值： " + secondLargest);
    }
}
