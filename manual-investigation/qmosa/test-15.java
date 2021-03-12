  public void test3()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct((String) null, "", "2BMSycgfC*iTWYVauz");
      assertNull(fullProduct0);
  }
