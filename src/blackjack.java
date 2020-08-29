public class blackjack {
  public int blackjack(int a, int b) {
    if (a > 21 && b > 21) {
      return 0;
    }else if (a > b && a <= 21) {
      return a;
    } else if (b > a && b <= 21) {
      return b;
    } else if (a > b && a > 21) {
      return b;
    } else {
      return a;
    }
  }
}
