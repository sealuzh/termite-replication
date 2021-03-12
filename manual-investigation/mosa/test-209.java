  public void test50()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      
      advancedSettings0.setByteBufferSize(1);
      assertEquals(1, advancedSettings0.getByteBufferSize());
  }
