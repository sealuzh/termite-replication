/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 01:12:50 GMT 2020
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertFalse(technicalInformation0.hasAdditional());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0332280670955154
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("M%PyZ}&zDiykxM@VJA");
      assertEquals("m%pys}&zdiykxm@vj", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("mustyt");
      assertEquals("mustys", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9734476835888628
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("isbnet");
      assertEquals("isbnet", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.053420086729153
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("EtA_+XP");
      assertEquals("es_+xp", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7758353327309706
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("linguert");
      assertEquals("linguers", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9771676162369937
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rynpher");
      assertEquals("rynpher", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("rud");
      assertEquals("rus", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ond");
      assertEquals("ons", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7450373458332782
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("vasend");
      assertEquals("vasens", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9597095891352391
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("end");
      assertEquals("ens", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pand");
      assertEquals("pans", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erid");
      assertEquals("eris", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9664354777046115
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("invalid CVS re5iion - not enough parts separatedby dots!");
      assertEquals("invalis cv re5i - not enough part separatedb dot!", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("cid");
      assertEquals("cis", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("vad");
      assertEquals("vas", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lux");
      assertEquals("luc", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.7905698620453724
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("5!r3t6i,keusex");
      assertEquals("5!r3t6i,keusec", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9826446443097824
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("bicax");
      assertEquals("bicac", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("tex");
      assertEquals("tic", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pex");
      assertEquals("pic", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0332280670955154
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Mxn index (ints)d ");
      assertEquals("mxn indic (int)d ", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("bex");
      assertEquals("bic", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.7380338992685221
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("fulul");
      assertEquals("full", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.7894179773477352
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ULA");
      assertEquals("l", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("olv");
      assertEquals("olut", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("metr");
      assertEquals("meter", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("istr");
      assertEquals("ister", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("rpt");
      assertEquals("rb", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("umpt");
      assertEquals("um", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.9901352687449608
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Induction of decision trees");
      assertEquals("induc of decis tree", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.009303628928396
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("sort arra (doubl): uad");
      assertEquals("sort ar (doubl): uas", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.8021516689494519
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("v<l<6c/XVopp");
      assertEquals("v<l<6c/xvop", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.9795276407612141
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.021986861945732
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("dgg");
      assertEquals("dg", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.002727982931539
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("probToLogOdds: probability must be in [0,1] ");
      assertEquals("probtologod: prob must be in [0,1] ", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.8221492596606643
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("4m9%dXDPbb");
      assertEquals("4m9%dxdpb", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0023943037715197
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("any addit inform that can help th reader. th first word should be capital.");
      assertEquals("any addit inform that can help th reader. th first word should be capit.", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.9710254376448935
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Fatal error.");
      assertEquals("fat error.", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0245115514622898
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("kg7xar/<p=?");
      assertEquals("kg7xar/<p=?", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0182285082539078
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th nam of a ser or ses of book. when cit an entir book, th th titl field giv it titl and an opt ser field giv th nam of a ser or mult-volum ses in which th book is publ.");
      assertEquals("th nam of a ser or se of book. when cit an entir book, th th titl field giv it titl and an opt ser field giv th nam of a ser or mult-vol se in which th book is publ.", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.9452994815086471
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("editor");
      assertEquals("edit", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0023952398714042
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th sponsor institut of a techn report.uas");
      assertEquals("th spons institut of a techn report.ua", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.9854178074261598
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The name of a series or set of books. When citing an entire book, the the title field gives its title and an optional series field gives the name of a series or multi-volume set in which the book is published.");
      assertEquals("th nam of a ser or ses of book. when cit an entir book, th th titl field giv it titl and an opt ser field giv th nam of a ser or mult-volum ses in which th book is publ.", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.7825802782492529
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("idine");
      assertEquals("id", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.9772575137319344
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("usu th addres of th publishes or other typ of institut. for major publish hous, van leun recommens omis th inform entir. for smal publishes, on th other hand, you can help th reader by giv th comples addres.");
      assertEquals("usu th addr of th publish or other typ of institut. for major publ hous, van leun recommen om th inform entir. for smal publish, on th other hand, you can help th reader by giv th compl addr.", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.9869288541846833
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.");
      assertEquals("us for alphab, cro refer, and creat a label when th ``author'' inform is mi. th field should not be confus with th key that appear in th cit command and at th begin of th datab entr.", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0213752682309591
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("z*[1qTsB`EWYYSum,");
      assertEquals("z*[1qtsb`ewyysum,", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.9367490397930263
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ation");
      assertEquals("ation", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0276355151602763
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A>/4FbjX?&SbIQiyl");
      assertEquals("a>/4fbjx?&sbiqiyl", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.7750898712278264
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("encies");
      assertEquals("enci", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.9746415911927695
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.7843515160473051
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("otide");
      assertEquals("ot", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.9629135477582456
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The WWW Universal Resource Locator that points to the item being referenced. This often is used for technical reports to point to the ftp site where the postscript source of the report is located.");
      assertEquals("th www univers resourc loc that point to th item being refer. th oft is us for techn report to point to th ftp sit whes th postscript sourc of th report is loc.", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.9637206475266623
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The year of publication or, for an unpublished work, the year it was written. Generally2it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four n\npunctuation characters are numerals, such as `hbox{(about 1984)}'.");
      assertEquals("th year of public or, for an unpubl work, th year it wa writ. generally2it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four n\npunctu character ar numer, such as `hbox{(about 1984)}'.", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.9770404475363321
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("String should not finish with ");
      assertEquals("string should not finish with ", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.9587101091105047
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Usually the address of the publisher or other type of institution. For major publishing houses, van Leunen recommends omitting the information entirely. For small publishers, on the other hand, you can help the reader by giving the complete address.");
      assertEquals("usu th addres of th publishes or other typ of institut. for major publish hous, van leun recommens omis th inform entir. for smal publishes, on th other hand, you can help th reader by giv th comples addres.", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.7750898712278264
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("idaine");
      assertEquals("idain", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.7905698620453724
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("5!r3t6i,keusix");
      assertEquals("5!r3t6i,keusic", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.7758353327309706
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("atertlud");
      assertEquals("atertlus", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LovinsStemmer.main((String[]) null);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }
}
