/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 16:45:14 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3903902163802626
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter();
      StringWriter stringWriter2 = new StringWriter(27);
      simpleNode0.dump("*lshft", stringWriter2);
      simpleNode0.dump("Initializer", stringWriter1);
      simpleNode0.setIdentifier("");
      JavaParser javaParser1 = new JavaParser(javaParser0.token_source);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 77);
      SimpleNode simpleNode2 = new SimpleNode(1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "*lt");
      SimpleNode simpleNode3 = new SimpleNode(javaParser0, (-1919));
      simpleNode2.setIdentifier((String) null);
      simpleNode1.setIdentifier("}");
      StringWriter stringWriter3 = stringWriter1.append((CharSequence) "5");
      simpleNode1.dump("5", stringWriter3);
      assertEquals("5<StatementExpression>\n</StatementExpression>\n", stringWriter1.toString());
      assertEquals("5<StatementExpression>\n</StatementExpression>\n", stringWriter3.toString());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.4813519019840475
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("", stringWriter0);
      simpleNode0.jjtOpen();
      simpleNode0.dump("llTS#", stringWriter0);
      simpleNode0.setIdentifier("");
      JavaParser javaParser1 = new JavaParser((JavaParserTokenManager) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, (-1740));
      SimpleNode simpleNode2 = new SimpleNode(1291);
      simpleNode2.setIdentifier("CompilationUnit");
      simpleNode1.setIdentifier("37;*@X+ouU]O");
      simpleNode0.dump("llTS#", stringWriter0);
      // Undeclared exception!
      try { 
        simpleNode1.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1740
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.6709921476507943
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode1, 143);
      simpleNode0.jjtClose();
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("G!}^ko/A");
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter0 = new StringWriter(144);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "CompilationUnit");
      StringReader stringReader0 = new StringReader("G!}^ko/A");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 84, 84, 84);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      simpleNode0.jjtSetParent(simpleNode1);
      simpleNode0.jjtAddChild(simpleNode1, 144);
      simpleNode0.jjtGetNumChildren();
      SimpleNode simpleNode2 = new SimpleNode(1732);
      simpleNode2.jjtGetNumChildren();
      simpleNode2.dump("CompilationUnit", stringWriter1);
      simpleNode0.jjtGetParent();
      assertEquals(145, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.353065316972521
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode1, 143);
      simpleNode0.jjtClose();
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("G!}^ko/A");
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter0 = new StringWriter(144);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "CompilationUnit");
      StringReader stringReader0 = new StringReader("G!}^ko/A");
      simpleNode1.jjtSetParent(simpleNode0);
      simpleNode1.jjtAddChild(simpleNode0, 0);
      simpleNode0.toString(";a{1)");
      simpleNode0.jjtGetNumChildren();
      SimpleNode simpleNode2 = new SimpleNode(144);
      simpleNode1.jjtGetNumChildren();
      // Undeclared exception!
      simpleNode0.dump("G!}^ko/ACompilationUnit", stringWriter1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.4809791340827334
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(18);
      simpleNode0.dump("VariableDeclaratorId", stringWriter1);
      simpleNode0.dump("VariableDeclaratorId", stringWriter1);
      StringWriter stringWriter2 = new StringWriter();
      simpleNode0.dump("*gt", stringWriter0);
      simpleNode0.dump("Jm@{)d{;0\"{fb/.", stringWriter0);
      simpleNode0.setIdentifier("*gt");
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, (-2028));
      simpleNode1.setIdentifier("<");
      simpleNode1.setIdentifier("[G6lfd*&D c");
      // Undeclared exception!
      try { 
        simpleNode1.dump("VariableDeclaratorId", stringWriter1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.4221006252457893
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode1.jjtAddChild(simpleNode0, 0);
      simpleNode1.jjtClose();
      simpleNode1.toString("\"^\"");
      simpleNode1.jjtGetChild(0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-28));
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
  /*Coverage entropy=1.32199057152692
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(18);
      simpleNode0.dump("VariableDeclaratorId", stringWriter1);
      simpleNode0.dump("VariableDeclaratorId", stringWriter1);
      SimpleNode simpleNode1 = new SimpleNode(2076);
      simpleNode1.jjtOpen();
      simpleNode1.dump(">=", stringWriter1);
      simpleNode1.setIdentifier(">=");
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      SimpleNode simpleNode2 = new SimpleNode(javaParser0, 113);
      SimpleNode simpleNode3 = new SimpleNode(18);
      simpleNode3.setIdentifier("<");
      simpleNode3.setIdentifier("KKM9/$GCx.`8/t");
      simpleNode3.dump("VariableDeclaratorId", stringWriter0);
      assertEquals("<VariableDeclaratorId>\n  <identifier>*lt</identifier>\n  <identifier>KKM9/$GCx.`8/t</identifier>\n</VariableDeclaratorId>\n", stringWriter0.toString());
      
      String string0 = simpleNode0.toString("VariableDeclaratorId");
      assertEquals("VariableDeclaratorIdVariableDeclaratorId", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.8122449756991452
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-122);
      byteArray0[1] = (byte)110;
      byteArray0[2] = (byte)54;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      simpleNode0.jjtAddChild(simpleNode1, 143);
      simpleNode0.jjtClose();
      simpleNode0.toString("CompilationUnit");
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetChild(0);
      simpleNode0.setIdentifier("37;*@X+ouU]O");
      simpleNode0.toString("CompilationUnit");
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtClose();
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("CompilationUnitCompilationUnit", stringWriter0);
      simpleNode0.jjtGetParent();
      simpleNode1.dump("S.w(;HFQko[D", stringWriter0);
      simpleNode0.toString();
      assertEquals(144, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      Node[] nodeArray0 = new Node[4];
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.dump("_z[z@|>", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      SimpleNode simpleNode1 = new SimpleNode(0);
      Node node0 = simpleNode1.parent;
      simpleNode0.parent = null;
      simpleNode0.jjtGetParent();
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
      
      simpleNode1.jjtOpen();
      simpleNode1.jjtAddChild((Node) null, 0);
      simpleNode1.jjtGetChild(0);
      assertEquals(1, simpleNode1.jjtGetNumChildren());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7303995128176684
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 143);
      simpleNode0.jjtClose();
      simpleNode0.toString("CompilationUnit");
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("G!}^ko/A");
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter0 = new StringWriter(144);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "CompilationUnit");
      char[] charArray0 = new char[0];
      stringWriter1.write(charArray0);
      simpleNode0.dump("CompilationUnit", stringWriter1);
      stringWriter1.flush();
      simpleNode0.jjtGetChild(0);
      simpleNode0.setIdentifier("37;*@X+ouU]O");
      simpleNode0.dump("CompilationUnitCompilationUnit", stringWriter1);
      simpleNode0.toString("G!}^ko/ACompilationUnit");
      simpleNode0.dump("G!}^ko/ACompilationUnitCompilationUnit : 37;*@X+ouU]O", stringWriter0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtClose();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtAddChild((Node) null, 46);
      simpleNode0.dump("*__O_&GmJW#V|b1yINp", stringWriter0);
      simpleNode0.jjtGetParent();
      assertEquals(144, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.573318657104239
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(27);
      Node[] nodeArray0 = new Node[3];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      simpleNode0.jjtAddChild(nodeArray0[0], 2273);
      simpleNode0.jjtClose();
      simpleNode0.jjtGetChild(27);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString("G!}^ko/A");
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.jjtSetParent(nodeArray0[1]);
      StringWriter stringWriter0 = new StringWriter(2274);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "G!}^ko/AInitializer");
      StringReader stringReader0 = new StringReader("");
      simpleNode0.jjtSetParent(nodeArray0[1]);
      JavaParser javaParser0 = new JavaParser("Initializer");
      Node node1 = javaParser0.currNode;
      simpleNode0.jjtAddChild((Node) null, 27);
      simpleNode0.toString((String) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 2274);
      simpleNode1.jjtGetNumChildren();
      SimpleNode simpleNode2 = new SimpleNode(97);
      simpleNode2.jjtGetNumChildren();
      simpleNode1.dump("X'yss9p2B*ZwM|`5 ", stringWriter1);
      simpleNode0.jjtAddChild((Node) null, 2151);
      assertEquals(2274, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6925902949623004
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      JavaParser javaParser0 = new JavaParser("}");
      Node node0 = javaParser0.currNode;
      simpleNode0.parent = null;
      JavaParser javaParser1 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtAddChild(simpleNode1, 143);
      simpleNode0.jjtClose();
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.toString("G!}^ko/A");
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.jjtSetParent((Node) null);
      StringReader stringReader0 = new StringReader("G!}^ko/A");
      simpleNode1.jjtSetParent(simpleNode0);
      simpleNode0.toString(";a{1)");
      simpleNode0.jjtGetNumChildren();
      simpleNode1.jjtGetNumChildren();
      SimpleNode simpleNode2 = new SimpleNode(javaParser1, 124);
      simpleNode2.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 144);
      assertEquals(145, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.765150884646584
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode1, 143);
      simpleNode0.jjtClose();
      simpleNode0.toString("CompilationUnit");
      simpleNode0.jjtGetChild(0);
      String string0 = "";
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("CompilationUnit", stringWriter0);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(874);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 874
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.10312118125953
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("", stringWriter0);
      char[] charArray0 = new char[6];
      charArray0[0] = '$';
      charArray0[1] = 'D';
      charArray0[2] = '%';
      simpleNode0.dump("TehL^WFWV,/Ca", stringWriter0);
      simpleNode0.setIdentifier("VariableDeclaratorId");
      JavaParser javaParser1 = new JavaParser((JavaParserTokenManager) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      javaParser0.jj_nt = javaParser1.token;
      SimpleNode simpleNode2 = new SimpleNode((-554));
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "TehL^WFWV,/Ca");
      simpleNode0.setIdentifier("*gt");
      simpleNode1.setIdentifier("jT$H~/aw8|X");
      simpleNode1.dump("TehL^WFWV,/Ca", stringWriter0);
      assertEquals("<CompilationUnit>\n  <identifier>jT$H~/aw8|X</identifier>\n</CompilationUnit>\n", stringWriter0.toString());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8142879212199148
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtAddChild(simpleNode1, 143);
      simpleNode0.jjtClose();
      simpleNode0.toString("CompilationUnit");
      simpleNode0.jjtGetChild(0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString();
      simpleNode0.toString();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetChild(0);
      simpleNode0.setIdentifier("37;*@X+ouU]O");
      simpleNode0.toString("CompilationUnit");
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtClose();
      simpleNode0.jjtSetParent((Node) null);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("CompilationUnitCompilationUnit", stringWriter0);
      simpleNode1.jjtAddChild(simpleNode0, 143);
      simpleNode1.jjtAddChild((Node) null, 143);
      // Undeclared exception!
      try { 
        simpleNode1.jjtAddChild((Node) null, (-3320));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3320
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.311020481113516
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SystemInUtil.addInputLine("KKM9/$GCx.`8/t");
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      JavaParser javaParser0 = new JavaParser((Reader) null);
      simpleNode0.jjtAddChild((Node) null, 0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 0);
      simpleNode1.jjtAddChild(simpleNode0, 0);
      simpleNode1.jjtClose();
      simpleNode1.toString("\"^\"");
      Node node0 = simpleNode1.jjtGetChild(0);
      node0.jjtAddChild((Node) null, 131);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-28));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -28
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String string0 = "  <identifier>";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "  <identifier>");
      SimpleNode simpleNode0 = new SimpleNode((-942));
      // Undeclared exception!
      try { 
        simpleNode0.toString("CompilationUnit");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -942
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaParser javaParser0 = new JavaParser(sequenceInputStream0);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      simpleNode0.parser = javaParser0;
      simpleNode0.jjtGetParent();
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtClose();
      simpleNode0.jjtSetParent((Node) null);
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
  //Test case number: 19
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      simpleNode0.toString();
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.jjtAddChild(simpleNode0, 2681);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(791);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.015255863586861
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-562));
      int int0 = (-917);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-8);
      byteArray0[1] = (byte)127;
      byteArray0[2] = (byte)117;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-86);
      byteArray0[5] = (byte)97;
      byteArray0[6] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)117);
      PushbackInputStream pushbackInputStream1 = new PushbackInputStream(pushbackInputStream0);
      pushbackInputStream0.skip((byte)0);
      JavaParser javaParser1 = new JavaParser(pushbackInputStream1);
      simpleNode0.parser = javaParser1;
      simpleNode0.jjtGetParent();
      pushbackInputStream0.unread(byteArray0);
      simpleNode0.setIdentifier("A");
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-917));
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = (-1409);
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      SimpleNode simpleNode0 = new SimpleNode((-1409));
      Node node0 = simpleNode0.parent;
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1409));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.419594359581629
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&&");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 18, 18, 1027);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 18);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtGetNumChildren();
      SimpleNode simpleNode1 = new SimpleNode(110);
      simpleNode1.jjtOpen();
      SimpleNode simpleNode2 = new SimpleNode(0);
      simpleNode1.jjtAddChild(simpleNode2, 110);
      // Undeclared exception!
      try { 
        simpleNode2.jjtGetChild(136);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.9778661367769954
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(18);
      simpleNode0.dump("VariableDeclaratorId", stringWriter1);
      simpleNode0.dump("VariableDeclaratorId", stringWriter1);
      StringWriter stringWriter2 = new StringWriter();
      String string0 = "*gt";
      simpleNode0.dump("*gt", stringWriter0);
      simpleNode0.dump("Jm@{)d{;0\"{fb/.", stringWriter0);
      simpleNode0.setIdentifier("*gt");
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      JavaParser javaParser1 = new JavaParser("_,L<_=Q)A");
      SimpleNode simpleNode1 = new SimpleNode(javaParser1, 30);
      try { 
        javaParser1.AssignmentOperator();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
}
