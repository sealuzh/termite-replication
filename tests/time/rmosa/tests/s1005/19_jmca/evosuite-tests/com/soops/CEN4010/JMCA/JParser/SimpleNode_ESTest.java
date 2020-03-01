/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 19:53:06 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JJTJavaParserState;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.8102583142923485
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      simpleNode0.setIdentifier(">");
      simpleNode0.setIdentifier("%");
      StringWriter stringWriter0 = new StringWriter(1673);
      simpleNode0.dump("!s#mm)t", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*gt</identifier>\n  <identifier>%</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.104137539025984
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(46);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 46);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "T]*'s");
      simpleNode0.setIdentifier("=");
      StringWriter stringWriter0 = new StringWriter(46);
      stringWriter0.flush();
      StringWriter stringWriter1 = new StringWriter(46);
      simpleNode0.dump("*ge", stringWriter1);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtAddChild((Node) null, 47);
      assertEquals(48, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(9);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump(">{K(01K,m_<N", stringWriter0);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 1);
      simpleNode0.toString();
      simpleNode0.dump("6-zzwOtnqzhNBQQ", stringWriter0);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1913678211293401
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(73);
      simpleNode0.setIdentifier("vyU-R!e2\"\"7OlVz|_r");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "T]*'s");
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter(73);
      stringWriter0.flush();
      simpleNode0.jjtAddChild(simpleNode0, 73);
      // Undeclared exception!
      simpleNode0.dump("Mo,peHtLA&6/", stringWriter0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(63);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      String string0 = "J`bPg8K6-4.Wo";
      String string1 = "*rshft";
      simpleNode0.setIdentifier("*rshft");
      StringWriter stringWriter1 = new StringWriter();
      StringBuffer stringBuffer0 = new StringBuffer(63);
      StringWriter stringWriter2 = new StringWriter();
      StringBuffer stringBuffer1 = null;
      try {
        stringBuffer1 = new StringBuffer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(48);
      simpleNode0.setIdentifier(";");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      simpleNode0.setIdentifier(";");
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter0 = new StringWriter(30);
      stringWriter0.flush();
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("<ClassOrInterfaceType>\n  <identifier>*amp</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.8249506629220404
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(84);
      simpleNode0.setIdentifier(">=");
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) ">=");
      simpleNode0.dump("mC+TB*/uyF-8", stringWriter0);
      assertEquals("<ForInit>\n  <identifier>*ge</identifier>\n</ForInit>\n", stringWriter0.toString());
      
      String string0 = simpleNode0.toString();
      assertEquals("ForInit : >=", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(6);
      simpleNode0.setIdentifier("}");
      StringWriter stringWriter0 = new StringWriter(0);
      StringWriter stringWriter1 = new StringWriter(29);
      simpleNode0.dump("}", stringWriter1);
      assertEquals("<ExtendsList>\n</ExtendsList>\n", stringWriter1.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2605);
      simpleNode0.jjtAddChild(simpleNode0, 2605);
      simpleNode0.jjtGetChild(10);
      assertEquals(2606, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(46);
      simpleNode0.setIdentifier(">>");
      StringWriter stringWriter0 = new StringWriter(46);
      stringWriter0.flush();
      simpleNode0.dump("=", stringWriter0);
      assertEquals("<EqualityExpression>\n  <identifier>*rshft</identifier>\n</EqualityExpression>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.04461051760409
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-81);
      byteArray0[1] = (byte)124;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimpleNode simpleNode0 = new SimpleNode(22);
      String string0 = "{";
      simpleNode0.setIdentifier("{");
      StringWriter stringWriter0 = new StringWriter(22);
      simpleNode0.dump("c/w(0iU", stringWriter0);
      String string1 = null;
      simpleNode0.setIdentifier((String) null);
      StringWriter stringWriter1 = new StringWriter();
      StringBuffer stringBuffer0 = null;
      try {
        stringBuffer0 = new StringBuffer((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2605);
      Node[] nodeArray0 = new Node[3];
      nodeArray0[0] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtAddChild(nodeArray0[0], 2400);
      assertEquals(2401, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8221949319455968
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      simpleNode0.setIdentifier("<<");
      simpleNode0.setIdentifier(":G");
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "<<");
      stringWriter0.append((CharSequence) stringBuffer0);
      stringWriter0.flush();
      simpleNode0.dump(":G", stringWriter0);
      assertEquals("<<<ClassOrInterfaceType>\n  <identifier>*lshft</identifier>\n  <identifier>:G</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
      
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-129144205));
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1));
      Node[] nodeArray0 = new Node[1];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.8112649147694895
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter1 = new StringWriter(30);
      simpleNode0.dump("k8X", stringWriter1);
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter2 = new StringWriter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "<=");
      StringWriter stringWriter3 = new StringWriter();
      stringWriter2.close();
      StringBuffer stringBuffer1 = new StringBuffer("BReW7");
      stringWriter2.append((CharSequence) stringBuffer1);
      stringWriter0.append('#');
      stringWriter3.flush();
      simpleNode0.dump("C ", stringWriter0);
      assertEquals("#<ClassOrInterfaceType>\n  <identifier>*lt</identifier>\n  <identifier>*le</identifier>\n  <identifier>*gt</identifier>\n</ClassOrInterfaceType>\n", stringWriter0.toString());
      
      String string0 = simpleNode0.toString();
      assertEquals("ClassOrInterfaceType : < : <= : >", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-129144216));
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      simpleNode0.identifiers = null;
      StringWriter stringWriter1 = new StringWriter(685);
      // Undeclared exception!
      try { 
        simpleNode0.dump("*lt", stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0676032882216056
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-129144205));
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("\"double\"", stringWriter0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-129144205));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -129144205
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(241);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      simpleNode0.identifiers = arrayList0;
      String string0 = "         java JavaParser inputfile";
      int int0 = 501;
      ArrayList<String> arrayList1 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList1;
      arrayList1.add("         java JavaParser inputfile");
      StringWriter stringWriter0 = new StringWriter(501);
      stringWriter0.close();
      // Undeclared exception!
      try { 
        simpleNode0.dump("         java JavaParser inputfile", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter(0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.jjtSetParent(simpleNode0);
      Node node0 = simpleNode1.jjtGetParent();
      assertNotSame(simpleNode1, node0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9481178804418445
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 46;
      SimpleNode simpleNode0 = new SimpleNode(46);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "T]*'s";
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-1968526675));
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-129144205));
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-129144205));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1));
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "QbB'AQc>E-O-ce9#~";
      JavaParser javaParser0 = new JavaParser("QbB'AQc>E-O-ce9#~");
      int int0 = 487;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 487);
      simpleNode0.jjtOpen();
      JJTJavaParserState jJTJavaParserState0 = javaParser0.jjtree;
      // Undeclared exception!
      try { 
        jJTJavaParserState0.popNode();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1842918075));
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1842918075
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9389355707834581
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = 48;
      SimpleNode simpleNode0 = new SimpleNode(48);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("<", stringWriter0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ";");
      simpleNode0.setIdentifier("5m");
      StringWriter stringWriter1 = new StringWriter(48);
      stringWriter0.flush();
      simpleNode0.dump("<", stringWriter0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(48);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.jjtClose();
      JJTJavaParserState jJTJavaParserState0 = new JJTJavaParserState();
      // Undeclared exception!
      try { 
        jJTJavaParserState0.peekNode();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2605);
      Node[] nodeArray0 = new Node[3];
      simpleNode0.children = nodeArray0;
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump("(~@4\"Yu=F", stringWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = (-758);
      SimpleNode simpleNode0 = new SimpleNode((-758));
      JJTJavaParserState jJTJavaParserState0 = new JJTJavaParserState();
      jJTJavaParserState0.openNodeScope(simpleNode0);
      jJTJavaParserState0.closeNodeScope(simpleNode0, false);
      jJTJavaParserState0.reset();
      StringReader stringReader0 = null;
      try {
        stringReader0 = new StringReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2605);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtAddChild(simpleNode0, 1);
      assertEquals(2, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0676032882216056
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-129144205));
      Node[] nodeArray0 = new Node[0];
      // Undeclared exception!
      try { 
        simpleNode0.toString("$yt3+");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -129144205
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.9920480917684886
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(73);
      simpleNode0.setIdentifier("vyU-R!e2\"\"7OlVz|_r");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "T]*'s");
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter0 = new StringWriter(73);
      stringWriter0.flush();
      simpleNode0.dump("Mo,peHtLA&6/", stringWriter0);
      assertEquals("<Block>\n  <identifier>vyU-R!e2\"\"7OlVz|_r</identifier>\n  <identifier>*le</identifier>\n</Block>\n", stringWriter0.toString());
      
      String string0 = simpleNode0.toString("<=");
      assertEquals("<=Block : vyU-R!e2\"\"7OlVz|_r : <=", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.9654251325795494
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      simpleNode0.setIdentifier("<");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.setIdentifier("<=");
      StringWriter stringWriter1 = new StringWriter(30);
      simpleNode0.dump("k8X", stringWriter1);
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter2 = new StringWriter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "<=");
      char[] charArray0 = new char[4];
      charArray0[0] = '5';
      charArray0[1] = '*';
      charArray0[2] = 'h';
      charArray0[3] = 'e';
      stringWriter2.write(charArray0);
      StringWriter stringWriter3 = new StringWriter();
      StringBuffer stringBuffer1 = new StringBuffer("BReW7");
      stringWriter2.append((CharSequence) stringBuffer1);
      stringWriter0.append('#');
      stringWriter3.flush();
      simpleNode0.dump("C ", stringWriter0);
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }
}
