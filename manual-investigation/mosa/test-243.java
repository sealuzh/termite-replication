  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(624);
      int int0 = theClient0.getTimeout();
      assertEquals(624, int0);
  }
