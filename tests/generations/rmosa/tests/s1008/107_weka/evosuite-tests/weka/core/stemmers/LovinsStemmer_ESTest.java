/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 02 07:20:32 GMT 2019
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
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("5LxuM ");
      assertEquals("5lxum ", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("&net");
      assertEquals("&net", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("metr");
      assertEquals("meter", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.582483256410045
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "#";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("Induction of decision trees");
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertFalse(technicalInformation0.hasAdditional());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5834607735165944
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("aceous");
      lovinsStemmer1.stem("ull");
      lovinsStemmer1.stemString("cK{q{9`N^z");
      TechnicalInformation technicalInformation0 = lovinsStemmer1.getTechnicalInformation();
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stemString("olv");
      assertEquals("olut", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("$hbb^CC`");
      assertEquals("$hb^cc`", string0);
      
      String string1 = lovinsStemmer0.stemString("$hb^cc`");
      assertEquals("$hb^cc`", string1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("uct");
      assertEquals("uc", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "type";
      stringArray0[1] = "-h";
      LovinsStemmer.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("#poh]/plGg");
      assertEquals("#poh]/plg", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("FHX$wZSdD");
      assertEquals("fhx$wzsd", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.49870801033591733
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
      
      String string1 = lovinsStemmer0.stemString("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.");
      assertEquals("us for alphab, cro refer, and creat a label when th ``author'' inform is mi. th field should not be confus with th key that appear in th cit command and at th begin of th datab entr.", string1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4968152866242039
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th edit of a book---for exampl, ``second''. th should be an ordin, and should hav th firstletter capital, as shown hes; th standard styl convers to lower cas hen neces.lud");
      assertEquals("th edit of a book---for exampl, ``second''. th should be an ordin, and should hav th firstletter capit, as shown he; th standard styl conver to lower ca hen nec.lus", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("Hg");
      lovinsStemmer0.stem("T|.1Y-");
      String string0 = lovinsStemmer0.stem("v8_UjS\"i@\"Koz]Yl");
      assertEquals("v8_ujs\"i@\"koz]yl", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("otide");
      assertEquals("ot", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rpt");
      assertEquals("rb", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.874099239168671
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray0);
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      stringArray0[2] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[4] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[5] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("ation");
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      String string1 = lovinsStemmer0.stem("Julie Beth Lovins");
      assertEquals("julie beth lovin", string1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("<=rR");
      assertEquals("<=r", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5748027648585858
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("istr");
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
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
  //Test case number: 20
  /*Coverage entropy=0.4979423868312757
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The year of publication or, for an unpublished work, the year it was written. Generally it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four nonpunctuation charaters are numerals, such as `hbox{(about 1984)}'.");
      assertEquals("th year of public or, for an unpubl work, th year it wa writ. gener it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four nonpunctu charater ar numer, such as `hbox{(about 1984)}'.", string0);
      
      String string1 = lovinsStemmer0.stem("istr");
      assertEquals("ister", string1);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("Induction of decision trees");
      assertEquals("induction of decision tree", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("$RTevson:");
      assertEquals("$rtevson:", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("otrud");
      assertEquals("otrus", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stem("rus");
      assertEquals("rus", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rndt4grud");
      assertEquals("rndt4grus", string0);
      
      String string1 = lovinsStemmer0.stem("rndt4grus");
      assertEquals("rndt4grus", string1);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stem("izing");
      assertEquals("izing", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4736842105263158
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("BmL6e*Ppo=O");
      assertEquals("bml6*p=o", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("umpt");
      assertEquals("um", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("uoqtxix");
      assertEquals("uoqtxic", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("1dine");
      assertEquals("1d", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("author");
      assertEquals("author", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("editor");
      assertEquals("edit", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ond");
      assertEquals("ons", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("^(lrnswq[v'gv!letvad");
      assertEquals("^(lrnswq[v'gv!letvas", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("tex");
      assertEquals("tic", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("enttb|Ex");
      assertEquals("enttb|ec", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("^(lrnswq[v'gv!letlud");
      assertEquals("^(lrnswq[v'gv!letlus", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.4838709677419355
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("|iD'b{OeT");
      assertEquals("|id'b{oes", string0);
      
      String string1 = lovinsStemmer0.stem("|id'b{oes");
      assertEquals("|id'b{o", string1);
      
      String string2 = lovinsStemmer0.stemString("y9AlS%");
      assertEquals("y9al%", string2);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("rndt4guad");
      assertEquals("rndt4guas", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("encies");
      assertEquals("enci", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lux");
      assertEquals("luc", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("year");
      assertEquals("year", string0);
      
      String string1 = lovinsStemmer0.stem("oammit");
      assertEquals("oammis", string1);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.49206349206349204
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("wDQPcD~,j6cKI<O@X");
      String string0 = lovinsStemmer0.stemString("The name of the school where a thesis was written.");
      assertEquals("th nam of th school whes a thes wa writ.", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.4666666666666667
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("zg2MAR+G(JO");
      assertEquals("zg2mar+g(jo", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("miscax");
      assertEquals("miscac", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("JOURNAL");
      assertEquals("journ", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ental");
      assertEquals("ent", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("E>yt");
      assertEquals("e>ys", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stemString("M'");
      assertEquals("m'", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("d^(~uT%ySs");
      assertEquals("d^(~ut%ys", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lessness");
      assertEquals("les", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4878048780487805
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The alternating decision tree learning algorithm");
      assertEquals("th altern decis tre learn algorithm", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.4782608695652174
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Normalized again (doubles): ");
      assertEquals("normal again (doubl): ", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("'veul/rndt4go!yz");
      assertEquals("'veul/rndt4go!ys", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pansmit");
      assertEquals("pansmis", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pex");
      assertEquals("pic", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ert");
      assertEquals("ers", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lid");
      assertEquals("lis", string0);
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
      String string0 = lovinsStemmer0.stem("wdqp$cd~,j6cki<o@xpand");
      assertEquals("wdqp$cd~,j6cki<o@xpans", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erid");
      assertEquals("eris", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("\tUseslowercase strings.");
      assertEquals("\tuseslowercas string.", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("enting");
      assertEquals("ent", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("proceeding of the sixteenth international conference on machine learncid");
      assertEquals("proceeding of the sixteenth international conference on machine learncis", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("enttbEx");
      assertEquals("enttbic", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("end");
      assertEquals("ens", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("idend");
      assertEquals("idens", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("cisend");
      assertEquals("cisens", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString(" 'Mz");
      assertEquals(" 'mz", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ucet");
      assertEquals("uces", string0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("linguether");
      assertEquals("linguether", string0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lovinsstemmerher");
      assertEquals("lovinsstemmerhes", string0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("incollection");
      assertEquals("incollect", string0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("aries");
      assertEquals("ar", string0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("arizer");
      assertEquals("arizer", string0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
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
  //Test case number: 77
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("alism");
      assertEquals("alism", string0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("weka.core.stemmers.Stemming");
      assertEquals("weka.core.stemmers.stem", string0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("her");
      assertEquals("hes", string0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("null");
      assertEquals("nl", string0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("als");
      assertEquals("al", string0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("Proceeding of the Sixteenth International Conference on Machine Learning");
      assertEquals("proceeding of the sixteenth international conference on machine learn", string0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=0.4827586206896552
  */
  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The price ofthe document.");
      assertEquals("th pric ofth docum.", string0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("ement");
      lovinsStemmer0.stem(">bBP8`A0;y.v*|T^");
      String string0 = lovinsStemmer0.stem("ement");
      assertEquals("ement", string0);
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("affiliation");
      assertEquals("affili", string0);
  }

  /**
  //Test case number: 86
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      assertEquals("", string0);
  }

  /**
  //Test case number: 88
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("49");
      assertEquals("49", string0);
  }

  /**
  //Test case number: 89
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }

  /**
  //Test case number: 90
  /*Coverage entropy=1.3242481052890929
  */
  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      String string0 = lovinsStemmer0.stem("send");
      assertEquals("sens", string0);
      
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
  }
}
