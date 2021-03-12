  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "fo";
      LagoonCLI.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }
