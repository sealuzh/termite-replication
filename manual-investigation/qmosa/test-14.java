  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("0MmwhTfv`r");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "targetURL");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "0MmwhTfv`r";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
