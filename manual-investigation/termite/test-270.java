  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(1785);
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(1785, int0);
  }
