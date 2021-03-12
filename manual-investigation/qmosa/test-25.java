  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "s;GFn(q7";
      stringArray0[1] = "build";
      LagoonCLI.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }
