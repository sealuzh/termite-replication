  public void test57()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth((-1));
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals((-1), int0);
  }
