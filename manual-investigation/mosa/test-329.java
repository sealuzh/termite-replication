  public void test23()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry((-1));
      int int0 = theClient0.getMaxAuthTry();
      assertEquals((-1), int0);
  }
