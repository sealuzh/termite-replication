/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 12 10:48:54 GMT 2020
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
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("umpt");
      assertEquals("um", string0);
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
      String[] stringArray0 = new String[21];
      // Undeclared exception!
      try { 
        lovinsStemmer0.stemString(stringArray0[4]);
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9925378778810804
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("f5nsmnyz");
      assertEquals("f5nsmnys", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9992896741139999
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("algori6hmesyt");
      assertEquals("algori6hmesys", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0419832343123245
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("qju{j8h0j(\"mit");
      assertEquals("qju{j8h0j(\"mis", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("xyylud");
      assertEquals("xyylus", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ond");
      assertEquals("ons", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9606472850856451
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ensend");
      assertEquals("ensens", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9597095891352391
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("end");
      assertEquals("ens", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0380811448678886
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("fm21'fgoend");
      assertEquals("fm21'fgoens", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("erid");
      assertEquals("eris", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9814516519612326
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("invalid cvs revision - not dots!uad");
      assertEquals("invalis cv revis - not dot!uas", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9897700299385648
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("cjcrcid");
      assertEquals("cjcrcis", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vad");
      assertEquals("vas", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lux");
      assertEquals("luc", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9854178074261598
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The month in which the work was published or, for an unpublished work, in which it was written. You should use the standard three-letter abbreviation, as described in Appendix B.1.3 of the LaTeX book.");
      assertEquals("th month in which th work wa publ or, for an unpubl work, in which it wa writ. you should us th standard thre-letter abbrevi, as describ in appendic b.1.3 of th latic book.", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9897700299385648
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("linguex");
      assertEquals("linguec", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0072681493954485
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("v0NE^hn0}o6K4AX@*|");
      assertEquals("v0n^hn0}o6k4ac@*|", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9981779203263821
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("strigluspex");
      assertEquals("strigluspic", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0476358757972006
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ogxfx'kdex");
      assertEquals("ogxfx'kdic", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.079444688204918
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("!JOBEX_LGu<Vw");
      assertEquals("!jobic_lgu<vw", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("olv");
      assertEquals("olut", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("metr");
      assertEquals("meter", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("istr");
      assertEquals("ister", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.065800324473905
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rpT`rjk<+3T");
      assertEquals("rb`rjk<+3t", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0580423572703845
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("}c05epP");
      assertEquals("}c05ep", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.9924105424605612
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("null");
      assertEquals("nl", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.021986861945732
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ZGG");
      assertEquals("zg", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.002727982931539
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("probToLogOdds: probability must be in [0,1] ");
      assertEquals("probtologod: prob must be in [0,1] ", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.1599765048130382
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("'Z/TVcBB)Ni[");
      assertEquals("'z/tvcb)ni[", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.9338678807942207
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ecntal");
      assertEquals("ecnt", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.9424669566424351
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ental");
      assertEquals("ent", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0086768778828243
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th pric of th docum.");
      assertEquals("th pr of th docum.", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.9992434019193759
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A part of a book having its own title.");
      assertEquals("a part of a book hav it own titl.", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.9717988770641838
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("\tUses lowercas8 strings.");
      assertEquals("\tus lowercas8 string.", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.9757988965482207
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The database key of the entry being cross referenced. Any fields that are missing from the current record are inherited from the field being cross referenced.");
      assertEquals("th databas key of th entr being cros refer. any field that ar mis from th cur record ar inherit from th field being cros refer.", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.9746415911927695
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.9901352687449608
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Induction of decision trees");
      assertEquals("induc of decis tree", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.9481113174336513
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ement");
      assertEquals("ement", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.9424669566424351
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("eous");
      assertEquals("eous", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0307451919192103
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it volum and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.");
      assertEquals("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it vol and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.7711434885575607
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ation");
      assertEquals("ation", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0369131388401531
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString(";]iX@}D^,kOYL(m?M0");
      assertEquals(";]ix@}d^,koyl(m?m0", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.9694057776732247
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Problem reading local properties: ");
      assertEquals("problem read loc propers: ", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.9707906975158642
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Proceeding of the Sixteenth International Conference on Machine Learning");
      assertEquals("proceed of th sixteenth intern confer on mach learn", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.7843515160473051
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("icide");
      assertEquals("ic", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.9607162505764949
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The year of publication or, for an unpublished work, the year it was written. Generally it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four nonpunctuation characters are numerals, such as `hbox{(about 1984)}'.");
      assertEquals("th year of public or, for an unpubl work, th year it wa writ. gener it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four nonpunctu character ar numer, such as `hbox{(about 1984)}'.", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.9582101602470495
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Name(s) of editor(s), typed as indicated in the LaTeX book. If there is also an author field, then the editor field gives the editor of the book or collection in which the reference appears.");
      assertEquals("nam(s) of edit(s), typ as indic in th latic book. if ther is als an author field, then th edit field giv th edit of th book or collect in which th refer appear.", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.9801318641617499
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("a stemmer based on the lovins stemmer, described here:\n\njulie beth lovins (1968). development of a stemming algorithm. mechanical translation and computational linguistics. 11:22-31.rud");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.rus", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.9836083999733023
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("algorithmher");
      assertEquals("algorithmhes", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.7841412923355617
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("itselfpand");
      assertEquals("itselfpans", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String[] stringArray0 = new String[8];
      LovinsStemmer.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }
}
