  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[1] = "nu.staldal.lagoon.core.AuthenticationMissingException";
      LagoonCLI.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }
