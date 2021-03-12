  public void test63()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      
      advancedSettings0.setUseDirectByteBuffer(false);
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertFalse(boolean0);
  }
