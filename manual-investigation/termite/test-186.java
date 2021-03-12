  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(4692);
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(4692, int0);
  }
