/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 06:09:59 GMT 2020
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertFalse(technicalInformation0.hasAdditional());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer.main((String[]) null);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      LovinsStemmer.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
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
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  //Test case number: 7
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("fwyz");
      assertEquals("fwys", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9826446443097824
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("earyt");
      assertEquals("earys", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7610604104439116
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("masonet");
      assertEquals("masonet", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ert");
      assertEquals("ers", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.7484466800352509
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("apher");
      assertEquals("apher", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.7652998569343187
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("beirud");
      assertEquals("beirus", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0555295083458403
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lcq &irs6sumlud");
      assertEquals("lcq &irs6sumlus", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ond");
      assertEquals("ons", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.7513802509957538
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erisend");
      assertEquals("erisens", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.7297512257249834
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("end");
      assertEquals("ens", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7652998569343187
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("inpand");
      assertEquals("inpans", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erid");
      assertEquals("eris", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9965393144340896
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("invalid CVS revision - not enough parts separated by dots!");
      assertEquals("invalis cv revis - not enough part separ by dot!", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("cid");
      assertEquals("cis", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vad");
      assertEquals("vas", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9925378778810804
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("isendlux");
      assertEquals("isendluc", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7652998569343187
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pandix");
      assertEquals("pandic", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("bqex");
      assertEquals("bqec", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9897700299385648
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("linguax");
      assertEquals("linguac", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.7841412923355617
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("0'n@evhtex");
      assertNotNull(string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("pex");
      assertEquals("pic", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.7841412923355617
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erisenddex");
      assertEquals("erisenddic", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.7652998569343187
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("5qpbex");
      assertEquals("5qpbic", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.043959843822992
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("z^N{ex ouL%");
      assertEquals("z^n{ex oul%", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0138995869176664
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.");
      assertEquals("a stemmer ba on th lovin stemmer, describ he:\n\njl beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("olv");
      assertEquals("olut", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("metr");
      assertEquals("meter", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("istr");
      assertEquals("ister", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("umpt");
      assertEquals("um", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.9901352687449608
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Induction of decision trees");
      assertEquals("induc of decis tree", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.9757988965482207
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The database key of the entry being cross referenced. Any fields that are missing from the current record are inherited from the field being cross referenced.");
      assertEquals("th databas key of th entr being cros refer. any field that ar mis from th cur record ar inherit from th field being cros refer.", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0020277955309702
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString(".xEppe");
      assertEquals(".xep", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.8170553761180438
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("D`^t{8U56*KL&^LfMgG");
      assertEquals("d`^t{8u56*kl&^lfmg", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0755418123096956
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("JirG+BN/0XdD@S{:ty");
      assertEquals("jirg+bn/0xd@s{:ty", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.1313342621373124
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("w;8bb>t2/z");
      assertEquals("w;8b>t2/z", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.9452994815086471
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("oidal");
      assertEquals("oid", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0023943037715197
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("any addit inform that can help th reader. th first word should be capital.");
      assertEquals("any addit inform that can help th reader. th first word should be capit.", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.7789097596789128
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ical");
      assertEquals("ical", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.015053218185904
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("invalis cv revis - not enough part separ by dot!uad");
      assertEquals("inval cv rev - not enough part separ by dot!uas", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.7770169874638001
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("EDITOR");
      assertEquals("edit", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.7650300532436863
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("Copyright informaton");
      assertEquals("copyright informat", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.7711434885575607
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ation");
      assertEquals("ation", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.7877479783096814
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ities");
      assertEquals("it", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.9629135477582456
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The WWW Universal Resource Locator that points to the item being referenced. This often is used for technical reports to point to the ftp site where the postscript source of the report is located.");
      assertEquals("th www univers resourc loc that point to th item being refer. th oft is us for techn report to point to th ftp sit whes th postscript sourc of th report is loc.", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.9770404475363321
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("String should not finish with ");
      assertEquals("string should not finish with ", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.9869288541846833
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.");
      assertEquals("us for alphab, cro refer, and creat a label when th ``author'' inform is mi. th field should not be confus with th key that appear in th cit command and at th begin of th datab entr.", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.7587346953736293
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("e]Akuz0\"r Jum");
      assertEquals("e]akuz0\"r jum", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0241690268046562
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("F&i_ySYl$2j$");
      assertEquals("f&i_ysyl$2j$", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.9587101091105047
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Usually the address of the publisher or other type of institution. For major publishing houses, van Leunen recommends omitting the information entirely. For small publishers, on the other hand, you can help the reader by giving the complete address.");
      assertEquals("usu th addres of th publishes or other typ of institut. for major publish hous, van leun recommens omis th inform entir. for smal publishes, on th other hand, you can help th reader by giv th comples addres.", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.9481113174336513
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("acies");
      assertEquals("aci", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.9707906975158642
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Proceeding of the Sixteenth International Conference on Machine Learning");
      assertEquals("proceed of th sixteenth intern confer on mach learn", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.7843515160473051
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("icide");
      assertEquals("ic", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.9746415911927695
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.9795276407612141
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.9607162505764949
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The year of publication or, for an unpublished work, the year it was written. Generally it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four nonpunctuation characters are numerals, such as `hbox{(about 1984)}'.");
      assertEquals("th year of public or, for an unpubl work, th year it wa writ. gener it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four nonpunctu character ar numer, such as `hbox{(about 1984)}'.", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }
}
