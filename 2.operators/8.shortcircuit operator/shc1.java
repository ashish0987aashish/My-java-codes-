class Testfirstshc {
  public static void main(String[] args) {
    double x = 5;
    if (++x > 5 && (x / 0) > 10) {
      System.out.println("Hello");
    } else {
      System.out.println("Hii");
    }

    int a = 10;
    int b = 20;
    if (++a < 10 && b / 0 > 20) {
      System.out.println("Hello");
    }

    else {
      System.out.println("Hii");
    }

  }

}

/*
 * double 5/0 is greater than 10
 * int 20/0 will show arithmetic exception
 * 
 * 
 * Output:
 * 
 * Hello
 * 
 */
