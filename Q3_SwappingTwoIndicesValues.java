import java.util.Arrays;

public class Q3_SwappingTwoIndicesValues {
    public static void main(String[] args) {
        //Swapping Values of Two Indices in given Array.

        int[] arr = {1, 2, 3, 4, 5};
        Swap(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }


     public  static void Swap(int[] arr, int Index1, int Index2) {
        int temp = arr[Index1];
        arr[Index1] =arr[Index2];
        arr[Index2] = temp;
        }

    }

