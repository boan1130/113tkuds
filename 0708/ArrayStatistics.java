public class ArrayStatistics {

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] numbers = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        // 2. 統計變數初始化
        int sum = 0;
        double average;
        int max = numbers[0], min = numbers[0];
        int maxIndex = 0, minIndex = 0;
        int aboveAverageCount = 0;
        int evenCount = 0, oddCount = 0;

        // 計算總和、最大值、最小值、偶數與奇數
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            sum += num;

            if (num > max) {
                max = num;
                maxIndex = i;
            }
            if (num < min) {
                min = num;
                minIndex = i;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // 計算平均值
        average = (double) sum / numbers.length;

        // 計算大於平均值的個數
        for (int num : numbers) {
            if (num > average) {
                aboveAverageCount++;
            }
        }

        // 3. 以表格形式輸出
        System.out.println("======= 陣列統計分析結果 =======");
        System.out.printf("%-20s %s\n", "總和:", sum);
        System.out.printf("%-20s %.2f\n", "平均值:", average);
        System.out.printf("%-20s %d (索引 %d)\n", "最大值:", max, maxIndex);
        System.out.printf("%-20s %d (索引 %d)\n", "最小值:", min, minIndex);
        System.out.printf("%-20s %d\n", "大於平均值的個數:", aboveAverageCount);
        System.out.printf("%-20s %d\n", "偶數個數:", evenCount);
        System.out.printf("%-20s %d\n", "奇數個數:", oddCount);
        System.out.println("================================");
    }
}
