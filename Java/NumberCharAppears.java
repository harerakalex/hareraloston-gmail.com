class NumberCharAppears {
  public int count(String s, char c) {
    int res = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c)
        res++;
    }
    return res;
  }

  public static void main(String[] args) {
    String str = "geeksforgeeks";
    char c = 'e';
    NumberCharAppears countNumber = new NumberCharAppears();
    System.out.println(countNumber.count(str, c));
  }
}