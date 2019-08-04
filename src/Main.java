import java.util.Scanner;

public class Main {

    public static int[] findArray() {
        int data[] = null;
        Scanner sc = new Scanner(System.in);
        System.out.println(" 排列长度:");
        int arraySize = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println(" 选择的排列:");
        String array = sc2.nextLine();
        char[] charArray = array.toCharArray();
        for (int i = 1; i < (array.length() - 1) / 2; i++) {
            data[i] = Integer.valueOf(charArray[i]);
        }
        return data;
    }


    public static int[] stringSort(String[] s) {
        int data[] = null;
        data = StringToInt(s);
        return getSortX_D(data);
    }

    public static int[] StringToInt(String[] s) {
        int[] ints = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }
        return ints;
    }

    public static int[] getSortX_D(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (isOdd(array, i, j)) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static boolean isOdd(int[] array, int i, int j) {
        if (((array[i] + array[j]) % 2) != 0) { //奇数
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String[] s = new String[]{"53941", "38641", "31525", "75864", "29026", "12199", "83522", "58200", "64784", "80987"};
        int[] result = stringSort(s);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
