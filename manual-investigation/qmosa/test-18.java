  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }
