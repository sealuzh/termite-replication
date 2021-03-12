  public void test65()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      
      advancedSettings0.setMaxThreadsForNioWrite(0);
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals(0, int0);
  }
