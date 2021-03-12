  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
