  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3iawd,24";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("3iawd,24");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "3iawd,24");
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
