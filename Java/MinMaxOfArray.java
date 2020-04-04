class MinMaxOfArray {
  public static int[] minAndMax(int[] arr) {
    int[] newArray = new int[2];
    int min = arr[0], max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] <= min) {
        min = arr[i];
      } else if (arr[i] >= max) {
        max = arr[i];
      }
    }
    newArray[0] = min;
    newArray[1] = max;
    return newArray;
  }

  public static void main(String[] args) {
    int[] arr = { 102, 24, 33, 41, 50 };
    int[] res = minAndMax(arr);
    // System.out.println(res);
    for (int i = 0; i < res.length; i++)
      System.out.println(res[i]);
    System.out.println();
  }
}