public class MyClass {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    // ReverseArray obj = new ReverseArray();
    int[] res = ReverseArray.arrayReverse(arr);
    for (int i = 0; i < res.length; i++)
      System.out.println(res[i]);
    System.out.println("Hello World");
  }
}