/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 23:20:42 GMT 2020
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
import java.util.ArrayList;
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
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.jjtAddChild(simpleNode0, 1);
      simpleNode0.jjtAddChild(simpleNode0, 2903);
      assertEquals(2904, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      SimpleNode simpleNode1 = new SimpleNode(41);
      simpleNode1.parent = (Node) simpleNode0;
      Node node0 = simpleNode1.jjtGetParent();
      assertEquals(0, node0.jjtGetNumChildren());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode0, 38);
      simpleNode0.jjtSetParent(simpleNode0);
      simpleNode0.jjtGetParent();
      assertEquals(39, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(511);
      simpleNode0.jjtAddChild((Node) null, 511);
      simpleNode0.jjtGetChild(511);
      assertEquals(512, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(25);
      SimpleNode simpleNode1 = new SimpleNode(25);
      simpleNode0.jjtAddChild(simpleNode1, 25);
      simpleNode0.jjtGetChild(25);
      assertEquals(26, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2307));
      simpleNode0.jjtAddChild(simpleNode0, 110);
      simpleNode0.jjtGetChild(110);
      assertEquals(111, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      String string0 = simpleNode0.toString((String) null);
      assertEquals("nullNameList", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      String string0 = simpleNode0.toString("");
      assertEquals("VariableDeclaratorId", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.setIdentifier((String) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.setIdentifier("");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      simpleNode0.jjtSetParent((Node) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
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
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-5088));
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
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("", stringWriter0);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(55);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.toString("MemberValuePairs");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1106052531));
      // Undeclared exception!
      try { 
        simpleNode0.toString("|");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1106052531
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
      SimpleNode simpleNode0 = new SimpleNode(55);
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
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1869);
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1869
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2843);
      Node[] nodeArray0 = new Node[9];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(2843);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2843
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode0, (-1789569704));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2307));
      Node[] nodeArray0 = new Node[2];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(nodeArray0[0], (-2307));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2307
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump("?", stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<");
      // Undeclared exception!
      try { 
        simpleNode0.dump(">=", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      StringWriter stringWriter0 = new StringWriter(1694);
      SimpleNode simpleNode1 = new SimpleNode((-1106052531));
      simpleNode1.jjtAddChild(simpleNode0, 1694);
      // Undeclared exception!
      try { 
        simpleNode1.dump("cpOJ7;n", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, 111);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(18);
      Node[] nodeArray0 = new Node[2];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("&!2P9UH.nf9_m3nN", stringWriter0);
      assertEquals("<VariableDeclaratorId></VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(72);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("{", (Writer) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      StringWriter stringWriter0 = new StringWriter(1694);
      simpleNode0.jjtAddChild(simpleNode0, 1694);
      // Undeclared exception!
      simpleNode0.dump("cpOJ7;n", stringWriter0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("&&");
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<InstanceOfExpression>\n  <identifier>*amp</identifier>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.20619205063323187
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("&");
      simpleNode0.dump("^}@d < ,.", stringWriter0);
      assertEquals("<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.19144408195771734
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">=");
      simpleNode0.dump("S", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*ge</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.1985152433458726
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<=");
      simpleNode0.dump("{", stringWriter0);
      assertEquals("<ResultType>\n  <identifier>*le</identifier>\n</ResultType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.1985152433458726
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<<");
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<RelationalExpression>\n  <identifier>*lshft</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.1985152433458726
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">>");
      simpleNode0.dump("VariableDeclaratorId", stringWriter0);
      assertEquals("<RelationalExpression>\n  <identifier>*rshft</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.1985152433458726
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(37);
      StringWriter stringWriter0 = new StringWriter(84);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(">");
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<NameList>\n  <identifier>*gt</identifier>\n</NameList>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.19144408195771734
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<");
      simpleNode0.dump("?", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*lt</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(")");
      simpleNode0.dump(")", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n</VariableDeclaratorId>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      StringWriter stringWriter0 = new StringWriter(4179);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("");
      simpleNode0.dump("SingleMember&nnotatNon", stringWriter0);
      assertEquals("<ForInit>\n</ForInit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(47);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("{");
      simpleNode0.dump("VariableDeclaratorId", stringWriter0);
      assertEquals("<InstanceOfExpression>\n</InstanceOfExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      StringWriter stringWriter0 = new StringWriter(1694);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("}");
      simpleNode0.dump("|", stringWriter0);
      assertEquals("<ForInit>\n</ForInit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add(";");
      simpleNode0.dump("*gt", stringWriter0);
      assertEquals("<ResultType>\n</ResultType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      StringWriter stringWriter0 = new StringWriter();
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("<");
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<Literal>\n<identifier>Literal Value</identifier>\n</Literal>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(25);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add("ahhlkJ");
      String string0 = simpleNode0.toString();
      assertEquals("ConstructorDeclaration : ahhlkJ", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.jjtAddChild(simpleNode0, 3267);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(3268, int0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(35);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("*lt");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode0, 0);
      simpleNode0.jjtAddChild(simpleNode0, 1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}
