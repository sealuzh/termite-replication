  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[13];
      stringArray0[1] = "fzkre";
      LagoonCLI.main(stringArray0);
      assertEquals(13, stringArray0.length);
  }
