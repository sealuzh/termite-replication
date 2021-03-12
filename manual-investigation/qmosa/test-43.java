  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, theClient0.getTimeout());
  }
