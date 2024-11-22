public class Q2_SumOfAllElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0};

        //Addition Of Elements Present in an Array.

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }

}
