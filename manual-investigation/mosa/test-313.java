  public void test46()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("</performance-preferences-latency>\n");
      assertEquals("</performance-preferences-latency>\n", advancedSettings0.getClientIdentifier());
  }
