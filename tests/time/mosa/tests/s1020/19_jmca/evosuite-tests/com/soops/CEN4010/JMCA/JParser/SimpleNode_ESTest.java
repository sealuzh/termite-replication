/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 03:05:15 GMT 2020
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
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
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtAddChild((Node) null, 10);
      assertEquals(11, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(50);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      String string0 = simpleNode0.toString();
      assertEquals("EnumConstant", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1103981311));
      simpleNode0.parent = (Node) simpleNode0;
      Node node0 = simpleNode0.jjtGetParent();
      assertSame(node0, simpleNode0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(50);
      simpleNode0.jjtAddChild((Node) null, 50);
      simpleNode0.jjtGetChild(50);
      assertEquals(51, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(50);
      SimpleNode simpleNode1 = new SimpleNode(50);
      simpleNode0.jjtAddChild(simpleNode1, 50);
      simpleNode0.jjtGetChild(50);
      assertEquals(51, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.jjtAddChild(simpleNode0, 84);
      simpleNode0.jjtGetChild(84);
      assertEquals(85, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1445421684));
      // Undeclared exception!
      try { 
        simpleNode0.toString((String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1445421684
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(46);
      String string0 = simpleNode0.toString("");
      assertEquals("EqualityExpression", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(34);
      simpleNode0.jjtSetParent(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
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
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-1));
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
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1106101594));
      simpleNode0.dump("g1ro6C6jIx3Jr", (Writer) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.toString("ExtendsList");
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
      SimpleNode simpleNode0 = new SimpleNode(17);
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
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1103981311));
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1103981311
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(100);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.setIdentifier(">=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(57);
      simpleNode0.jjtAddChild((Node) null, 57);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(646);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 646
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2174));
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode0, (-2174));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(56);
      simpleNode0.setIdentifier((String) null);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump((String) null, stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1795083793));
      simpleNode0.setIdentifier("r");
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump("r", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, 88);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      simpleNode0.jjtAddChild(simpleNode0, 30);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      simpleNode0.dump("785e.;bW.26b6", stringWriter0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("=", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("&&", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.39439769144744274
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("&", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(61);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter(61);
      simpleNode0.dump(">=", stringWriter0);
      assertEquals("<PrimaryPrefix>\n  <identifier>*ge</identifier>\n</PrimaryPrefix>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<=", stringWriter0);
      assertEquals("<NameList>\n  <identifier>*le</identifier>\n</NameList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("b]|K[Dl;HjAB", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*lshft</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier(">>");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">>", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*rshft</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*gt</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(")");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(")", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(24);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      assertEquals("<FormalParameter>\n  <identifier>*lt</identifier>\n</FormalParameter>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("", stringWriter0);
      assertEquals("<NameList>\n</NameList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      simpleNode0.setIdentifier("{");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("{", stringWriter0);
      assertEquals("<NameList>\n</NameList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      simpleNode0.setIdentifier("}");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("}", stringWriter0);
      assertEquals("<NameList>\n</NameList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier(";");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(";", stringWriter0);
      assertEquals("<InstanceOfExpression>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      assertEquals("<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      simpleNode0.setIdentifier(")");
      String string0 = simpleNode0.toString(")");
      assertEquals(")NameList : )", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-562));
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) null, 0);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1302);
      simpleNode0.jjtAddChild((Node) null, 255);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-2717));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2717
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtAddChild((Node) null, 1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("LocalVariableDeclaration");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(":", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>LocalVariableDeclaration</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ShiftExpression");
      try { 
        javaParser0.VariableDeclaratorId();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtSetParent((Node) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}
