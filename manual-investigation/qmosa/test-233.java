  public void test25()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      
      advancedSettings0.setSocketLinger(0);
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(0, int0);
  }
