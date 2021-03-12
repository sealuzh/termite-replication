  public void test16()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", (-550));
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur : java.lang.IllegalArgumentException: port out of range:-550**.\n****", string0);
  }
