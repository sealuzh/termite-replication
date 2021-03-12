  public void test14()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:1382");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 1382);
      assertEquals(136, services_HTTP_Result0.page_weight);
      assertTrue(services_HTTP_Result0.works);
  }
