  public void test08()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur : java.lang.NullPointerException**.\n****", 0);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
