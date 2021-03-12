  public void test00()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("220", (-1343));
      assertEquals(0, services_HTTP_Result0.code);
      
      services_HTTP_Result0.code = (-1343);
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : -1343\n** Erreur g\u00E9n\u00E9r\u00E9e : **URL Mal Form\u00E9** (java.net.MalformedURLException: Invalid port number :-1343) **.\n****", string0);
  }
