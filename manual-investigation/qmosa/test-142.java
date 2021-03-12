  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(162);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(162, 1409);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | A , B , C , D , E , F , G , H , I , J , K , L , M , N , O , P , Q , R , S , T , U , V , W , X , Y , Z , [ , \\ , ] , ^ , _ , ` , a , b , c , d , e , f , g , h , i , j , k , l , m , n , o , p , q , r , s , t , u , v , w , x , y , z , { , | , } , ~ ,  , \u0080 , \u0081 , \u0082 , \u0083 , \u0084 , \u0085 , \u0086 , \u0087 , \u0088 , \u0089 , \u008A , \u008B , \u008C , \u008D , \u008E , \u008F , \u0090 , \u0091 , \u0092 , \u0093 , \u0094 , \u0095 , \u0096 , \u0097 , \u0098 , \u0099 , \u009A , \u009B , \u009C , \u009D , \u009E , \u009F , \u00A0 , \u00A1 , \u00A2 , \u00A3 , \u00A4 , \u00A5 , \u00A6 , \u00A7 , \u00A8 , \u00A9 , \u00AA , \u00AB , \u00AC , \u00AD , \u00AE , \u00AF , \u00B0 , \u00B1 , \u00B2 , \u00B3 , \u00B4 , \u00B5 , \u00B6 , \u00B7 , \u00B8 , \u00B9 , \u00BA , \u00BB , \u00BC , \u00BD , \u00BE , \u00BF , \u00C0 , \u00C1 , \u00C2 , \u00C3 , \u00C4 , \u00C5 , \u00C6 , \u00C7 , \u00C8 , \u00C9 , \u00CA , \u00CB , \u00CC , \u00CD , \u00CE , \u00CF , \u00D0 , \u00D1 , \u00D2 , \u00D3 , \u00D4 , \u00D5 , \u00D6 , \u00D7 , \u00D8 , \u00D9 , \u00DA , \u00DB , \u00DC , \u00DD , \u00DE , \u00DF , \u00E0 , \u00E1 , \u00E2\n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl1.creatMatrix(1409);
      expressionMatrixImpl1.getValue(162, 162);
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl1.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(1, 0, 0);
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      String string1 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("1 --- A ---> 0\n", string1);
      
      expressionMatrixImpl2.toString();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.setValue(0, 1, (-1192));
      messageTracerImpl0.getMapper();
      String string2 = expressionMatrixImpl2.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string2);
      
      String string3 = expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("", string3);
      
      expressionMatrixImpl0.toString();
      expressionMatrixImpl2.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      int int1 = expressionMatrixImpl1.getValue(733, 1409);
      assertEquals((-1), int1);
  }
