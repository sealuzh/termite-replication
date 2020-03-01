/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 15:23:25 GMT 2019
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
import java.io.PushbackInputStream;
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
import wheel.asm.FieldWriter;
import wheel.asm.Item;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.4036780018744388
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(55);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2336), "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "", "wheel.asm.FieldWriter");
      Object object0 = new Object();
      Item item0 = classWriter0.key;
      classWriter0.version = 55;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 55, "wheel.asm.FieldWriter", "", (String) null, "");
      byte[] byteArray0 = classWriter0.toByteArray();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 55, (-2769));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 144
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.343193896232072
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ClassWriter classWriter0 = new ClassWriter(49);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2351), "", "", "+", "");
      Object object0 = new Object();
      classWriter0.version = 49;
      byte[] byteArray1 = classWriter0.toByteArray();
      Object object1 = new Object();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray1, 48, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 63258
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.524886970152835
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "RD%'!a^", "K).$ia(/IJhbC,", "boolean", (Object) null);
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 131072, "org.apache.commons.io.filefilter.OrFileFilter", "y7?dXxI", "boolean", (Object) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-68);
      byteArray0[1] = (byte) (-14);
      byteArray0[2] = (byte)3;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.putUTF8("org.apache.commons.io.filefilter.OrFileFilter");
      ByteVector byteVector1 = byteVector0.putShort(803);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "K).$ia(/IJhbC,");
      ByteVector byteVector2 = byteVector1.putInt(65535);
      fieldWriter1.put(byteVector0);
      fieldWriter1.getSize();
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
  /*Coverage entropy=0.8945706855324711
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 16777220, "", "1?1@Jk8B6cDsRU<O", "RD%'!a^", "'h`pVZFn,8i(3,Icp");
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putByte((-402));
      ByteVector byteVector2 = byteVector1.putShort((-1915));
      ByteVector byteVector3 = byteVector2.put11(4, 131072);
      ByteVector byteVector4 = byteVector3.putUTF8("XO=|<");
      byteVector1.putInt((-3817));
      fieldWriter0.put(byteVector4);
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
  //Test case number: 4
  /*Coverage entropy=1.218839396646019
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 0;
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3533), "LineNumberTable", "wheel.asm.ClassWriter", "wheel.asm.ClassWriter", "Y41Ja!cps");
      FieldWriter fieldWriter1 = classWriter0.lastField;
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter1.visitAttribute(attribute0);
      fieldWriter0.next = fieldWriter1;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.2525306450725109
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      String string0 = "CD~,q3|wm'tv^O\\6V";
      String string1 = "";
      String string2 = "\"[&v'|s&k\"($q5A0n";
      String string3 = "";
      Object object0 = new Object();
      classWriter0.newDouble(4096);
      classWriter0.version = 8;
      String string4 = null;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 8, "", "", (String) null, "");
      Attribute attribute0 = new Attribute(" 9,z|m|?@xL||OQ7");
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
  //Test case number: 6
  /*Coverage entropy=1.4977741869121073
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      classWriter0.addUninitializedType("CD~,q3|wm'tv^O\u0006V", 8);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "CD~,q3|wm'tv^O\u0006V", "\"[&v'|s&k\"($q5A0n", "", "\"[&v'|s&k\"($q5A0n");
      fieldWriter0.visitAnnotation("wheel.asm.FieldWriter", false);
      Object object1 = new Object();
      classWriter0.newDouble(4096);
      classWriter0.version = 8;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "\"[&v'|s&k\"($q5A0n", "wheel.asm.FieldWriter", "", "");
      classWriter0.toByteArray();
      String string0 = null;
      FieldWriter fieldWriter2 = null;
      try {
        fieldWriter2 = new FieldWriter(classWriter0, 8, (String) null, "7ARa;>AX", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      String string0 = null;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "", "", (String) null, (Object) null);
      int int0 = 1048575;
      Attribute attribute0 = new Attribute((String) null);
      Attribute attribute1 = attribute0.next;
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
  //Test case number: 8
  /*Coverage entropy=1.5810899013576878
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2336), "", "", "+", "");
      Object object0 = new Object();
      classWriter0.version = 24;
      classWriter0.toByteArray();
      Object object1 = new Object();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1558), "Deprecated", "m9{/}qiS", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("FlNBu6J!ep<35", true);
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
  //Test case number: 9
  /*Coverage entropy=1.4867324447601016
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2336), "", "", "", "");
      fieldWriter0.visitAnnotation("$9/(j{_Yr,", true);
      Object object0 = new Object();
      Item item0 = classWriter0.key;
      classWriter0.version = 24;
      String string0 = null;
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 24, "wheel.asm.FieldWriter", "", (String) null, "");
      byte[] byteArray0 = classWriter0.toByteArray();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 24, (-2769));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 213
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.536677785543835
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "RD%'!a^", "RD%'!a^", "boolean", (Object) null);
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.OrFileFilter", false);
      fieldWriter0.visitEnd();
      fieldWriter0.getSize();
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("RD%'!a^", false);
      Attribute attribute0 = new Attribute("RD%'!a^");
      PipedInputStream pipedInputStream0 = new PipedInputStream(34);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      PipedInputStream pipedInputStream1 = null;
      try {
        pipedInputStream1 = new PipedInputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0108643020548935
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(1048575);
      fieldWriter0.getSize();
      Attribute attribute0 = new Attribute((String) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = null;
      stringArray0[3] = "";
      // Undeclared exception!
      try { 
        classWriter0.visitMethod(231, "V&T(WoWuOZ_fM=", (String) null, "", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8361623253853443
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131070);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3443), "sQP]@Y@`", "KvX", "y7?dXxI", "sQP]@Y@`");
      ByteVector byteVector0 = new ByteVector(131070);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "y7?dXxI");
      classWriter0.visitInnerClass("Ha(W", "Ha(W", "(Ur", 2);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Deprecated");
      fieldWriter0.put(byteVector0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-68);
      byteArray0[1] = (byte) (-21);
      byteArray0[2] = (byte)3;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ByteVector byteVector1 = new ByteVector(26);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "sQP]@Y@`");
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-21), (byte) (-68));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -13
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "CD~,q3|wm'tv^O\u0006V", "\"[$I&v'Ks&k\"($q5Adn", "", "\"[$I&v'Ks&k\"($q5Adn");
      Object object0 = new Object();
      classWriter0.newDouble(4096);
      classWriter0.version = 8;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-75);
      byteArray0[1] = (byte)15;
      sequenceInputStream0.read(byteArray0, (int) (byte) (-75), (-3205));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1, "pR7^n|K", "CD~,q3|wm'tv^O\u0006V", (String) null, pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.PushbackInputStream@3b09b818
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5087598483524394
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(913);
      byteVector0.putLong((-1L));
      ClassWriter classWriter0 = new ClassWriter(913);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "L>(`", "L>(`", "6aTCw_&,PJy9", (Object) null);
      Object object0 = new Object();
      Item item0 = classWriter0.key;
      Object object1 = new Object();
      classWriter0.toByteArray();
      Object object2 = new Object();
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.CanReadFileFilter");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("6e", true);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.8659992569610426
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131070);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 24, "sQP]@Y@`", "KvX", "y7?dXxI", "sQP]@Y@`");
      ByteVector byteVector0 = new ByteVector(131070);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "(Ur");
      classWriter0.visitInnerClass("Ha(W", "Ha(W", "(Ur", 2);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Deprecated");
      ByteVector byteVector1 = byteVector0.putLong(4294967295L);
      fieldWriter0.put(byteVector1);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-68);
      byteArray0[1] = (byte) (-21);
      byteArray0[2] = (byte)3;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ByteVector byteVector2 = new ByteVector(26);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "sQP]@Y@`");
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-21), (byte) (-68));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -13
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212676);
      classWriter0.newClass("M:u|7e<C");
      FieldWriter fieldWriter0 = classWriter0.lastField;
      classWriter0.lastField = null;
      classWriter0.newInteger(2);
      classWriter0.newFieldItem("RuntimeInvisibleAnnotations", "Ar\"$SX~;?", "ConstantValue");
      classWriter0.index = 285212676;
      classWriter0.newFloat((-1586.727F));
      String string0 = "?eF5#(";
      classWriter0.visitInnerClass("M:u|7e<C", "?eF5#(", "?eF5#(", (-3684));
      classWriter0.newClassItem("M:u|7e<C");
      classWriter0.newFloat(0.0F);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 152, "ConstantValue", "", "", "ConstantValue");
  }
}
