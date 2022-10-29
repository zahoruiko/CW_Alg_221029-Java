public class BiggestNumber {
    public static void main(String[] args) {


        int[] arr = new int[]{40, 250, 80, 88, 240, 12, 148};

        getBiggestAndLowestNumberRecursive(arr, 0, arr[0], arr[0]);
        getBiggestAndLowestNumberIterative(new int[]{40, 250, 80, 88, 240, 12, 148});
    }


    public static void getBiggestAndLowestNumberRecursive(int[] sourceArray, int index, int minValue, int maxValue) {

        if (index >= sourceArray.length - 1) {
            return;
        }

        if (sourceArray[index] > maxValue) {
            maxValue = sourceArray[index];
        }

        if (sourceArray[index] < minValue) {
            minValue = sourceArray[index];
        }

        index++;

        if (index == sourceArray.length - 1) {
            System.out.println("Min = " + minValue);
            System.out.println("Max = " + maxValue);
        } else {
            getBiggestAndLowestNumberRecursive(sourceArray, index, minValue, maxValue);
        }
    }

    public static void getBiggestAndLowestNumberIterative(int[] array) {

        int min = array[0];
        int max = array[0];

        for (int item: array){
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

}
