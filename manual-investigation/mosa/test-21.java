  public void test04()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".?!e map.xml";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
