  public void test61()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      theClient0.getClientEventHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
