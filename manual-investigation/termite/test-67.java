  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("(R{1Zbt");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "(R{1Zbt");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(R{1Zbt";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
