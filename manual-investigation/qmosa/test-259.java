  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(1559);
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(1559, int0);
  }
