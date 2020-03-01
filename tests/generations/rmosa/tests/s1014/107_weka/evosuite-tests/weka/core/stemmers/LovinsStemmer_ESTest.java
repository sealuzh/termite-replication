/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 02 15:42:25 GMT 2019
 */

package weka.core.stemmers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.TechnicalInformation;
import weka.core.stemmers.LovinsStemmer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LovinsStemmer_ESTest extends LovinsStemmer_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ULa");
      assertEquals("l", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.49870801033591733
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("Used for lphabeZizing, cross referencing, and9creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      String string0 = lovinsStemmer0.stemString("used for lphabezizing, cross referencing, and9creating a label when the ``author'' information is missing. this field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for lphabez, cros refer, and9creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
      
      lovinsStemmer0.stemString("us for lphabez, cros refer, and9creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.");
      String string1 = lovinsStemmer0.stem("used for lphabezizing, cross referencing, and9creating a label when the ``author'' information is missing. this field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("used for lphabezizing, cross referencing, and9creating a label when the ``author'' information is missing. this field should not be confused with the key that appears in the cite command and at the beginning of the database entry.", string1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.49760765550239233
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stemString("wpP[\"I.hlMlhQ{");
      assertEquals("wp[\"i.hlmlhq{", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("f(/zler<p\"qpher");
      assertEquals("f(/zler<p\"qpher", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stemString(" o=ption.");
      assertEquals(" o=ption.", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("LpJqAR@b07VZ");
      assertNotNull(string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.4782608695652174
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("<O`5JI6@mS_`lxaL@l");
      assertEquals("<o`5ji6@ms_`lxal@l", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("rpt");
      assertEquals("rb", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("istr");
      assertEquals("ister", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4857142857142857
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Array-Dimensions of 'new String[3][4][]': ");
      assertEquals("arra-dimens of 'new string[3][4][]': ", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4666666666666667
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Od< s~@FgG");
      assertEquals("od< s~@fg", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("idOne");
      assertEquals("idon", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.8677758426013722
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("FCip dHBb(1,)R");
      String string1 = lovinsStemmer0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4838709677419355
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stemString("wkv}7pw-fbbex");
      assertEquals("wkv}7pw-fbbic", string0);
      
      String string1 = lovinsStemmer1.stem("wkv}7pw-fbbic");
      assertEquals("wkv}7pw-fb", string1);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4989384288747346
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The number of a journal, magazine, technical report, or of a work in a series. An issue of a journal or magazine is usually identified by its volume and number; the organization that issues a technical report usually gives it a number; and sometimes books are given numbers in a named series.");
      assertEquals("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it volum and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.", string0);
      
      String string1 = lovinsStemmer0.stemString("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it volum and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.");
      assertEquals("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it vol and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.", string1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4864864864864865
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("Th sameVs inproceedings.");
      lovinsStemmer0.stemString("th samev inproceed.");
      // Undeclared exception!
      try { 
        lovinsStemmer0.stemString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Fatal error.");
      assertEquals("fat error.", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
      
      String string1 = lovinsStemmer0.stemString("metr");
      assertEquals("meter", string1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("flax");
      assertEquals("flac", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("umpt");
      assertEquals("um", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("aLrDD`kWVrt");
      assertEquals("alrd`kwvrt", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("otide");
      assertEquals("ot", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("QImunN$')~");
      assertEquals("qimun$')~", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("\"opJon");
      assertEquals("\"opjon", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("rusend");
      assertEquals("rusens", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ancies");
      assertEquals("anci", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4909090909090909
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("invalid CVS revision - not enough parts separated by dots!");
      assertEquals("invalis cv revis - not enough part separ by dot!", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.5813709093577648
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("K^Hwq}U`Wx'DAlSOR>\"");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      // Undeclared exception!
      try { 
        lovinsStemmer0.stemString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("null");
      assertEquals("nl", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lingulusyt");
      assertEquals("lingulusys", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("YEAR");
      assertEquals("year", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("jBor");
      assertEquals("jbor", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.4814814814814815
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("f(kzlerjp\"qpex");
      String string0 = lovinsStemmer0.stemString("puIBg3lyV6*'D-dKqRr");
      assertEquals("puibg3lyv6*'d-dkqr", string0);
      
      String string1 = lovinsStemmer0.stem("ex");
      assertEquals("ex", string1);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rnther");
      assertEquals("rnther", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4925373134328358
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Can't construct a path to file relative to user dir.");
      String string1 = lovinsStemmer0.stemString("LpAR@b0H7VZ)");
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("organization");
      assertEquals("organ", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stem("ionet");
      assertEquals("ionet", string0);
      
      String string1 = lovinsStemmer1.getRevision();
      assertEquals("8034", string1);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("idine");
      assertEquals("id", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("rud");
      assertEquals("rus", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("xhibusyz");
      assertEquals("xhibusys", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("wctert");
      assertEquals("wcters", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("bJ@IX");
      assertEquals("bj@ic", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("yobu4ex");
      assertEquals("yobu4ec", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stem("uct");
      assertEquals("uc", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iness");
      assertEquals("ines", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("a stemmer based on the lovins stemmer, described here:\n\njulie beth lovins (1968). development of a stemming algorithm. mechanical translation and computatinal linguistics. 11:22-31.lud");
      assertEquals("a stemmer based on the lovins stemmer, described here:\n\njulie beth lovins (1968). development of a stemming algorithm. mechanical translation and computatinal linguistics. 11:22-31.lus", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erid");
      assertEquals("eris", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.4666666666666667
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ious");
      assertEquals("ious", string0);
      
      String string1 = lovinsStemmer0.stem("ful");
      assertEquals("fl", string1);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("SERIES");
      assertEquals("ser", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("mit");
      assertEquals("mis", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("alize");
      assertEquals("aliz", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("/zler<p\"qpbex");
      assertEquals("/zler<p\"qpbic", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lux");
      assertEquals("luc", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pex");
      assertEquals("pic", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("end");
      assertEquals("ens", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("intend");
      assertEquals("intens", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pand");
      assertEquals("pans", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("dex");
      assertEquals("dic", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ond");
      assertEquals("ons", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Illegal options: ");
      assertEquals("illeg opt: ", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ional");
      assertEquals("ion", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("incollection");
      assertEquals("incollect", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("0tket");
      assertEquals("0tkes", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ianlid");
      assertEquals("ianlis", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("jju6/*uad");
      assertEquals("jju6/*uas", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("iadgsgfvad");
      assertEquals("iadgsgfvas", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ator");
      assertEquals("at", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("cid");
      assertEquals("cis", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("enly");
      assertEquals("enl", string0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("s'");
      assertEquals("s'", string0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("nesses");
      assertEquals("nes", string0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("inproceedings");
      assertEquals("inproceed", string0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("VTev#7UmD>:N*UM");
      assertEquals("vtev#7umd>:n*um", string0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("her");
      assertEquals("hes", string0);
  }

  /**
  //Test case number: 77
  /*Coverage entropy=0.48000000000000004
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("@`Be<\"");
      assertEquals("@`be<\"", string0);
      
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string1 = lovinsStemmer1.stemString(" E0~{MMO");
      assertEquals(" e0~{m", string1);
      
      String string2 = lovinsStemmer0.stemString("@`be<\"");
      assertEquals("@`be<\"", string2);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ionher");
      assertEquals("ionhes", string0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("rNTT");
      assertEquals("rnt", string0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("Vi>r/-5J4nJOp NI:4s");
      assertEquals("vi>r/-5j4njop ni:4", string0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("rus");
      assertEquals("rus", string0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ioning");
      assertEquals("ion", string0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("izing");
      assertEquals("izing", string0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("anc-?es");
      assertEquals("anc-?", string0);
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.48484848484848486
  */
  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The language the document is in.");
      assertEquals("th langu th docum is in.", string0);
  }

  /**
  //Test case number: 86
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ement");
      assertEquals("ement", string0);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ancy");
      assertEquals("anc", string0);
  }

  /**
  //Test case number: 88
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 89
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("nzljtex");
      assertEquals("nzljtic", string0);
  }

  /**
  //Test case number: 90
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("FIb1pOnfCXGs ;MXTE");
      assertEquals("fib1ponfcxgs ;mxt", string0);
  }

  /**
  //Test case number: 91
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 92
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      String[] stringArray0 = new String[4];
      LovinsStemmer.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=1.0834763040946214
  */
  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("~'");
      String string0 = lovinsStemmer0.stemString("~'");
      assertEquals("~'", string0);
      
      String string1 = lovinsStemmer0.getRevision();
      assertEquals("8034", string1);
  }

  /**
  //Test case number: 94
  /*Coverage entropy=1.0676032882216056
  */
  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("~'");
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
  }

  /**
  //Test case number: 95
  /*Coverage entropy=1.3045974969685552
  */
  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      String string1 = lovinsStemmer0.stem("ful");
      assertEquals("fl", string1);
  }
}
