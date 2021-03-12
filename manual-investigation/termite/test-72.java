  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }
