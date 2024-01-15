public class ArrayOps {
    public static void main(String[] args) {
        int arr = secondMaxValue(new int[] { 6, 9, 4, 7, 3, 4 });
        System.out.println(arr);
        boolean condition = containsTheSameElements(new int[] { 6, 1, 4, 1, 3, 7 }, new int[] { 4, 6, 4, 7, 3, 1 });
        System.out.println(condition);
        boolean condition2 = isSorted(new int[] { 2, 1, 0, 1, -2 });
        System.out.println(condition2);
    }

    public static int findMissingInt(int[] array) {
        // Write your code here:
        int count = 0;
        int missingInt = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i];
        }
        missingInt = ((array.length) * (array.length + 1)) / 2 - count;
        return missingInt;

    }

    public static int secondMaxValue(int[] array) {
        // Write your code here:
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < newarray.length; i++) {
            if (newarray[i] > max)
                max = newarray[i];
        }
        for (int i = 0; i < newarray.length; i++) {
            if (newarray[i] == max) {
                newarray[i] = Integer.MIN_VALUE;
                max = Integer.MIN_VALUE;
                break;
            }
        }
        for (int i = 0; i < newarray.length; i++) {
            if (newarray[i] > max)
                max = newarray[i];
        }
        return max;

    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count1++;
                    break;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    count2++;
                    break;
                }
            }
        }
        if ((count1 == array1.length) && (count2 == array2.length))
            return true;
        else
            return false;
    }

    public static boolean isSorted(int[] array) {
        int countup = 1;
        int countdown = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1])
                countup++;
            else
                break;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1])
                countdown++;
            else
                break;
        }
        if ((countdown == array.length) || (countup == array.length))
            return true;
        else
            return false;
    }

}
