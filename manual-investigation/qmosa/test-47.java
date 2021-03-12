  public void test4()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "$C", "1");
      assertNull(fullProduct0);
  }
