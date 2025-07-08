public class GradeProcessor {
    public static void main(String[] args) {
        // 1. 建立成績陣列
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};

        // 2. 計算總分與平均分數
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;

        // 3. 找出最高分與最低分及其索引
        int max = grades[0], min = grades[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }
            if (grades[i] < min) {
                min = grades[i];
                minIndex = i;
            }
        }

        // 4. 計算超過平均分的人數
        int aboveAverageCount = 0;
        for (int grade : grades) {
            if (grade > average) {
                aboveAverageCount++;
            }
        }

        // 5. 輸出結果
        System.out.println("總分: " + sum);
        System.out.printf("平均分數: %.2f\n", average);
        System.out.println("最高分: " + max + "（索引: " + maxIndex + "）");
        System.out.println("最低分: " + min + "（索引: " + minIndex + "）");
        System.out.println("超過平均分的人數: " + aboveAverageCount);

        System.out.println("\n所有學生成績：");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生 " + (i + 1) + ": " + grades[i]);
        }
    }
}
