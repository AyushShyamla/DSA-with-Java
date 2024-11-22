public class Q1_IteratingOverEachElements {
    public static void main(String[] args) {

        //Iterating Over Each element and Printing Their Values.

        int[] arr = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        //Using Advance For Each Loop.
        for(int elements: arr){
            System.out.print(elements);
        }
    }
}