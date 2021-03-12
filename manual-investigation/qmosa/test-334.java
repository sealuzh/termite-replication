  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
