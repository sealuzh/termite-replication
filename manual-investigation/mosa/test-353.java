  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(0);
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertFalse(theClient0.getTrusted());
  }
