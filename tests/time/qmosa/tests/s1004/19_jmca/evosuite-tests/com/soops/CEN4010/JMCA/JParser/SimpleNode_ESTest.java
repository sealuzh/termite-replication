/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 16:57:25 GMT 2019
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
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleNode_ESTest extends SimpleNode_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.8529610277865571
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("3%d!AZ!<X?O0;o");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 50);
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 3102);
      simpleNode0.parent = (Node) simpleNode1;
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = simpleNode0.parent;
      nodeArray0[2] = simpleNode0.parent;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode1;
      nodeArray0[5] = (Node) simpleNode1;
      nodeArray0[6] = simpleNode0.parent;
      simpleNode1.children = nodeArray0;
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetParent();
      // Undeclared exception!
      try { 
        simpleNode1.dump("3%d!AZ!<X?O0;o", (Writer) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3102
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.656172573771422
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((String) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.toString();
      simpleNode0.parser = javaParser0;
      SystemInUtil.addInputLine("CompilationUnit");
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.parser = javaParser0;
      SimpleNode simpleNode1 = new SimpleNode(simpleNode0.parser, 0);
      simpleNode0.jjtAddChild(simpleNode1, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtGetNumChildren();
      simpleNode1.dump("cM7AdlpX^", stringWriter0);
      simpleNode0.jjtGetChild(0);
      simpleNode1.toString();
      simpleNode0.toString("1Cn2%Y<#&fU.S");
      simpleNode1.jjtAddChild(simpleNode0, 0);
      simpleNode0.parser.TypeParameter();
      simpleNode0.toString();
      simpleNode0.id = 0;
      SimpleNode simpleNode2 = new SimpleNode((-4790));
      SimpleNode simpleNode3 = new SimpleNode(simpleNode0.parser, (-4790));
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = (Node) simpleNode3;
      SimpleNode simpleNode4 = new SimpleNode(0);
      // Undeclared exception!
      try { 
        simpleNode4.jjtGetChild(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.509302654775905
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("Q\"nH");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 1);
      StringWriter stringWriter0 = new StringWriter(1);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString();
      simpleNode0.setIdentifier("~(o:");
      simpleNode0.dump("Q\"nH", stringWriter0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      simpleNode0.toString();
      simpleNode0.setIdentifier("}");
      simpleNode0.dump("PackageDeclaration : ~(o:", stringWriter0);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.dump("Q\"nH", stringWriter0);
      stringWriter1.write("PackageDeclaration");
      simpleNode0.dump("<=", stringWriter0);
      assertEquals("<PackageDeclaration>\n  <identifier>~(o:</identifier>\n</PackageDeclaration>\n<PackageDeclaration>\n  <identifier>~(o:</identifier>\n</PackageDeclaration>\n<PackageDeclaration>\n  <identifier>~(o:</identifier>\n</PackageDeclaration>\n<PackageDeclaration>\n  <identifier>~(o:</identifier>\n</PackageDeclaration>\n", stringWriter0.toString());
      
      simpleNode0.jjtGetParent();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5053323423826157
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "{";
      JavaParser javaParser0 = new JavaParser("{");
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 23);
      simpleNode0.toString();
      simpleNode0.setIdentifier("{");
      String string1 = "h[S!Ij9*b%I99DjUr";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "h[S!Ij9*b%I99DjUr");
      simpleNode0.dump("h[S!Ij9*b%I99DjUr", stringWriter0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "FormalParameters");
      simpleNode0.dump("h[S!Ij9*b%I99DjUr", stringWriter0);
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile("Annotation", "h[S!Ij9*b%I99DjUr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"h[S!Ij9*b%I99DjUr\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.2381744996028692
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "";
      JavaParser javaParser0 = new JavaParser("");
      StringWriter stringWriter0 = new StringWriter();
      int int0 = 23;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 23);
      simpleNode0.setIdentifier("");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite/projects/19_jmca");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte)44;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      simpleNode0.parser = javaParser0;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "U17");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "h[S!Xj9*b%I99DjUr");
      simpleNode0.dump("h[S!Xj9*b%I99DjUr", stringWriter0);
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile((String) null, "/z,}dG");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"/z,}dG\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3125019625949976
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((String) null);
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.toString();
      simpleNode0.parser = javaParser0;
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.parser = javaParser0;
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      simpleNode0.jjtAddChild(simpleNode1, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtGetChild(0);
      simpleNode1.toString();
      simpleNode0.toString("1Cn2%Y<#&fU.S");
      simpleNode1.jjtAddChild(simpleNode0, 0);
      try { 
        simpleNode0.parser.TypeParameter();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.798193215569197
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("Q\"nH");
      int int0 = 8;
      SimpleNode simpleNode0 = new SimpleNode(8);
      StringWriter stringWriter0 = new StringWriter(8);
      simpleNode0.dump("Q\"nH", stringWriter0);
      simpleNode0.jjtGetNumChildren();
      simpleNode0.toString();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "EnumDeclaration");
      simpleNode0.setIdentifier("<=");
      Node node0 = javaParser0.currNode;
      simpleNode0.jjtAddChild((Node) null, 8);
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.dump("h[S!Ij9*b%I99DjUr", stringWriter1);
      simpleNode0.jjtGetChild(8);
      simpleNode0.toString("<=");
      simpleNode0.toString("EnumDeclaration");
      simpleNode0.jjtAddChild((Node) null, 9);
      try { 
        javaParser0.TypeParameter();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 0.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.383963801124849
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((String) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.toString();
      SystemInUtil.addInputLine("MethodDeclarator");
      simpleNode0.jjtAddChild((Node) null, 4);
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      simpleNode0.jjtAddChild((Node) null, 0);
      StringWriter stringWriter0 = new StringWriter();
      simpleNode0.jjtGetNumChildren();
      simpleNode0.dump("cM7AdlpX^", stringWriter0);
      simpleNode0.jjtGetChild(0);
      simpleNode0.toString();
      simpleNode0.toString("F9Bgk%^%Grq");
      simpleNode0.jjtAddChild((Node) null, 0);
      javaParser0.TypeParameter();
      simpleNode0.toString();
      assertEquals(5, simpleNode0.jjtGetNumChildren());
      
      SimpleNode simpleNode2 = new SimpleNode(2327);
      SimpleNode simpleNode3 = new SimpleNode(javaParser0, 2327);
      SimpleNode simpleNode4 = new SimpleNode(4);
      simpleNode3.jjtAddChild(simpleNode1, 4);
      assertEquals(5, simpleNode3.jjtGetNumChildren());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode((-1443615221));
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[4] = (Node) simpleNode0;
      nodeArray0[5] = (Node) simpleNode0;
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild((-1443615221));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1443615221
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7632335152609824
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((String) null);
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.toString();
      Node node0 = null;
      simpleNode0.parser = javaParser0;
      int int1 = 0;
      simpleNode0.jjtAddChild((Node) null, 0);
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      simpleNode0.jjtAddChild(simpleNode1, 0);
      String string0 = "cM7AdlpX^";
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append('Q');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "cM7AdlpX^", 0, 0);
      // Undeclared exception!
      try { 
        simpleNode1.dump(string0, stringWriter2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6694351084945749
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 2169;
      SimpleNode simpleNode0 = new SimpleNode(2169);
      simpleNode0.jjtGetParent();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      simpleNode0.jjtAddChild((Node) null, 2169);
      simpleNode0.jjtAddChild((Node) null, 2169);
      String string0 = "8\"Y?^|:{SmT";
      // Undeclared exception!
      try { 
        simpleNode0.dump("8\"Y?^|:{SmT", (Writer) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2169
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7628073415181629
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((String) null);
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.parser = javaParser0;
      int int1 = 0;
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.parser = javaParser0;
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      simpleNode0.jjtAddChild(simpleNode1, 0);
      String string0 = "cM7AdlpX^";
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('Q');
      simpleNode0.jjtGetNumChildren();
      // Undeclared exception!
      try { 
        simpleNode1.dump(string0, stringWriter0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleNode simpleNode0 = null;
      try {
        simpleNode0 = new SimpleNode((JavaParser) null, (-1450394937));
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
  /*Coverage entropy=2.152095371585596
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser((String) null);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.toString();
      simpleNode0.parser = javaParser0;
      SystemInUtil.addInputLine("CompilationUnit");
      simpleNode0.jjtAddChild((Node) null, 0);
      simpleNode0.parser.TypeArgument();
      simpleNode0.parser = javaParser0;
      SimpleNode simpleNode1 = (SimpleNode)javaParser0.currNode;
      simpleNode0.jjtAddChild(simpleNode1, 0);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append('Q');
      StringWriter stringWriter1 = new StringWriter();
      simpleNode0.jjtGetNumChildren();
      simpleNode1.dump("cM7AdlpX^", stringWriter1);
      SimpleNode simpleNode2 = (SimpleNode)simpleNode0.jjtGetChild(0);
      simpleNode1.toString();
      simpleNode2.toString();
      simpleNode2.toString("cM7AdlpX^");
      SimpleNode simpleNode3 = new SimpleNode(2153);
      simpleNode3.jjtAddChild((Node) null, 3822);
      JavaParser javaParser1 = new JavaParser(javaParser0.token_source);
      try { 
        javaParser1.TypeParameter();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error at line 1, column 16.  Encountered: <EOF>
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParser", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)66;
      byteArray0[1] = (byte) (-88);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-88), (-1));
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (-1), (-1020));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParser javaParser0 = new JavaParser(javaParserTokenManager0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-1));
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
  //Test case number: 15
  /*Coverage entropy=1.5012592323783793
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("Q\"nH");
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[2];
      SimpleNode simpleNode0 = new SimpleNode((-2021692995));
      SimpleNode simpleNode1 = new SimpleNode(javaParser0, 864);
      SimpleNode simpleNode2 = new SimpleNode((-2021692995));
      SimpleNode simpleNode3 = new SimpleNode((-2818));
      // Undeclared exception!
      try { 
        simpleNode3.jjtAddChild(simpleNode2, (-1322));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.157677035511023
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("F\"@");
      StringWriter stringWriter0 = new StringWriter();
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 23);
      simpleNode0.toString();
      simpleNode0.setIdentifier("F\"@");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "h[S!Ij9*b%I99DjUr");
      simpleNode0.dump("h[S!Ij9*b%I99DjUr", stringWriter0);
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile((String) null, "/z,}dG");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"/z,}dG\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0650855968662414
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(30);
      Node[] nodeArray0 = new Node[9];
      SimpleNode simpleNode1 = new SimpleNode((-1));
      nodeArray0[0] = (Node) simpleNode1;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode0;
      nodeArray0[3] = (Node) simpleNode0;
      PipedInputStream pipedInputStream0 = new PipedInputStream(30);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 30);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      JavaParser javaParser0 = new JavaParser(dataInputStream0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      simpleNode0.parser = javaParser0;
      simpleNode1.children = nodeArray0;
      nodeArray0[4] = (Node) simpleNode0;
      pushbackInputStream0.available();
      simpleNode1.jjtAddChild(nodeArray0[2], 10);
      pushbackInputStream0.mark((-1));
      nodeArray0[5] = (Node) simpleNode0;
      nodeArray0[6] = (Node) simpleNode0;
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[0];
      stringWriter0.write(charArray0);
      assertEquals(0, charArray0.length);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5981863871455344
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      String string0 = "Q1}s~@;sjl:";
      simpleNode0.jjtGetParent();
      simpleNode0.jjtSetParent((Node) null);
      Writer writer0 = null;
      Node[] nodeArray0 = new Node[4];
      nodeArray0[0] = null;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = null;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[1] = null;
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.dump("Q1}s~@;sjl:", (Writer) null);
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleNode simpleNode0 = new SimpleNode(2022);
      simpleNode0.id = (-1446756154);
      // Undeclared exception!
      try { 
        simpleNode0.jjtGetChild(2022);
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
      SimpleNode simpleNode0 = new SimpleNode(3332);
      // Undeclared exception!
      try { 
        simpleNode0.toString("ln5\"w#;@QV!'1dhOI/");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3332
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtOpen();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaParser javaParser0 = new JavaParser(stringReader0);
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, 0);
      simpleNode0.jjtClose();
      assertEquals(0, simpleNode0.jjtGetNumChildren());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JavaParser javaParser0 = new JavaParser("ReferenceType");
      SimpleNode simpleNode0 = new SimpleNode(javaParser0, (-2028230356));
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)60;
      byteArray0[1] = (byte)55;
      byteArray0[2] = (byte) (-105);
      byteArray0[3] = (byte)5;
      byteArray0[4] = (byte) (-56);
      byteArray0[5] = (byte)94;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte) (-1);
      byteArray0[8] = (byte) (-59);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      // Undeclared exception!
      try { 
        simpleNode0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2028230356
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3120076729259056
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 0;
      SimpleNode simpleNode0 = new SimpleNode(0);
      String string0 = "Q1}s~@;sjl:";
      SimpleNode simpleNode1 = new SimpleNode(0);
      simpleNode0.jjtSetParent(simpleNode1);
      Writer writer0 = null;
      Node[] nodeArray0 = new Node[4];
      nodeArray0[0] = (Node) simpleNode1;
      nodeArray0[1] = (Node) simpleNode0;
      nodeArray0[2] = (Node) simpleNode1;
      nodeArray0[3] = (Node) simpleNode0;
      nodeArray0[1] = (Node) simpleNode1;
      simpleNode0.children = nodeArray0;
      // Undeclared exception!
      try { 
        simpleNode0.dump("Q1}s~@;sjl:", (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.SimpleNode", e);
      }
  }
}
