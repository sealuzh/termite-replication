  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("REnl-{ns");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "targetURL");
      stringArray0[0] = "REnl-{ns";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
