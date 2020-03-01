/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 16 05:06:56 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.343193896232072
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.flush();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)31;
      pipedInputStream0.mark(21);
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte) (-22);
      pipedOutputStream0.write(byteArray0);
      pipedInputStream0.mark((-183));
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ClassWriter classWriter0 = new ClassWriter(968);
      classWriter0.index = (int) (byte) (-22);
      classWriter0.version = 2;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2173), "]AkBnyu$}Q+cV?KLT*p", "]AkBnyu$}Q+cV?KLT*p", "RuntimeInvisibleAnnotations", "]AkBnyu$}Q+cV?KLT*p");
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(168, byteArray1.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.8361623253853443
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)3;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[3] = (byte) (-22);
      ClassWriter classWriter0 = new ClassWriter(968);
      classWriter0.version = (int) (byte) (-22);
      classWriter0.addType("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2173), "", "&yT6%/-VQh2", "RuntimeInvisibleAnnotations", "&yT6%/-VQh2");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ByteVector byteVector0 = new ByteVector(968);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0225955941538991
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-94));
      String string0 = "org.apache.commons.io.filefilter.SizeFileFilter";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      FileSystemHandling.shouldAllThrowIOExceptions();
      String string1 = "a.i3";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "a.i3");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "a.i3");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2463), "a.i3", "", "a.i3", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ByteVector byteVector1 = byteVector0.putShort(1);
      Attribute attribute0 = new Attribute("");
      byteVector1.putByte(1);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector2 = byteVector1.putShort((-3485));
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3853791671693334
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)3;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[3] = (byte) (-24);
      ClassWriter classWriter0 = new ClassWriter(968);
      classWriter0.version = (int) (byte)49;
      classWriter0.addType("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-24), "", "&yT6%/-VQh2", "RuntimeInvisibleAnnotations", "&yT6%/-VQh2");
      ByteVector byteVector0 = new ByteVector(968);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1061, "", "float", "float", "YH,l");
      classWriter0.toByteArray();
      ByteVector byteVector1 = new ByteVector();
      assertFalse(byteVector1.equals((Object)byteVector0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)9;
      sequenceInputStream0.skip(0L);
      byteArray0[2] = (byte) (-4);
      byteArray0[3] = (byte)9;
      pipedOutputStream0.write(byteArray0);
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(pipedInputStream0, sequenceInputStream0);
      sequenceInputStream0.markSupported();
      pipedInputStream0.close();
      pipedInputStream0.skip(0L);
      SequenceInputStream sequenceInputStream2 = new SequenceInputStream(sequenceInputStream1, sequenceInputStream1);
      ClassWriter classWriter0 = new ClassWriter((-1133));
      ByteVector byteVector0 = new ByteVector();
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-34);
      byteArray1[1] = (byte) (-18);
      byteArray1[2] = (byte)1;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "6O0 a2", "f`gPtJl26AwJ_@DHq!F", (Object) null);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5149189896175943
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65550);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 5, "P/l~4`h%", "P/l~4`h%", "P/l~4`h%", "P/l~4`h%");
      Attribute attribute0 = new Attribute("*;|");
      classWriter0.index = 65550;
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putShort(65535);
      ByteVector byteVector2 = byteVector1.putInt((-3974));
      ByteVector byteVector3 = byteVector2.putByte(1105);
      fieldWriter0.put(byteVector3);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.8659992569610426
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-94));
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.aachecommons.io.filefilter.SizeFileFilter");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      byteVector0.putShort((-268435456));
      ByteVector byteVector1 = byteVector0.putShort(49);
      fieldWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3590669121050878
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1133));
      ByteVector byteVector0 = new ByteVector();
      byteVector0.putByte((byte) (-34));
      ClassWriter classWriter1 = new ClassWriter((byte) (-34));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter1, (-2430), "C(`V-Azs.GBV#h", "f`gPtJl26AwJ_@DHq!F", "C(`V-Azs.GBV#h", "6O0 a2");
      classWriter1.toByteArray();
      ByteVector byteVector1 = byteVector0.putByteArray((byte[]) null, 1, (-3427));
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8659992569610426
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)3;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ClassWriter classWriter0 = new ClassWriter(968);
      classWriter0.version = (int) (byte)45;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Ex");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "mVr2b");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1855, "mVr2b", "mVr2b", "9<W", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      ByteVector byteVector1 = byteVector0.putShort((-308));
      fieldWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5087598483524394
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.flush();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)31;
      pipedInputStream0.mark(21);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-22);
      pipedOutputStream0.write(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ClassWriter classWriter0 = new ClassWriter(968);
      classWriter0.version = 2;
      classWriter0.addType("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte)0, "", "&yT6%\\-VQh2", "", "&yT6%\\-VQh2");
      classWriter0.newDouble(0.0);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        fieldWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4736652318408745
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.flush();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[4];
      pipedInputStream0.mark(83);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte) (-22);
      pipedOutputStream0.write(byteArray0);
      pipedInputStream0.mark((-183));
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ClassWriter classWriter0 = new ClassWriter(968);
      classWriter0.version = 2;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2173), "]AkB|yu$}Q+cV?KLTh*@", "&yT6%\\-VQh2", "RuntimeInvisibleAnnotations", "&yT6%\\-VQh2");
      Attribute attribute0 = new Attribute("RuntimeInvisibleAnnotations");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5038957092877099
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "z[GN;fTb]lAj");
      ClassWriter classWriter0 = new ClassWriter((-94));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(141, "org.apache.commons.io.filefilter.SizeFileFilter", "l", "org.apache.commons.io.filefilter.SizeFileFilter", (Object) null);
      fieldVisitor0.visitAnnotation("org.apache.commons.io.filefilter.SizeFileFilter", false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      int int0 = classWriter0.newClass("");
      assertEquals(4, int0);
      
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "EK[Pn*QU4A", "", "org.apache.commons.io.filefilter.SizeFileFilter", "l");
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(228, byteArray1.length);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4559300455695499
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.flush();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)31;
      pipedInputStream0.mark(21);
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte) (-22);
      pipedOutputStream0.write(byteArray0);
      pipedInputStream0.mark((-183));
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ClassWriter classWriter0 = new ClassWriter(968);
      classWriter0.version = 2;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2173), "]AkB|yu$}Q+cV?KLT*p", "&yT6%\\-VQh2", "RuntimeInvisibleAnnotations", "&yT6%\\-VQh2");
      fieldWriter0.visitAnnotation("H?3A5SC&cZADK>", true);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(239, byteArray1.length);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3905073722975385
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)3;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[3] = (byte) (-22);
      ClassWriter classWriter0 = new ClassWriter(968);
      classWriter0.version = (int) (byte)45;
      classWriter0.addType("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-22), "", "&yT6%/-VQh2", "RuntimeInvisibleAnnotations", "&yT6%/-VQh2");
      ByteVector byteVector0 = new ByteVector(968);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1061, "&yT6%/-VQh2", "float", "float", "YH,l");
      classWriter0.toByteArray();
      ByteVector byteVector1 = new ByteVector();
      // Undeclared exception!
      try { 
        fieldWriter0.put((ByteVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6530704922264126
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-94));
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)7;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)127;
      byteArray0[3] = (byte)9;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte) (-65);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)95;
      byteArray0[8] = (byte) (-91);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "ML#U=-hf", "ML#U=-hf", "org.apache.commons.io.filefilter.SizeFileFilter", "Ljava/lang/Synthetic;");
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.visitEnd();
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("wheel.asm.Frame", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9859526183035509
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65548);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-30), "P/l~t4`h%", "P/l~t4`h%", "5LLR<GWCy@euLZk%Z:", "P/l~t4`h%");
      fieldWriter0.getSize();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("P/l~t4`h%");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.8361623253853443
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1007), "TyckG~C{vaKt{ ", "TyckG~C{vaKt{ ", "TyckG~C{vaKt{ ", "TyckG~C{vaKt{ ");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putShort(4096);
      ByteVector byteVector2 = byteVector1.put11(2, 1286);
      ByteVector byteVector3 = byteVector2.putInt(141);
      ByteVector byteVector4 = byteVector3.putByte((-1007));
      fieldWriter0.put(byteVector4);
      assertSame(byteVector3, byteVector4);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.4223665577792008
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "z[GN;fTb]lAj");
      ClassWriter classWriter0 = new ClassWriter((-94));
      classWriter0.visitField(141, "org.apache.commons.io.filefilter.SizeFileFilter", "l", "org.apache.commons.io.filefilter.SizeFileFilter", (Object) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      int int0 = classWriter0.newClass("");
      assertEquals(4, int0);
      
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "c\"I %T& ", "", "org.apache.commons.io.filefilter.SizeFileFilter", "l");
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(186, byteArray1.length);
      
      int int1 = fieldWriter0.getSize();
      assertEquals(30, int1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8361623253853443
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-94));
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "a.i3");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "XNA5dXK");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.SizeFileFilter");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "a.i3");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2463), "a.i3", "", "a.i3", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ByteVector byteVector1 = byteVector0.putShort(1);
      ByteVector byteVector2 = byteVector1.putShort((-3485));
      fieldWriter0.put(byteVector2);
      assertSame(byteVector2, byteVector1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5876302662159738
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      pipedInputStream0.skip(0L);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(pipedInputStream0, sequenceInputStream0);
      pipedInputStream0.close();
      pipedInputStream0.skip(0L);
      SequenceInputStream sequenceInputStream2 = new SequenceInputStream(sequenceInputStream1, sequenceInputStream1);
      ClassWriter classWriter0 = new ClassWriter((-1133));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 83, "}ZwmBRp)k&>N3,", "", (String) null, (Object) null);
      classWriter0.toByteArray();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("{,W-x/#alqEn%+tL0", false);
      AnnotationVisitor annotationVisitor1 = fieldWriter0.visitAnnotation("", true);
      assertNotSame(annotationVisitor1, annotationVisitor0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = null;
      int int0 = 4043;
      String string0 = "Nsss_l[#0";
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 4043, "", "Nsss_l[#0", "", object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "}%";
      int int0 = (-151);
      ClassWriter classWriter0 = new ClassWriter((-151));
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 968, "IFa6{bR`e{~K~bE7", "IFa6{bR`e{~K~bE7", "IFa6{bR`e{~K~bE7", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@26f874eb
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }
}
