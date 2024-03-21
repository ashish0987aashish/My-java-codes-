// SHORTCIRCUIT OPERATOR MAY OR MAY NOT CHECK BOTH THE EXPRESSION

class Testsecondshc {

  public static void main(String[] args) {
    int a = 10, b = 15;

    if (++a < 10 && ++b > 15) {
      a++;
    }

    else {
      b++;
    }

    System.out.println(a + "********" + b);// 11********16

    int p = 10, q = 15;

    if (++p < 10 || ++q > 15) {
      p++;
    }

    else {
      q++;
    }

    System.out.println(p + "********" + q);// 12********16

    int x = 10, y = 15;

    if (++x < 10 & ++y > 15) {
      x++;
    }

    else {
      y++;
    }

    System.out.println(x + "********" + y);// 11********17

    int m = 10, n = 15;

    if (++m < 10 | ++n > 15) {
      m++;
    }

    else {
      n++;
    }

    System.out.println(m + "********" + n);// 12********16

  }

}
