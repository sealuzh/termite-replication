  public void test0()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("$%@5.A&!-{\"!", "", (String) null);
      assertNull(fullProduct0);
  }
