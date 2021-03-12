/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 06 16:05:43 GMT 2020
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object) null, (Object) messageFormatter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<MessageFormatter.LoadBundleError> linkedList0 = new LinkedList<MessageFormatter.LoadBundleError>();
      MockThrowable mockThrowable0 = new MockThrowable();
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("resources.messages.standard", mockThrowable0);
      linkedList0.add(messageFormatter_LoadBundleError0);
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = messageFormatter0.listToString(linkedList0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      List list0 = messageFormatter0.listResources("resources.messages.standard", classLoader0);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      MockThrowable mockThrowable0 = new MockThrowable("Could not remove the file, ", applicationException0);
      messageFormatter0.myLastException = (Throwable) mockThrowable0;
      Throwable throwable0 = messageFormatter0.getLastException();
      assertEquals("Could not remove the file, ", throwable0.getMessage());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(byteArrayInputStream0);
      String string0 = messageFormatter0.formatMessage("critical.com.lts.application.errors.resourceBundle.load", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH, (ResourceBundle) propertyResourceBundle0);
      assertNull(string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      String string0 = messageFormatter0.formatMessage("resources.messages.standard", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH, (ResourceBundle) propertyResourceBundle0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("resources.messages.standard");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.2554823251787535
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle(list0, list0, (Locale) null, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) messageFormatter0);
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List) linkedList0, (List) linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.lts.application.international.MessageFormatter cannot be cast to java.lang.String
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("resources.messages.standard", (Object) null, (Object) messageFormatter0, (Object) list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("4&E6`{[%J", messageFormatter0.DEFAULT_BUNDLE_PATH);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.addResourceBundles();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) linkedList0, (List<String>) linkedList0, locale0, classLoader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: ; and resource path: 
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/resources.messages.standard0resources.messages.standard");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "resources.messages.standard");
      File file0 = MockFile.createTempFile("resources.messages.standard", "resources.messages.standard");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(mockFileInputStream0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      String string0 = messageFormatter0.formatMessage("resources.messages.standard", messageFormatter0.DEFAULT_BUNDLE_PATH);
      assertEquals("", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      String string0 = messageFormatter0.listToString(list0);
      assertEquals("java.class, java.properties", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.709472776584213
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      try { 
        messageFormatter0.initializeResourceBundle(list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      try { 
        messageFormatter0.initializeResourceBundle((List) linkedList0, (List) linkedList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: ; and resource path: 
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard");
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) applicationException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.4941751382893085
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("H");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      String string0 = messageFormatter0.getMessage("H", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      assertEquals("", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      File file0 = MockFile.createTempFile("resources.messages.standard", "resources.messages.standard");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(mockFileInputStream0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      try { 
        messageFormatter0.formatMessage("resources.messages.standard", messageFormatter0.DEFAULT_BUNDLE_PATH);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("resources.messages.standard", (Object[]) null, (ResourceBundle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = MessageFormatter.buildList(messageFormatter0.DEFAULT_BUNDLE_PATH);
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.lts.application.international.MessageFormatter$LoadBundleError
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      List list0 = MessageFormatter.buildList(objectArray0);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      try { 
        messageFormatter0.getMessage(", is inconsistent with parent, ", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("+ZWVN]17v2]vM");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Throwable throwable0 = messageFormatter0.getLastException();
      assertNull(throwable0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List) null, (List) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.listResources("; and resource path: ", (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("+ZWVN]17v2]vM");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("0&{lDWgQ]1fB^(2u;x", (Object) "0&{lDWgQ]1fB^(2u;x", (Object) "0&{lDWgQ]1fB^(2u;x", (Object) messageFormatter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }
}
