/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 11:32:53 GMT 2020
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.FileDescriptor;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2060);
      simpleNode0.jjtAddChild((Node) null, 1342);
      simpleNode0.jjtAddChild((Node) null, 2060);
      assertEquals(2061, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DE$`$");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-1994672216));
      simpleNode0.parent = (Node) simpleNode0;
      Node node0 = simpleNode0.jjtGetParent();
      assertSame(simpleNode0, node0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DE$`$");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-1994672216));
      simpleNode0.parent = (Node) simpleNode0;
      simpleNode0.jjtAddChild(simpleNode0, 98);
      simpleNode0.jjtGetParent();
      assertEquals(99, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtGetChild(0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DE$`$");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-1994672216));
      simpleNode0.jjtAddChild(simpleNode0, 98);
      simpleNode0.jjtGetChild(98);
      assertEquals(99, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("2p$KXc!wVK");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 3);
      String string0 = simpleNode0.toString("");
      assertEquals("Modifiers", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      simpleNode0.setIdentifier((String) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      simpleNode0.jjtSetParent((Node) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-451));
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-451));
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
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(2147483645);
      simpleNode0.dump("", stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaParser javaParser0 = new JavaParser(mockFileInputStream0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 2914);
      // Undeclared exception!
      try { 
        simpleNode0.toString((String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2914
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
      SimpleNode simpleNode0 = new SimpleNode(68);
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
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DE$`$");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-1994672216));
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1994672216
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
      SimpleNode simpleNode0 = new SimpleNode((-1651));
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.setIdentifier("CompilationUnit");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      Node[] nodeArray0 = new Node[5];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(68);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 68
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      simpleNode0.setIdentifier("");
      // Undeclared exception!
      try { 
        simpleNode0.dump((String) null, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1968895190));
      simpleNode0.setIdentifier("f2I");
      // Undeclared exception!
      try { 
        simpleNode0.dump("%=", (Writer) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, (-1362));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("`XM-s ");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 39);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtAddChild(simpleNode0, 39);
      // Undeclared exception!
      simpleNode0.dump("`XM-s ", stringWriter0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6885673693022826
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("`XM-s ");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode1 = new SimpleNode(1828);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      simpleNode0.dump("`XM-s ", stringWriter0);
      assertEquals("<CompilationUnit></CompilationUnit>\n", stringWriter0.toString());
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9404479886553264
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("`XM-s ");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtAddChild(simpleNode0, 0);
      // Undeclared exception!
      try { 
        simpleNode0.dump("`XM-s ", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.39439769144744274
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(81);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("4V4*!num~vYx J", stringWriter0);
      assertEquals("<WhileStatement>\n  <identifier>*amp</identifier>\n</WhileStatement>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier(">=");
      simpleNode0.dump(">=", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*ge</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("terX&", stringWriter0);
      assertEquals("<AllocationExpression>\n  <identifier>*le</identifier>\n</AllocationExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      StringWriter stringWriter0 = new StringWriter((byte)2);
      simpleNode0.setIdentifier("<<");
      simpleNode0.dump("AllocationExpression :  : ' : <<", stringWriter0);
      assertEquals("<AllocationExpression>\n  <identifier>*lshft</identifier>\n</AllocationExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("<");
      simpleNode0.dump("terX&", stringWriter0);
      assertEquals("<AllocationExpression>\n  <identifier>*lt</identifier>\n</AllocationExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter((byte)2);
      simpleNode0.dump("AllocationExpression :  : ' : <<", stringWriter0);
      assertEquals("<AllocationExpression>\n</AllocationExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(81);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("{");
      simpleNode0.dump("{", stringWriter0);
      assertEquals("<WhileStatement>\n</WhileStatement>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("pp$EXc!wVR");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("}");
      simpleNode0.dump("NullLiteral", stringWriter0);
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier(";");
      simpleNode0.dump("*rshft", stringWriter0);
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.5481178804418445
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("2pn Xc!VK");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier(">");
      simpleNode0.dump(">", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*gt</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("`XM-s ");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("pp$EXc!wR");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode0, 0);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((byte)72);
      simpleNode0.jjtAddChild((Node) null, 0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-155952485));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -155952485
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("pp$EXc!wVR");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode0, (-1789916856));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      Node[] nodeArray0 = new Node[5];
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtAddChild(simpleNode0, 5);
      assertEquals(6, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      String string0 = simpleNode0.toString("MethodDeclarator");
      assertEquals("MethodDeclaratorCompilationUnit", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("2pn Xc!VK");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.setIdentifier(">");
      String string0 = simpleNode0.toString();
      assertEquals("CompilationUnit : >", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("pp$EXc!wVR");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("pp$EXc!wVR");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtSetParent(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(68);
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}
