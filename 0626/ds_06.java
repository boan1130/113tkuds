public class ds_06 {
    public static void main(String[] args) {
        
        int[] numbers = {3, 7, 2, 9, 1, 6, 4, 8, 5, 10};

       
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        
        System.out.println("陣列所有元素的總和為：" + sum);
    }
}
