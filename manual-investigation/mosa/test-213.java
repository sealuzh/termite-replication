  public void test25()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertTrue(theClient0.getCommunicationLogging());
      
      theClient0.setCommunicationLogging(false);
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(boolean0);
  }
