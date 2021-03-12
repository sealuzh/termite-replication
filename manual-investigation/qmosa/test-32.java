  public void test65()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(2258);
      assertEquals(2258, advancedSettings0.getMaxThreadsForNioWrite());
  }
