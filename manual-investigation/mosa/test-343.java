  public void test076()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      // Undeclared exception!
      try { 
        homeEnvironment0.setVideoAspectRatio(aspectRatio0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio FREE_RATIO
         //
         verifyException("com.eteks.sweethome3d.model.HomeEnvironment", e);
      }
  }
