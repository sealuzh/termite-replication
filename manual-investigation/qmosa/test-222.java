  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(0);
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertTrue(theClient0.getCommunicationLogging());
  }
