/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 13:08:35 GMT 2020
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
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
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
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      assertEquals(0, stringArray0.length);
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
  /*Coverage entropy=0.7590639940948603
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("locyz");
      assertEquals("locys", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9925378778810804
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ml7kk3yt");
      assertEquals("ml7kk3ys", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7827534519281071
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("a stemmer based on the lovins stemmer, described here:\n\njulie beth lovins (1968). development of a stemming algorithm. mechanical translation and computational linguistics. 11:22-31.et");
      assertEquals("a stemmer based on the lovins stemmer, described here:\n\njulie beth lovins (1968). development of a stemming algorithm. mechanical translation and computational linguistics. 11:22-31.es", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ert");
      assertEquals("ers", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("mit");
      assertEquals("mis", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.756202817122221
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("isather");
      assertEquals("isather", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rud");
      assertEquals("rus", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9948360687584032
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("cjklislud");
      assertEquals("cjklislus", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("locond");
      assertEquals("locons", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9606472850856451
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lusend");
      assertEquals("lusens", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7297512257249834
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("end");
      assertEquals("ens", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.7827534519281071
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("lovinsstemmerend");
      assertEquals("lovinsstemmerens", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9897700299385648
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("nd4pand");
      assertEquals("nd4pans", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9925378778810804
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("izaterid");
      assertEquals("izateris", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lid");
      assertEquals("lis", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9801318641617499
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("a stemmer based on the lovins stemmer, described here:\n\njulie beth lovins (1968). development of a stemming algorithm. mechanical translation and computational linguistics. 11:22-31.cid");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.cis", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9992896741139999
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lovinsstemmervad");
      assertEquals("lovinsstemmervas", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ancuad");
      assertEquals("ancuas", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lux");
      assertEquals("luc", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.7905698620453724
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("a part of a book having its own title.ix");
      assertEquals("a part of a book having its own title.ic", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9826446443097824
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("nd4ex");
      assertEquals("nd4ec", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.7652998569343187
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("nd4pex");
      assertEquals("nd4pic", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0011589558066405
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Max index (doubles): ");
      assertEquals("mac indic (doubl): ", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("bex");
      assertEquals("bic", string0);
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
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("istr");
      assertEquals("ister", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rpt");
      assertEquals("rb", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0622403376419547
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("sSs_mi6n>DpP-");
      assertEquals("sss_mi6n>dp-", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.976388556423862
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Morgan Kaufmann Publishers");
      assertEquals("morgan kaufman publishes", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.035198990669421
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("l2IwKGg{Dc3oP");
      assertEquals("l2iwkg{dc3op", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0945525647519037
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Can't add object to itself!");
      assertEquals("can't ad object to itself!", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0361966398786313
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("^gG+hvIBBI*,nD4");
      assertEquals("^gg+hvib*,nd4", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.9710254376448935
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Fatal error.");
      assertEquals("fat error.", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.9717988770641838
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Original array (ints): ");
      assertEquals("origin arra (int): ", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.9481113174336513
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ical");
      assertEquals("ical", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.018621734005797
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Can't find class called: ");
      assertEquals("can't find clas cal: ", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.7877479783096814
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("aSor");
      assertEquals("as", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.7750898712278264
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("encies");
      assertEquals("enci", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.7789097596789128
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ioning");
      assertEquals("ion", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.9896880782456102
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("How something strange has been published. The first worc should be capitalized.");
      assertEquals("how someth strang ha been publ. th first worc should be capital.", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0023943037715197
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("how someth strang ha been publ. th first worc should be capital.");
      assertEquals("how someth strang ha been publ. th first worc should be capit.", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.9452994815086471
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("YEAR");
      assertEquals("year", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.925158237334174
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("cjklislus");
      assertEquals("cjklislus", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.7770169874638001
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("EDITOR");
      assertEquals("edit", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.762949256418777
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("b2t*<`Vw`<syL");
      assertEquals("b2t*<`vw`<syl", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0149178222838986
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("First option split up:");
      assertEquals("first opt split up:", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0089028346629454
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Title of a book, part of which is being cited. See the LaTeX book for how to type titles. For book entries, use the title field instead.");
      assertEquals("titl of a book, part of which is being cit. se th latic book for how to typ titl. for book entr, us th titl field instead.", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.9770404475363321
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Machine Learning");
      assertEquals("mach learn", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.7843515160473051
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("otide");
      assertEquals("ot", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0055696322187884
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A location associated with the entry, such as the city in which a conference took place.");
      assertEquals("a loc associ with th entr, such as th cit in which a confer took plac.", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.9590991014494007
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("key");
      assertEquals("key", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.0366991644381107
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("'dUvc/FsO=_ta3");
      assertEquals("'duvc/fs=_ta3", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String[] stringArray0 = new String[9];
      LovinsStemmer.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }
}
