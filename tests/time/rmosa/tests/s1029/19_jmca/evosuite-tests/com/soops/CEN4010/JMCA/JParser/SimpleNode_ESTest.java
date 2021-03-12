/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 13:34:23 GMT 2020
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1106));
      simpleNode0.jjtAddChild((Node) null, 1014);
      simpleNode0.jjtAddChild((Node) null, 2261);
      assertEquals(2262, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(38);
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1492);
      simpleNode0.jjtSetParent(simpleNode0);
      Node node0 = simpleNode0.jjtGetParent();
      assertSame(node0, simpleNode0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1079);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.parent = nodeArray0[0];
      simpleNode0.children = nodeArray0;
      Node node0 = simpleNode0.jjtGetParent();
      assertSame(node0, simpleNode0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1106));
      simpleNode0.jjtAddChild((Node) null, 1014);
      simpleNode0.jjtGetChild(914);
      assertEquals(1015, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(62);
      String string0 = simpleNode0.toString((String) null);
      assertEquals("nullPrimarySuffix", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.jjtSetParent((Node) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1841123533));
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.dump("{", (Writer) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.dump("", stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2703);
      // Undeclared exception!
      try { 
        simpleNode0.toString("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2703
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1079);
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1079
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.setIdentifier(":");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2005);
      Node[] nodeArray0 = new Node[4];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(333);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 333
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(6);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-3451));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      StringWriter stringWriter0 = new StringWriter(1);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.dump("{", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      StringWriter stringWriter0 = new StringWriter(48);
      simpleNode0.setIdentifier((String) null);
      // Undeclared exception!
      try { 
        simpleNode0.dump("ag@K}Mxz4.16sz", stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(61);
      simpleNode0.setIdentifier(">=");
      simpleNode0.id = (-1392);
      // Undeclared exception!
      try { 
        simpleNode0.dump("=pvMsXj>g-0@YO` BW", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, 117);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.jjtAddChild((Node) null, 1);
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtAddChild(simpleNode0, 63);
      // Undeclared exception!
      simpleNode0.dump((String) null, stringWriter0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      StringWriter stringWriter0 = new StringWriter(4764);
      simpleNode0.setIdentifier("&&");
      simpleNode0.dump("{", stringWriter0);
      assertEquals("<PackageDeclaration>\n  <identifier>*amp</identifier>\n</PackageDeclaration>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(61);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("_k&DI@]JH)ScviUD,", stringWriter0);
      assertEquals("<PrimaryPrefix>\n  <identifier>*ge</identifier>\n</PrimaryPrefix>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.setIdentifier("<=");
      simpleNode0.dump("PackageDeclaration : <=", stringWriter0);
      assertEquals("<PackageDeclaration>\n  <identifier>*le</identifier>\n</PackageDeclaration>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("<<");
      simpleNode0.dump("=", stringWriter0);
      assertEquals("<ForInit>\n  <identifier>*lshft</identifier>\n</ForInit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(45);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier(">>");
      simpleNode0.dump("*gt", stringWriter0);
      assertEquals("<AndExpression>\n  <identifier>*rshft</identifier>\n</AndExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(61);
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">=", stringWriter0);
      assertEquals("<PrimaryPrefix>\n  <identifier>*gt</identifier>\n</PrimaryPrefix>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("<");
      simpleNode0.dump("f", stringWriter0);
      assertEquals("<PackageDeclaration>\n  <identifier>*lt</identifier>\n</PackageDeclaration>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.7937300551584248
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(10);
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 10);
      simpleNode0.setIdentifier("");
      simpleNode0.dump("p!4D9RL", stringWriter0);
      assertEquals("<EnumConstant>\n</EnumConstant>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.setIdentifier("{");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("r3;X1H.?:%W)YSP4+4", stringWriter0);
      assertEquals("<ForInit>\n</ForInit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      StringWriter stringWriter0 = new StringWriter(780);
      simpleNode0.setIdentifier("}");
      simpleNode0.dump("<", stringWriter0);
      assertEquals("<PackageDeclaration>\n</PackageDeclaration>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(38);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier(";");
      simpleNode0.dump("</", stringWriter0);
      assertEquals("<Expression>\n</Expression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      simpleNode0.setIdentifier(" not found.");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(" not found.", stringWriter0);
      assertEquals("<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(18);
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 18);
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("9pcv P'we{(tD", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*amp</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.setIdentifier("p!4D9RL");
      String string0 = simpleNode0.toString();
      assertEquals("PackageDeclaration : p!4D9RL", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode0, 0);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1106));
      simpleNode0.jjtAddChild((Node) null, 1014);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-4025));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4025
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtAddChild((Node) null, 1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-1953531314));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 18);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(61);
      String string0 = simpleNode0.toString("TypeParameter");
      assertEquals("TypeParameterPrimaryPrefix", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}
