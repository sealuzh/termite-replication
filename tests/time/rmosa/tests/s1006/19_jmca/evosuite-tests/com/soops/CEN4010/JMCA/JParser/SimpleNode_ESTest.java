/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 17:52:29 GMT 2020
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
import java.io.Writer;
import java.util.ArrayList;
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
      SimpleNode simpleNode0 = new SimpleNode(20);
      Node[] nodeArray0 = new Node[5];
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtAddChild(simpleNode0, 20);
      assertEquals(21, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      JavaParser javaParser0 = new JavaParser("cIx n 4]G7a[v%'vA");
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 18);
      simpleNode0.parent = (Node) simpleNode1;
      simpleNode1.jjtSetParent(simpleNode0.parent);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.parent = (Node) simpleNode0;
      Node node0 = simpleNode1.jjtGetParent();
      assertNotSame(simpleNode1, node0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.parent = (Node) simpleNode0;
      simpleNode0.jjtAddChild(simpleNode1, 0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
      
      Node node0 = simpleNode1.jjtGetParent();
      assertEquals(1, node0.jjtGetNumChildren());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-266));
      simpleNode0.jjtAddChild((Node) null, 467);
      simpleNode0.jjtGetChild(467);
      assertEquals(468, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3265);
      SimpleNode simpleNode1 = new SimpleNode(3265);
      simpleNode0.jjtAddChild(simpleNode1, 3265);
      simpleNode0.jjtGetChild(3265);
      assertEquals(3266, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      Node node0 = simpleNode0.jjtGetChild(0);
      assertEquals(1, node0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      String string0 = simpleNode0.toString((String) null);
      assertEquals("nullForInit", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      String string0 = simpleNode0.toString("");
      assertEquals("VariableInitializer", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      simpleNode0.setIdentifier((String) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
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
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(351);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3{@5N,@'N1Au<\"{N{");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 20);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.toString("3{@5N,@'N1Au<\"{N{");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-11));
      // Undeclared exception!
      try { 
        simpleNode0.toString(">");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -11
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3{@5N,@'N1Au<\"{N{");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 20);
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
      SimpleNode simpleNode0 = new SimpleNode(1464);
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1464
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
      SimpleNode simpleNode0 = new SimpleNode((-5425));
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.setIdentifier("cIx n 4]G7a[v%'vA");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-145));
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-2021577466));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2021577466
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
      SimpleNode simpleNode0 = new SimpleNode(84);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1084423290));
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1));
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter(112);
      // Undeclared exception!
      try { 
        simpleNode0.dump("", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode0, 0);
      // Undeclared exception!
      try { 
        simpleNode0.dump("VariableInitializer", (Writer) null);
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1934539644));
      Node[] nodeArray0 = new Node[1];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump("zNmk\"", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1934539644
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, 3303);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      Node[] nodeArray0 = new Node[0];
      simpleNode1.children = nodeArray0;
      simpleNode0.dump(";", stringWriter0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("&&");
      simpleNode0.dump("|", stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("!<~", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*amp</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("OO'6bk#>{f ", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*ge</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      StringWriter stringWriter0 = new StringWriter(19);
      simpleNode0.setIdentifier("<=");
      simpleNode0.dump("<=", stringWriter0);
      assertEquals("<VariableInitializer>\n  <identifier>*le</identifier>\n</VariableInitializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("<<");
      simpleNode0.dump("Block", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*lshft</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier(">>");
      simpleNode0.dump("O17/!`OszFTh^,3Em", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*rshft</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("\"]\"", stringWriter0);
      assertEquals("<VariableInitializer>\n  <identifier>*gt</identifier>\n</VariableInitializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.36764947740014225
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter(18);
      simpleNode0.setIdentifier("<");
      simpleNode0.dump("(", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*lt</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(")");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(")", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("\"]\"", stringWriter0);
      assertEquals("<VariableInitializer>\n</VariableInitializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      arrayList0.add("{");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("Block", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      StringWriter stringWriter0 = new StringWriter(19);
      simpleNode0.setIdentifier("}");
      simpleNode0.dump("<=", stringWriter0);
      assertEquals("<VariableInitializer>\n</VariableInitializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      simpleNode0.setIdentifier(";");
      StringWriter stringWriter0 = new StringWriter(19);
      simpleNode0.dump("!Ir;Uo", stringWriter0);
      assertEquals("<VariableInitializer>\n</VariableInitializer>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      simpleNode0.setIdentifier("fLL*p/:xPY7<N{");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("ep", stringWriter0);
      assertEquals("<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2615));
      Node[] nodeArray0 = new Node[2];
      simpleNode0.children = nodeArray0;
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(2, int0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode0, 0);
      simpleNode0.jjtAddChild(simpleNode0, 1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      Node[] nodeArray0 = new Node[4];
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtAddChild(simpleNode0, 0);
      assertEquals(4, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier("'");
      String string0 = simpleNode0.toString();
      assertEquals("VariableDeclaratorId : '", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1305);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.jjtSetParent(simpleNode0.parent);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(19);
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}
