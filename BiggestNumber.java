public class BiggestNumber {
    public static void main(String[] args) {

        // Source array
        int[] arr = new int[]{40, 250, 80, 88, 240, 12, 148};

        getBiggestAndLowestNumberRecursive(arr, 0, arr[0], arr[0]);
        getBiggestAndLowestNumberIterative(arr);
    }


    public static void getBiggestAndLowestNumberRecursive(int[] sourceArray, int index, int minValue, int maxValue) {

        if (index < 0 || index > sourceArray.length - 1) {
            return;
        }

        if (sourceArray[index] > maxValue) {
            maxValue = sourceArray[index];
        }

        if (sourceArray[index] < minValue) {
            minValue = sourceArray[index];
        }

        if (index == sourceArray.length - 1) {
            System.out.println("Min = " + minValue);
            System.out.println("Max = " + maxValue);
        } else {
            index++;
            getBiggestAndLowestNumberRecursive(sourceArray, index, minValue, maxValue);
        }
    }

    public static void getBiggestAndLowestNumberIterative(int[] sourceArray) {

        int minValue = sourceArray[0];
        int maxValue = sourceArray[0];

        for (int item: sourceArray){
            if (item > maxValue) {
                maxValue = item;
            }
            if (item < minValue) {
                minValue = item;
            }
        }

        System.out.println("Min = " + minValue);
        System.out.println("Max = " + maxValue);
    }

}
