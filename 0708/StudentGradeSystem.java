public class StudentGradeSystem {

    // 方法：根據分數回傳等級
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    // 方法：顯示完整成績報告
    public static void printGradeReport(int[] scores) {
        int total = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;

        // 計算總分與統計等級、最高與最低
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            total += score;

            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            char grade = getGrade(score);
            switch (grade) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
        }

        double average = (double) total / scores.length;

        // 計算高於平均的學生數
        int aboveAverageCount = 0;
        for (int score : scores) {
            if (score > average) aboveAverageCount++;
        }
        double aboveAvgRatio = (double) aboveAverageCount / scores.length * 100;

        // 輸出標題與統計摘要
        System.out.println("========== 學生成績等級報告 ==========");
        System.out.printf("學生總數：%d\n", scores.length);
        System.out.printf("平均分數：%.2f\n", average);
        System.out.printf("最高分：%d（學生 %d）\n", max, maxIndex + 1);
        System.out.printf("最低分：%d（學生 %d）\n", min, minIndex + 1);
        System.out.printf("等級分布：A=%d, B=%d, C=%d, D=%d\n", countA, countB, countC, countD);
        System.out.printf("高於平均的人數比例：%.1f%%\n", aboveAvgRatio);
        System.out.println("=====================================");

        // 輸出詳細列表
        System.out.println("學生編號\t分數\t等級");
        System.out.println("-----------------------------");
        for (int i = 0; i < scores.length; i++) {
            char grade = getGrade(scores[i]);
            System.out.printf("%4d\t\t%3d\t %c\n", i + 1, scores[i], grade);
        }
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        // 1. 學生成績陣列
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};

        // 2. 顯示成績報告
        printGradeReport(scores);
    }
}
