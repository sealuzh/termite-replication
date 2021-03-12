  public void test2()  throws Throwable  {
      Product product0 = new Product();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_HEAVY_NULL.XML");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FullProduct fullProduct0 = product0.getProduct((String) null, (String) null, (String) null);
      assertNotNull(fullProduct0);
  }
