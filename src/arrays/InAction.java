package arrays;

public class InAction {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
        //exercise8();
        exercise9();
        //exercise10();

    }

    public static void exercise1() {
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};

        int[] arr3 = new int[10];
        int indexCounter = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (!isInArray(arr1[i], arr2)) {
                arr3[indexCounter] = arr1[i];
                indexCounter++;
            }
        }

        printArray(arr3);
    }

    public static void exercise2() {
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};

        int[] arr3 = new int[10];
        int indexCounter = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (!isInArray(arr1[i], arr2) && !isInArray(arr1[i], arr3)) {
                arr3[indexCounter] = arr1[i];
                indexCounter++;
            }
        }

        printArray(arr3);
    }

    public static void exercise3() {
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};

        int[] arr3 = new int[10];
        int indexCounter = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (!isInArray(arr2[i], arr1)) {
                arr3[indexCounter] = arr2[i];
                indexCounter++;
            }
        }

        printArray(arr3);
    }

    public static void exercise4() {
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};

        int[] arr3 = new int[10];
        int indexCounter = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (!isInArray(arr2[i], arr1) && !isInArray(arr2[i], arr3)) {
                arr3[indexCounter] = arr2[i];
                indexCounter++;
            }
        }

        printArray(arr3);
    }

    public static void exercise5() {
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};

        int[] arr3 = new int[10];
        int indexCounter = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (!isInArray(arr1[i], arr2) && !isInArray(arr1[i], arr3)) {
                arr3[indexCounter] = arr1[i];
                indexCounter++;
            }
        }
        for (int i = 0; i < arr2.length - 1; i++) {
            if (!isInArray(arr2[i], arr1) && !isInArray(arr2[i], arr3)) {
                arr3[indexCounter] = arr2[i];
                indexCounter++;
            }
        }
        printArray(arr3);
    }

    public static void exercise6() {
        int[] arr = {1, 2, 5, 1, 6, 1, 5, 4, 8};
        int[] res = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (!isInArray(arr[i], res)) {
                res = newWithAdd(arr[i], res);
            }
        }
        printArray(res);
    }

    public static void exercise7() {
        int[] arr = {6, 8, 4, 2, 7, 5};
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[arr.length - 1 - i] = arr[i];
        }

        printArray(res);
    }

    public static void exercise8() {
        int[] arr = {1, 2, 5, 1, 6, 1, 5, 4, 8};

        // TODO
        /*
         * IMPORTANT to resolve it!!!
         * Bubble sorting
         * expected result  [1,1,1,2,4,5,5,6,8]
         */
    }

    public static void exercise9() {
        int[] arr = {1, 2, 0, 1, 9, 0, 0, 0, 0};
        int res = 0;

        int indexToFind = arr.length - 1;
        for (; indexToFind > 0; indexToFind--) {
            if (arr[indexToFind] != 0) break;
        }

        for (int i = 0; i <= indexToFind; i++) {
            res = res * 10;
            res += arr[i];
        }

        System.out.println("Result: " + res);

    }

    public static void exercise10() {
        int[] arr = {1, 2, 5, 1, 6, 1, 5, 4, 8};

        int[] res = new int[3];
        res[0] = Integer.MIN_VALUE;
        res[1] = Integer.MAX_VALUE;

        for (int n:arr) {
            res[0] = Math.max(n, res[0]);
            res[1] = Math.min(n, res[1]);
            if(n == 1) res[2]++;
        }

        printArray(res);
    }


    /**
     * @param n   number to include
     * @param arr source array
     * @return new array with n within
     */
    public static int[] newWithAdd(int n, int[] arr) {
        int[] res = new int[arr.length + 1];
        if (arr.length - 1 >= 0) System.arraycopy(arr, 0, res, 0, arr.length);
        res[arr.length] = n;
        return res;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            String tmp = (i == arr.length - 1) ? arr[i] + "" : arr[i] + ",";
            System.out.print(tmp);
        }
        System.out.print("]");
    }

    public static boolean isInArray(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return true;
        }
        return false;
    }


    public static int getIndex(int n, int[] arr) {
        int res = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == n) return i;
        }
        return res;
    }
}
