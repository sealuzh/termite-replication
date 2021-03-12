  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      
      advancedSettings0.setSocketLinger(1);
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(1, int0);
  }
