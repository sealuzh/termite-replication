/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 19:38:35 GMT 2019
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
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.9976435342075187
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      SimpleNode simpleNode0 = new SimpleNode(66);
      simpleNode0.jjtAddChild(simpleNode0, 94);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1066);
      simpleNode0.setIdentifier("`f+<g<Y;M4Y");
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(dataInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 1066);
      simpleNode0.jjtAddChild(simpleNode1, 1192);
      StringWriter stringWriter0 = new StringWriter(738);
      stringWriter0.close();
      char[] charArray0 = new char[5];
      charArray0[0] = '';
      charArray0[1] = '%';
      charArray0[2] = 'D';
      charArray0[3] = 'f';
      charArray0[4] = '@';
      stringWriter0.write(charArray0);
      StringWriter stringWriter1 = stringWriter0.append('^');
      SimpleNode simpleNode2 = new SimpleNode(javaParser0, (-1));
      simpleNode2.dump("", stringWriter1);
      simpleNode0.jjtGetChild(1192);
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild(simpleNode1, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6152804042395514
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      String string0 = "4RD8UAQWW^-";
      JavaParser javaParser0 = new JavaParser((String) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 1644);
      simpleNode0.setIdentifier("z)>>yQ~npl_Y;T@R");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-91);
      byteArray0[1] = (byte)43;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      JavaParser javaParser1 = new JavaParser(byteArrayInputStream0);
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode1.setIdentifier((String) null);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter((byte)45);
      stringWriter1.append('7');
      // Undeclared exception!
      try { 
        simpleNode1.dump("q<dF-", stringWriter1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2438228280066395
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte)19;
      byteArray0[3] = (byte)43;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      JavaParser javaParser0 = new JavaParser(byteArrayInputStream0);
      SimpleNode simpleNode0 = new SimpleNode((byte)12);
      simpleNode0.setIdentifier("q<dF-");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = new StringWriter((byte)19);
      stringWriter1.append('>');
      simpleNode0.dump((String) null, stringWriter1);
      assertEquals("><TypeParameter>\n  <identifier>q<dF-</identifier>\n</TypeParameter>\n", stringWriter1.toString());
      
      String string0 = simpleNode0.toString(")OElY5C!8>X0[");
      assertEquals(")OElY5C!8>X0[TypeParameter : q<dF-", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1367277121847392
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      SimpleNode simpleNode0 = new SimpleNode(66);
      int int0 = 94;
      simpleNode0.jjtAddChild(simpleNode0, 94);
      StringWriter stringWriter0 = new StringWriter(1);
      char[] charArray0 = new char[1];
      charArray0[0] = '!';
      stringWriter0.write(charArray0);
      StringWriter stringWriter1 = stringWriter0.append('!');
      // Undeclared exception!
      simpleNode0.dump((String) null, stringWriter1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.670955110805818
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      SimpleNode simpleNode0 = new SimpleNode(12);
      ArrayList<String> arrayList0 = simpleNode0.identifiers;
      simpleNode0.identifiers = arrayList0;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "P,!2>JeP");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "P,!2>JeP");
      simpleNode0.jjtGetNumChildren();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode0.jjtGetParent();
      simpleNode0.toString();
      simpleNode0.toString();
      StringWriter stringWriter0 = new StringWriter(0);
      simpleNode0.dump("TypeParameter", stringWriter0);
      simpleNode0.toString("\"if\"");
      simpleNode0.jjtAddChild((Node) null, 12);
      simpleNode0.toString();
      simpleNode0.jjtGetParent();
      simpleNode0.dump("TypeParameter", stringWriter0);
      simpleNode0.toString();
      assertEquals(13, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6152804042395514
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      SimpleNode simpleNode0 = new SimpleNode(3915);
      simpleNode0.id = 1197;
      simpleNode0.id = 1197;
      simpleNode0.jjtAddChild((Node) null, 93);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.jjtAddChild((Node) null, 93);
      StringReader stringReader0 = new StringReader("h");
      stringReader0.skip(1);
      stringReader0.skip(1394L);
      simpleNode0.jjtAddChild((Node) null, 3915);
      simpleNode0.jjtGetChild(1);
      int int0 = simpleNode0.jjtGetNumChildren();
      assertEquals(3916, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      SimpleNode simpleNode0 = new SimpleNode(3915);
      Node[] nodeArray0 = new Node[0];
      simpleNode0.children = nodeArray0;
      simpleNode0.id = 1197;
      simpleNode0.parent = null;
      simpleNode0.jjtAddChild((Node) null, 82);
      SimpleNode simpleNode1 = null;
      try {
        simpleNode1 = new SimpleNode((JavaParser) null, 1197);
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
  /*Coverage entropy=1.428860207414804
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1));
      simpleNode0.id = 1197;
      simpleNode0.jjtAddChild((Node) null, 93);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.jjtAddChild((Node) null, 93);
      int int0 = 81;
      simpleNode0.jjtAddChild((Node) null, 81);
      stringWriter0.close();
      StringWriter stringWriter1 = stringWriter0.append('>');
      // Undeclared exception!
      try { 
        simpleNode0.dump("", stringWriter1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[4];
      charArray0[0] = 'T';
      charArray0[1] = '[';
      charArray0[2] = ';';
      charArray0[3] = '6';
      stringWriter0.append((CharSequence) "<=");
      stringWriter0.write(charArray0);
      stringWriter0.write("<=");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringReader stringReader0 = new StringReader("Cr4,");
      stringReader0.skip(229365L);
      stringReader0.skip(687194767360L);
      JavaParser javaParser0 = new JavaParser((JavaParserTokenManager) null);
      int int0 = 10;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 10);
      simpleNode0.jjtGetParent();
      // Undeclared exception!
      try { 
        simpleNode0.jjtAddChild((Node) null, (-1722247170));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-3208));
      // Undeclared exception!
      try { 
        simpleNode0.toString("lIVHI}#M!}");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3208
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("M=\")+]{.;9z[}R*5v");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-2985));
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2985
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaParser javaParser0 = new JavaParser(sequenceInputStream0);
      sequenceInputStream0.mark((-2269));
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-1603));
      simpleNode0.jjtClose();
      // Undeclared exception!
      try { 
        simpleNode0.toString(">>");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1603
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.109524579757457
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 8);
      SimpleNode simpleNode0 = new SimpleNode(8);
      simpleNode0.setIdentifier(">");
      StringWriter stringWriter0 = new StringWriter(8);
      simpleNode0.dump("*F:qDtuqh6l2", stringWriter0);
      simpleNode0.dump("*F:qDtuqh6l2", stringWriter0);
      simpleNode0.toString();
      simpleNode0.dump("bvU?", stringWriter0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      simpleNode0.toString();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      StringWriter stringWriter1 = new StringWriter();
      StringReader stringReader0 = new StringReader("EnumDeclaration : >");
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.087698781999318
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Amp\"n:");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      int int0 = 319;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 319);
      int int1 = 53;
      SimpleNode simpleNode1 = new SimpleNode(53);
      stringReader0.reset();
      simpleNode1.jjtAddChild(simpleNode0, 53);
      String string0 = "VariableDeclaratorId";
      // Undeclared exception!
      try { 
        javaParser0.ReferenceType();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 7.  Encountered: <EOF> after : \"\\\"n:\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7039917864324614
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      SimpleNode simpleNode0 = new SimpleNode(1289);
      StringWriter stringWriter0 = new StringWriter(0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)94;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[2] = (byte)93;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-426), (byte)93);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      JavaParser javaParser0 = new JavaParser(sequenceInputStream0);
      Node node0 = javaParser0.currNode;
      simpleNode0.jjtAddChild((Node) null, (byte)93);
      StringReader stringReader0 = new StringReader("0");
      stringReader0.skip(1);
      simpleNode0.jjtAddChild((Node) null, 10);
      SimpleNode simpleNode1 = new SimpleNode((-2266));
      simpleNode0.jjtSetParent(simpleNode1);
      simpleNode0.jjtGetParent();
      assertEquals(94, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'0gPWp30a/_.vw3g#iG");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      // Undeclared exception!
      try { 
        javaParser0.BreakStatement();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 3.  Encountered: \"g\" (103), after : \"\\'0\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3291016900199226
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(3915);
      simpleNode0.id = 1197;
      simpleNode0.jjtAddChild((Node) null, 93);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.jjtAddChild((Node) null, 93);
      StringReader stringReader0 = new StringReader("h");
      stringReader0.skip(1394L);
      simpleNode0.jjtAddChild((Node) null, 3915);
      simpleNode0.jjtGetChild(1);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-970));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -970
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      StringWriter stringWriter0 = new StringWriter(84);
      StringReader stringReader0 = new StringReader("\"<<=\"");
      stringReader0.skip(1994L);
      stringWriter0.close();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "h");
      stringWriter1.append('>');
      JavaParser javaParser0 = new JavaParser("h");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 1);
      String string0 = simpleNode0.toString("Annotation");
      assertEquals("AnnotationPackageDeclaration", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SystemInUtil.addInputLine((String) null);
      SimpleNode simpleNode0 = new SimpleNode(3915);
      simpleNode0.id = 1197;
      simpleNode0.parent = null;
      simpleNode0.jjtAddChild((Node) null, 93);
      SimpleNode simpleNode1 = null;
      try {
        simpleNode1 = new SimpleNode((JavaParser) null, 1197);
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
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, false);
      javaParserTokenManager0.setDebugStream(mockPrintStream0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 22);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(107);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }
}
