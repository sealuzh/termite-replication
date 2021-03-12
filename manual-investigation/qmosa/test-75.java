  public void test6()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      Class<?> class0 = rIFClassLoader0.findClass("");
      assertNull(class0);
  }
