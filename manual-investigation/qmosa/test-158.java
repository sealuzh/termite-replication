  public void test33()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      
      advancedSettings0.setPerformancePreferencesBandwidth(1);
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals(1, int0);
  }
