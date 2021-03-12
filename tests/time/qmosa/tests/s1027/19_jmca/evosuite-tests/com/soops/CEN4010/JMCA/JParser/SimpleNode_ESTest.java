/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 12:23:52 GMT 2020
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
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
      SimpleNode simpleNode0 = new SimpleNode(220);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtSetParent(simpleNode0);
      Node node0 = simpleNode0.jjtGetParent();
      assertSame(simpleNode0, node0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(50);
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtGetChild(0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      SimpleNode simpleNode1 = new SimpleNode((-42305025));
      simpleNode0.jjtAddChild(simpleNode1, 1);
      simpleNode0.jjtGetChild(1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1699);
      // Undeclared exception!
      try { 
        simpleNode0.toString((String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1699
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
      SimpleNode simpleNode0 = new SimpleNode(42);
      simpleNode0.setIdentifier((String) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
      simpleNode0.jjtSetParent((Node) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtSetParent(simpleNode0);
      simpleNode0.jjtAddChild(simpleNode0, 0);
      simpleNode0.jjtGetParent();
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-1220));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
      simpleNode0.jjtAddChild(simpleNode0, 0);
      simpleNode0.jjtGetChild(0);
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.dump(">>", (Writer) null);
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.dump("", stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-5026));
      // Undeclared exception!
      try { 
        simpleNode0.toString("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5026
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
      SimpleNode simpleNode0 = new SimpleNode((-1983609987));
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1983609987
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
      SimpleNode simpleNode0 = new SimpleNode(9);
      simpleNode0.identifiers = null;
      // Undeclared exception!
      try { 
        simpleNode0.setIdentifier("+=");
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
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.jjtAddChild((Node) null, 1);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(1435);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1435
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1877));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter(0);
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
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
  //Test case number: 19
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      arrayList0.add((String) null);
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        simpleNode0.dump("5S#~uI>moqm`VU}/", stringWriter0);
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
      SimpleNode simpleNode0 = new SimpleNode((-1118202493));
      simpleNode0.setIdentifier("MemberValuePair");
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump(">>", stringWriter0);
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
        simpleNode0 = new SimpleNode((JavaParser) null, 853);
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
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(50);
      StringWriter stringWriter0 = new StringWriter();
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("MemberValueArrayInitializer", stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(50);
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("&&", stringWriter0);
      assertEquals("<AdditiveExpression></AdditiveExpression>\n", stringWriter0.toString());
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((byte)100);
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<MemberValuePair>\n  <identifier>*amp</identifier>\n</MemberValuePair>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.39439769144744274
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("] @V", stringWriter0);
      assertEquals("<RelationalExpression>\n  <identifier>*amp</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("transient", stringWriter0);
      assertEquals("<RelationalExpression>\n  <identifier>*ge</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("$", stringWriter0);
      assertEquals("<RelationalExpression>\n  <identifier>*le</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("<<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("Encountered \"", stringWriter0);
      assertEquals("<RelationalExpression>\n  <identifier>*lshft</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      StringWriter stringWriter0 = new StringWriter(9);
      simpleNode0.setIdentifier(">");
      simpleNode0.dump("MemerValueArrayInitializer", stringWriter0);
      assertEquals("<EnumBody>\n  <identifier>*gt</identifier>\n</EnumBody>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">>", stringWriter0);
      assertEquals("<RelationalExpression>\n  <identifier>*lt</identifier>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("8]#V4+5FR", stringWriter0);
      assertEquals("<RelationalExpression>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("{");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      assertEquals("<RelationalExpression>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier("}");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">>", stringWriter0);
      assertEquals("<RelationalExpression>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier(";");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("*lt", stringWriter0);
      assertEquals("<RelationalExpression>\n</RelationalExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.3805062184775959
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((byte)100);
      simpleNode0.setIdentifier(">>");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(":$43ZGpDkr?#k&z", stringWriter0);
      assertEquals("<MemberValuePair>\n  <identifier>*rshft</identifier>\n</MemberValuePair>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((byte)100);
      simpleNode0.setIdentifier(">>");
      String string0 = simpleNode0.toString();
      assertEquals("MemberValuePair : >>", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
      simpleNode0.jjtAddChild((Node) null, 0);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2085);
      simpleNode0.jjtAddChild((Node) null, (byte)100);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1983609987));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1983609987
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(50);
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtAddChild((Node) null, 851);
      assertEquals(852, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      String string0 = simpleNode0.toString(">>");
      assertEquals(">>RelationalExpression", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" iB");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 442, 10);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      javaParser0.TypeArgument();
      assertFalse(javaParser0.lookingAhead);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }
}
