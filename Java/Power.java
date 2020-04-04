class Power {
  public int power(int num, int exponent) {
    int pow = 1;
    for (int i = 0; i < exponent; i++) {
      pow = pow * num;
    }
    return pow;
  }

  public static void main(String[] args) {
    // int res = power(2, 1);
    Power res = new Power();
    System.out.println(res.power(2, 3));
  }
}