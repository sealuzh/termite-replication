/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 02:20:49 GMT 2020
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[6];
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtAddChild(simpleNode0, 1265);
      assertEquals(1266, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      simpleNode0.jjtSetParent(simpleNode0);
      simpleNode0.jjtAddChild((Node) null, 93);
      simpleNode0.jjtGetParent();
      assertEquals(94, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[6];
      simpleNode0.jjtAddChild(nodeArray0[5], 1);
      simpleNode0.jjtGetChild(1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      SimpleNode simpleNode1 = new SimpleNode(1705);
      simpleNode0.jjtAddChild(simpleNode1, 1705);
      simpleNode0.jjtGetChild(1705);
      assertEquals(1706, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      Node node0 = simpleNode0.jjtGetChild(0);
      assertEquals(6, node0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.toString("YUrbnE+UM|PBt-");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(60);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1705);
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1705
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2511);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.setIdentifier("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1910714218));
      Node[] nodeArray0 = new Node[3];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-1910714218));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1910714218
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.setIdentifier((String) null);
      StringWriter stringWriter0 = new StringWriter(2109);
      // Undeclared exception!
      try { 
        simpleNode0.dump("*lt", stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("*");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.id = (-1739);
      // Undeclared exception!
      try { 
        simpleNode0.dump("G2e:I", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, 18);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(">=");
      String string0 = simpleNode0.toString();
      assertEquals("VariableDeclaratorId : >=", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6885673693022826
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode1.jjtAddChild(simpleNode0, 0);
      simpleNode1.dump("MemberSelector", stringWriter0);
      assertEquals("<CompilationUnit></CompilationUnit>\n", stringWriter0.toString());
      assertEquals(1, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtAddChild(simpleNode0, 1705);
      // Undeclared exception!
      simpleNode0.dump("*le", stringWriter0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4096);
      SimpleNode simpleNode0 = new SimpleNode(4096);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("'C}Gw_d/_u\"E.zJTh", stringWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      assertEquals("<ClassOrInterfaceType>\n  <identifier>*amp</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("G2e:I", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*ge</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter(84);
      simpleNode0.dump("  <identifier>", stringWriter0);
      assertEquals("<ForInit>\n  <identifier>*le</identifier>\n</ForInit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("G2e:I", stringWriter0);
      assertEquals("<Initializer>\n  <identifier>*lshft</identifier>\n</Initializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter0 = new StringWriter(2109);
      simpleNode0.dump("*lt", stringWriter0);
      assertEquals("<ResultType>\n  <identifier>*gt</identifier>\n</ResultType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("*ge", stringWriter0);
      assertEquals("<ResultType>\n  <identifier>*lt</identifier>\n</ResultType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(")");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("G2ePI", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(">>");
      StringWriter stringWriter0 = new StringWriter(1480);
      simpleNode0.dump("*", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*rshft</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("!", stringWriter0);
      assertEquals("<ResultType>\n</ResultType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.setIdentifier("{");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(";W2+F!p", stringWriter0);
      assertEquals("<ResultType>\n</ResultType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.setIdentifier("}");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      assertEquals("<ResultType>\n</ResultType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier(";");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("*amp", stringWriter0);
      assertEquals("<InstanceOfExpression>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      simpleNode0.setIdentifier("*");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("G2e:I", stringWriter0);
      assertEquals("<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.39439769144744274
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter0 = new StringWriter(10);
      simpleNode0.dump("Uxg[:UTaF}d& Tgih9u", stringWriter0);
      assertEquals("<Initializer>\n  <identifier>*amp</identifier>\n</Initializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4096);
      SimpleNode simpleNode0 = new SimpleNode(4096);
      simpleNode0.dump("'C}Gw_d/_u\"E.zJTh", stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(">=");
      String string0 = simpleNode0.toString("aXZZ|_9@[H");
      assertEquals("aXZZ|_9@[HVariableDeclaratorId : >=", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.jjtAddChild(simpleNode0, 1705);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(1706, int0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[6];
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtAddChild(nodeArray0[0], 6);
      assertEquals(7, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1439));
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1439));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(25);
      Node[] nodeArray0 = new Node[6];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(nodeArray0[5], (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(1705);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1994827031));
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-2147483647));
      // Undeclared exception!
      try { 
        simpleNode0.toString("InstanceOfExpression");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483647
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2511);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1994827031));
      simpleNode0.jjtSetParent(simpleNode0);
      Node node0 = simpleNode0.jjtGetParent();
      assertSame(node0, simpleNode0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-3578));
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}
