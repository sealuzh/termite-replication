/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 23:58:40 GMT 2020
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.StringReader;
import java.io.StringWriter;
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
      simpleNode0.jjtAddChild(simpleNode0, 0);
      simpleNode0.jjtAddChild(simpleNode0, 1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.parent = (Node) simpleNode0;
      Node node0 = simpleNode0.jjtGetParent();
      assertSame(node0, simpleNode0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      simpleNode0.parent = (Node) simpleNode0;
      simpleNode0.jjtAddChild(simpleNode0, 449);
      simpleNode0.jjtGetParent();
      assertEquals(450, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.jjtAddChild((Node) null, 857);
      simpleNode0.jjtGetChild(857);
      assertEquals(858, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      SimpleNode simpleNode1 = new SimpleNode(18);
      simpleNode1.jjtAddChild(simpleNode0, 2162);
      simpleNode1.jjtGetChild(2162);
      assertEquals(2163, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.jjtAddChild(simpleNode0, 857);
      simpleNode0.jjtGetChild(857);
      assertEquals(858, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(965);
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 965
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
      SimpleNode simpleNode0 = new SimpleNode('f');
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.setIdentifier("V");
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
      SimpleNode simpleNode0 = new SimpleNode(10);
      Node[] nodeArray0 = new Node[4];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode0, (-1968526675));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
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
  //Test case number: 12
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(13);
      SimpleNode simpleNode0 = new SimpleNode(13);
      simpleNode0.id = (-2021283581);
      Node[] nodeArray0 = new Node[1];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.dump("}", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.setIdentifier("y");
      String string0 = simpleNode0.toString();
      assertEquals("ForInit : y", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4634135588264299
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(6);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 2250);
      simpleNode0.dump("yZ!?ABq#Yn~", stringWriter0);
      assertEquals(2251, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(6);
      simpleNode0.jjtAddChild(simpleNode0, 2250);
      // Undeclared exception!
      simpleNode0.dump("yZ!?ABq#Yn~", stringWriter0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("}", stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier("&&");
      simpleNode0.dump("tv&", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.39439769144744274
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("after : \"", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*amp</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier(">=");
      simpleNode0.dump("ss6", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*ge</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("<=");
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*le</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("q", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*lshft</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(68);
      simpleNode0.setIdentifier(">>");
      simpleNode0.dump(">>", stringWriter0);
      assertEquals("<AllocationExpression>\n  <identifier>*rshft</identifier>\n</AllocationExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(68);
      simpleNode0.setIdentifier(">");
      simpleNode0.dump("\"[\"", stringWriter0);
      assertEquals("<AllocationExpression>\n  <identifier>*gt</identifier>\n</AllocationExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(")");
      simpleNode0.dump(")", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("=");
      simpleNode0.dump(")", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>=</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("q", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>*lt</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("{");
      simpleNode0.dump(":q/Zzot", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier("}");
      simpleNode0.dump("-yAk`{.+", stringWriter0);
      assertEquals("<InstanceOfExpression>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(";");
      simpleNode0.dump("D3q7L-->{6{S.Y", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(63);
      simpleNode0.setIdentifier("YW!WQ[:");
      simpleNode0.dump("pi#~<eS-XE,8qfNy", stringWriter0);
      assertEquals("<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.dump("ClassOrInterfaceType", stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.setIdentifier(">=");
      String string0 = simpleNode0.toString(":");
      assertEquals(":InstanceOfExpression : >=", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      simpleNode0.jjtAddChild((Node) null, 799);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(800, int0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      Node[] nodeArray0 = new Node[5];
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtAddChild(simpleNode0, 1306);
      assertEquals(1307, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2039));
      simpleNode0.jjtAddChild((Node) null, 1);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-2039));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2039
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(10);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      SimpleNode simpleNode0 = new SimpleNode(9);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, 2905);
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
      SimpleNode simpleNode0 = new SimpleNode((-1));
      // Undeclared exception!
      try { 
        simpleNode0.toString(";");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("", stringWriter0);
      assertEquals("<CompilationUnit>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-5));
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1471));
      simpleNode0.jjtSetParent(simpleNode0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1937));
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}
