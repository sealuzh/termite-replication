  public void test30()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
