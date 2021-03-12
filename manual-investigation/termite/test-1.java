  public void test0()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "i", "");
      assertNull(fullProduct0);
  }
