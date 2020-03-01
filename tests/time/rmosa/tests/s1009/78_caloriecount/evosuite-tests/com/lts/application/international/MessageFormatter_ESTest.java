/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 23:20:00 GMT 2019
 */

package com.lts.application.international;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.MessageFormatter;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MessageFormatter_ESTest extends MessageFormatter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Child and parent are the same object: ");
      Locale locale0 = Locale.FRANCE;
      ClassLoader.getSystemClassLoader();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      ClassLoader.getSystemClassLoader();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.addBundle((ResourceBundle) null);
      Throwable throwable0 = messageFormatter0.myLastException;
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
  //Test case number: 1
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<MessageFormatter.LoadBundleError> linkedList0 = new LinkedList<MessageFormatter.LoadBundleError>();
      MockThrowable mockThrowable0 = new MockThrowable("7");
      MessageFormatter.LoadBundleError messageFormatter_LoadBundleError0 = new MessageFormatter.LoadBundleError("resources.messages.standard", mockThrowable0);
      linkedList0.add(messageFormatter_LoadBundleError0);
      ApplicationException applicationException0 = messageFormatter0.createLoadException(linkedList0);
      assertEquals("critical.com.lts.application.errors.resourceBundle.load", applicationException0.getKey());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ApplicationException applicationException0 = new ApplicationException("resources.messages.standard", messageFormatter0);
      messageFormatter0.myLastException = (Throwable) applicationException0;
      Throwable throwable0 = messageFormatter0.getLastException();
      ApplicationException applicationException1 = new ApplicationException("[", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH);
      ApplicationException applicationException2 = new ApplicationException(throwable0, "resources.messages.standard", applicationException1, applicationException1);
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("}\"uVs~6N");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("Y/7S^W(qkp`$4k");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      messageFormatter0.listResources("", classLoader0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "<undefined>";
      objectArray0[1] = (Object) stringReader0;
      String string0 = messageFormatter0.formatMessage("Y/7S^W(qkp`$4k", objectArray0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      StringReader stringReader0 = new StringReader("resources.messages.standard");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      messageFormatter0.addBundle(propertyResourceBundle0);
      Object[] objectArray0 = new Object[0];
      try { 
        messageFormatter0.formatMessage("hau1cD:7/quz", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = "critcal.error.unknown";
      LinkedList<MockFileInputStream> linkedList0 = new LinkedList<MockFileInputStream>();
      linkedList0.add((MockFileInputStream) null);
      // Undeclared exception!
      try { 
        messageFormatter0.createLoadException(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  //Test case number: 7
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      String string0 = messageFormatter0.listToString(list0);
      assertEquals("java.class, java.properties", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List list0 = MessageFormatter.buildList((Object[]) null);
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("((DQ;gDsl(MsD|JqZ", (Object) "resources.messages.standard", (Object) "((DQ;gDsl(MsD|JqZ", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("Ko#2|", (Object[]) null, (ResourceBundle) null);
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.listResources("resources.messages.standard", (ClassLoader) null);
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  //Test case number: 13
  /*Coverage entropy=1.5652789553347763
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      try { 
        messageFormatter0.initializeResourceBundle((List<String>) linkedList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: messages; and resource path: 
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      Locale locale0 = Locale.UK;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      classLoader0.getParent();
      List<String> list1 = ResourceBundle.Control.FORMAT_DEFAULT;
      Locale locale1 = null;
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle(list0, list1, (Locale) null, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<ApplicationException> linkedList0 = new LinkedList<ApplicationException>();
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle((List) null, (List) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      Locale locale0 = Locale.FRENCH;
      MessageFormatter messageFormatter0 = new MessageFormatter();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      try { 
        messageFormatter0.initializeResourceBundle(list0, (List<String>) linkedList0, locale0, classLoader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: ; and resource path: java.properties
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        messageFormatter0.initializeResourceBundle(list0, list0, locale0, classLoader0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Could not find any resource bundle give names: java.class; and resource path: java.class
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  //Test case number: 19
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
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
  //Test case number: 20
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      StringReader stringReader0 = new StringReader("com.lts.application.errors.optionSwitchNotAtEnd");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      String string0 = messageFormatter0.formatMessage("com.lts.application.errors.optionSwitchNotAtEnd", (Object[]) null, (ResourceBundle) propertyResourceBundle0);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Object[] objectArray0 = new Object[0];
      StringReader stringReader0 = new StringReader("P0jIOyZD^YiQz");
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle(stringReader0);
      String string0 = messageFormatter0.formatMessage("messages", objectArray0, (ResourceBundle) propertyResourceBundle0);
      assertNull(string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List list0 = messageFormatter0.loadCriticalBundles();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
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
  //Test case number: 24
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        messageFormatter0.initializeResourceBundle(list0, list0, locale0, (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  //Test case number: 26
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage((Throwable) mockThrowable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.initializeResourceBundle();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertEquals(0, linkedList0.size());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
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
  //Test case number: 29
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("tH#iBfaT5<}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      Throwable throwable0 = messageFormatter0.getLastException();
      assertNull(throwable0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.formatMessage("critial.question.quit", (Object[]) messageFormatter0.DEFAULT_BUNDLE_PATH, (ResourceBundle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.getMessage("xihyw9KoS", (Object) "resources.messages.standard", (Object) "xihyw9KoS");
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
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      MessageFormatter messageFormatter0 = new MessageFormatter();
      try { 
        messageFormatter0.getMessage("; and resource path: ", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // com.lts.application.ApplicationMessages.error.keyNotFound
         //
         verifyException("com.lts.application.international.MessageFormatter", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  //Test case number: 35
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = messageFormatter0.listToString(linkedList0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("=", "=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      // Undeclared exception!
      try { 
        messageFormatter0.tryLoad("resources.messages.standard", "lk{aG>=!:hV4:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      String string0 = messageFormatter0.listToString((List<String>) null);
      assertEquals("null", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MessageFormatter messageFormatter0 = new MessageFormatter();
      messageFormatter0.temp();
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      List list0 = MessageFormatter.buildList(objectArray0);
      assertEquals(1, list0.size());
  }
}
