  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }
