  public void test2()  throws Throwable  {
      Product product0 = new Product();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/I_I_HEAVY_I.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FullProduct fullProduct0 = product0.getProduct("i", "i", "i");
      assertNotNull(fullProduct0);
  }
