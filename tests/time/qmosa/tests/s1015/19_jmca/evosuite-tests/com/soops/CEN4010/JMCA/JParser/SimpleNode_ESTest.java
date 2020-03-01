/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 01:10:25 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JJTJavaParserState;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Node;
import com.soops.CEN4010.JMCA.JParser.SimpleNode;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.1979769417903108
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter(686);
      stringWriter0.close();
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("", stringWriter1);
      simpleNode0.dump("&", stringWriter0);
      String string1 = "}";
      simpleNode0.setIdentifier("}");
      simpleNode0.dump("<identifier>Literal Value</identifier>\n", stringWriter1);
      simpleNode0.setIdentifier("&");
      simpleNode0.dump("</", stringWriter0);
      char[] charArray0 = null;
      StringReader stringReader1 = new StringReader("");
      try { 
        javaParser0.ConditionalExpression();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9920480917684886
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      StringWriter stringWriter0 = new StringWriter(70);
      stringWriter0.close();
      stringWriter0.close();
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 70);
      stringReader0.read();
      simpleNode0.setIdentifier("#KEA`G\"M*+~T}i}");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("8YtDmz#wDgTrQ^a/I7", stringWriter0);
      stringReader0.mark(1962);
      FileSystemHandling.shouldAllThrowIOExceptions();
      simpleNode0.setIdentifier(";");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      simpleNode0.dump("#KEA`G\"M*+~T}i}", stringWriter1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "tbxK+f4*Yoy");
      StringWriter stringWriter2 = new StringWriter();
      assertFalse(stringWriter2.equals((Object)stringWriter0));
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.8223795264135607
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      String string0 = "&m8PH ^h@-v'9j.]~W";
      simpleNode0.setIdentifier("&m8PH ^h@-v'9j.]~W");
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("\"if\"", stringWriter0);
      simpleNode0.setIdentifier(">=");
      String string1 = "ntdd3?H\"0}j,X";
      simpleNode0.dump("Q}5vA y8", stringWriter0);
      simpleNode0.setIdentifier(" : ");
      // Undeclared exception!
      try { 
        simpleNode0.dump(" ", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1361557235984077
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.toString();
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtOpen();
      StringReader stringReader0 = new StringReader("&");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      Node node0 = javaParser0.currNode;
      simpleNode0.setIdentifier("&&");
      StringWriter stringWriter0 = new StringWriter(1430);
      StringWriter stringWriter1 = stringWriter0.append('\\');
      simpleNode0.dump("{", stringWriter1);
      // Undeclared exception!
      try { 
        stringReader0.read((char[]) null, 1430, 1724);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1877436460732875
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"short\"");
      JavaParser javaParser0 = new JavaParser("\"short\"");
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 61);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter(0);
      stringWriter1.close();
      simpleNode0.setIdentifier("");
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      nodeArray0[4] = (Node) simpleNode1;
      simpleNode1.setIdentifier("{");
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("{", stringWriter1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0866772078772122
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"short\"");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 61);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("WS*;K1o", stringWriter0);
      StringWriter stringWriter1 = new StringWriter(0);
      stringWriter1.close();
      simpleNode0.setIdentifier("");
      Node[] nodeArray0 = new Node[8];
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      nodeArray0[4] = (Node) simpleNode1;
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      nodeArray0[7] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode1.dump("\"short\"", stringWriter0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0656708012002927
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      stringWriter0.close();
      simpleNode0.dump((String) null, stringWriter0);
      StringWriter stringWriter1 = new StringWriter(0);
      stringWriter1.write("");
      stringReader0.markSupported();
      StringReader stringReader1 = new StringReader("dq");
      JavaParser javaParser1 = new JavaParser((Reader) null);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, (-1970));
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = (Node) simpleNode1;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode1;
      nodeArray0[4] = (Node) simpleNode1;
      nodeArray0[5] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode0.dump((String) null, stringWriter0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(12);
      Writer writer0 = null;
      Node[] nodeArray0 = new Node[1];
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.dump("ReturnStatement", (Writer) null);
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
  /*Coverage entropy=0.9693467012070004
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      StringWriter stringWriter0 = new StringWriter(686);
      stringWriter0.close();
      simpleNode0.setIdentifier("&");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("", stringWriter1);
      simpleNode0.setIdentifier("");
      simpleNode0.dump("ntdd3?H\"0}j,X", stringWriter0);
      simpleNode0.setIdentifier("<=");
      simpleNode0.dump("ntdd3?H\"0}j,X", stringWriter1);
      StringReader stringReader1 = new StringReader("c>h");
      stringReader1.read();
      StringReader stringReader2 = new StringReader("' f!nT(6m2M*ujl3");
      // Undeclared exception!
      try { 
        stringReader2.read((char[]) null, (-1841822037), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0974033676362451
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(14);
      String string0 = "<>>Y\"";
      StringWriter stringWriter0 = new StringWriter(14);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite/projects/19_jmca");
      String string1 = "}H";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "}H");
      simpleNode0.setIdentifier("<>>Y\"");
      simpleNode0.setIdentifier(")*>E#w-YT5+");
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump(")*>E#w-YT5+", stringWriter1);
      simpleNode0.toString();
      StringWriter stringWriter2 = new StringWriter();
      stringWriter2.write("UjzJ9K`C");
      int int0 = 63;
      // Undeclared exception!
      try { 
        stringWriter1.append((CharSequence) ")*>E#w-YT5+", 14, 63);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1425230615188013
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('$');
      SimpleNode simpleNode1 = new SimpleNode(4);
      simpleNode0.parent = (Node) simpleNode1;
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.toString();
      Node node0 = simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild(node0, 0);
      simpleNode0.jjtSetParent(node0);
      StringReader stringReader0 = new StringReader("*ge");
      char[] charArray0 = new char[9];
      JavaParser javaParser0 = new JavaParser(stringReader0);
      simpleNode0.parser = javaParser0;
      charArray0[0] = '$';
      charArray0[1] = '$';
      charArray0[2] = '$';
      charArray0[3] = '<';
      charArray0[4] = '$';
      charArray0[5] = '$';
      charArray0[6] = '$';
      charArray0[7] = '$';
      charArray0[8] = '$';
      stringReader0.read(charArray0, 0, 0);
      simpleNode0.jjtGetParent();
      simpleNode0.jjtSetParent(node0);
      simpleNode0.setIdentifier("N.:<127Af@q.vKGUL");
      assertEquals(1, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 1;
      SimpleNode simpleNode0 = new SimpleNode(1);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      int int1 = (-1);
      simpleNode0.jjtGetParent();
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
  //Test case number: 12
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      Node[] nodeArray0 = new Node[3];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetChild(1);
      simpleNode0.toString();
      simpleNode0.jjtGetParent();
      simpleNode0.jjtClose();
      assertEquals(3, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "ax/LGM(piQXTw:z.";
      StringWriter stringWriter0 = new StringWriter(2875);
      char char0 = 'r';
      StringWriter stringWriter1 = stringWriter0.append('r');
      stringWriter1.close();
      stringWriter1.close();
      SimpleNode simpleNode0 = new SimpleNode((-1933165967));
      simpleNode0.setIdentifier("#KEA`G\"M*+~T}i}");
      StringWriter stringWriter2 = new StringWriter();
      // Undeclared exception!
      try { 
        simpleNode0.dump((String) null, stringWriter2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.2654436797543704
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(62);
      StringReader stringReader0 = new StringReader("ShiftExpression");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 62, 62);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      javaParser0.Name();
      javaParserTokenManager0.defaultLexState = 62;
      simpleNode0.jjtOpen();
      simpleNode0.jjtClose();
      simpleNode0.jjtGetNumChildren();
      javaParserTokenManager0.SwitchTo(0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ShiftExpression");
      javaParser0.ReInit(javaParserTokenManager0);
      assertFalse(javaParser0.lookingAhead);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  //Test case number: 16
  /*Coverage entropy=2.45126227595883
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.toString();
      simpleNode0.children = nodeArray0;
      simpleNode0.jjtOpen();
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 10);
      simpleNode0.jjtGetChild(10);
      simpleNode0.jjtAddChild((Node) null, 1);
      simpleNode0.toString("PackageDeclaration");
      simpleNode0.jjtGetChild(1);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(11, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("--A/");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-1990));
      Node node0 = simpleNode0.jjtGetParent();
      assertNull(node0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-2334));
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2334
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      JavaParser javaParser1 = new JavaParser(stringReader0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.write((String) null);
      StringReader stringReader1 = new StringReader("CompilationUnit");
      SimpleNode simpleNode0 = new SimpleNode(javaParser1, 451);
      Node node0 = simpleNode0.parent;
      simpleNode0.jjtAddChild((Node) null, 62);
      assertEquals(63, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"short\"");
      JavaParser javaParser0 = new JavaParser("\"short\"");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 61);
      JJTJavaParserState jJTJavaParserState0 = new JJTJavaParserState();
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode1, (-1615));
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
  /*Coverage entropy=0.9925623248862889
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ax/LGM(piQXTw:z.");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      String string0 = "=4";
      StringWriter stringWriter0 = new StringWriter(0);
      stringWriter0.close();
      simpleNode0.setIdentifier("=4");
      String string1 = null;
      simpleNode0.dump((String) null, stringWriter0);
      StringWriter stringWriter1 = new StringWriter(0);
      // Undeclared exception!
      try { 
        stringWriter1.write(")", 1840, 10);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.7962209059715708
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(18);
      StringWriter stringWriter0 = new StringWriter(18);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite/projects/19_jmca");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "}H");
      simpleNode0.setIdentifier("<>>Y\"");
      simpleNode0.dump(")*>E#w-Y5+", stringWriter0);
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/home/ubuntu/termite/projects/19_jmca");
      FileSystemHandling.appendStringToFile(evoSuiteFile1, ")*>E#w-Y5+");
      StringWriter stringWriter1 = new StringWriter();
      stringWriter0.append('E');
      assertEquals("<VariableDeclaratorId>\n  <identifier><>>Y\"</identifier>\n</VariableDeclaratorId>\nE", stringWriter0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SystemInUtil.addInputLine("");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 632);
      simpleNode0.jjtGetNumChildren();
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      simpleNode0.jjtGetNumChildren();
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(78);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.soops.CEN4010.JMCA.JParser.SimpleNode");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-7));
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-7));
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
  /*Coverage entropy=2.42212525194659
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(0);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('$');
      simpleNode0.dump((String) null, stringWriter0);
      simpleNode0.toString("*ge");
      simpleNode0.jjtGetParent();
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.jjtSetParent((Node) null);
      simpleNode0.toString();
      simpleNode0.jjtGetNumChildren();
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-4227));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4227
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.2407560846182575
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(1);
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 1001);
      JavaParser javaParser0 = new JavaParser(pushbackInputStream0);
      JavaCharStream javaCharStream0 = javaParser0.jj_input_stream;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser1 = new JavaParser(javaParserTokenManager0);
      StringReader stringReader0 = new StringReader("VmRi:[");
      JavaParser javaParser2 = new JavaParser(stringReader0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser2, 3635);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('/');
      simpleNode0.dump((String) null, stringWriter0);
      assertEquals("/", stringWriter0.toString());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.7488320958430319
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(12);
      Writer writer0 = null;
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.dump("ReturnStatement", (Writer) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.write((String) null);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)10;
      byte byte0 = (byte)77;
      byteArray0[1] = (byte)77;
      byteArray0[2] = (byte)77;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)7;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = null;
      try {
        bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.3121798600326575
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"short\"");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 61);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.dump("WS*;K1o", stringWriter0);
      StringWriter stringWriter1 = new StringWriter(61);
      stringWriter1.close();
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      javaParser0.MemberValue();
      StringWriter stringWriter2 = stringWriter0.append('`');
      simpleNode1.dump("WS*;K1o", stringWriter2);
      assertEquals("`", stringWriter0.toString());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node[] nodeArray0 = new Node[1];
      SimpleNode simpleNode0 = new SimpleNode(2874);
      // Undeclared exception!
      try { 
        simpleNode0.toString("<=");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2874
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("}");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, (-1133), (-1133), (-1102657671));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParser0.token_source = javaParserTokenManager0;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 1);
      String string0 = simpleNode0.toString();
      assertEquals("PackageDeclaration", string0);
  }
}
