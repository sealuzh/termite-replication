  public void test3()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("Hw@)h", "Hw@)h", "o0zr(\"*");
      assertNull(fullProduct0);
  }
