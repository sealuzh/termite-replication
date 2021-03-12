  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "", "");
      assertNull(fullProduct0);
  }
