public class ReverseArray {
  public static int[] arrayReverse(int[] arr) {
    int[] reversedArray = new int[arr.length];
    for (int i = arr.length - 1, j = 0; j < arr.length; j++, i--) {
      reversedArray[j] = arr[i];
    }
    return reversedArray;
  }
}