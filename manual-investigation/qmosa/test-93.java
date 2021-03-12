  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "force.xml";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
