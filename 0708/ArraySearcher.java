public class ArraySearcher {

    // 2. 實作 findElement 方法
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // 找到回傳索引
            }
        }
        return -1; // 沒找到回傳 -1
    }

    // 4. 實作 countOccurrences 方法
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] numbers = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        // 5. 測試搜尋數字 67 和 100
        int target1 = 67;
        int target2 = 100;

        int index1 = findElement(numbers, target1);
        int count1 = countOccurrences(numbers, target1);
        System.out.println("搜尋數字 " + target1 + " 的結果：");
        if (index1 != -1) {
            System.out.println("找到於索引位置: " + index1);
            System.out.println("出現次數: " + count1);
        } else {
            System.out.println("未找到");
        }

        int index2 = findElement(numbers, target2);
        int count2 = countOccurrences(numbers, target2);
        System.out.println("\n搜尋數字 " + target2 + " 的結果：");
        if (index2 != -1) {
            System.out.println("找到於索引位置: " + index2);
            System.out.println("出現次數: " + count2);
        } else {
            System.out.println("未找到");
        }
    }
}
