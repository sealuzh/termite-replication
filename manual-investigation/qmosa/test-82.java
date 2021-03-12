  public void test2()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("U0+[#t", (String) null, "%");
      assertNull(fullProduct0);
  }
