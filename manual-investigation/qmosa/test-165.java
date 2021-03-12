  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[1];
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("0MmwhTfv`r");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "C:_3S^,bb\"q");
      stringArray0[0] = "0MmwhTfv`r";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
