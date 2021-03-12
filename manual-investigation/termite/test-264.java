  public void test00()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0, services_HTTP_Result0.page_weight);
      
      services_HTTP_Result0.page_weight = 3000;
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 3000 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }
