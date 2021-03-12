  public void test33()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(3324);
      assertEquals(3324, advancedSettings0.getMaxThreadsForNioWrite());
  }
