/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 10:33:29 GMT 2020
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
  /*Coverage entropy=0.9826446443097824
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vctyz");
      assertEquals("vctys", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("uiopyt");
      assertEquals("uiopys", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9691636536778655
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ionet");
      assertEquals("ionet", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("3wcmit");
      assertEquals("3wcmis", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0413047551899708
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("n25/rh]ther");
      assertEquals("n25/rh]ther", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.976388556423862
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Morgan Kaufmann Publishers");
      assertEquals("morgan kaufman publishes", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rud");
      assertEquals("rus", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("amtond");
      assertEquals("amtons", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9734476835888628
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vctend");
      assertEquals("vctens", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.955958987522819
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("asend");
      assertEquals("asens", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9948360687584032
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("oaasrpand");
      assertEquals("oaasrpans", string0);
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
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("cid");
      assertEquals("cis", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.09245409266137
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("probtologod: prob must be in [0,1] uad");
      assertEquals("probtologod: prob must be in [0,1] uas", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0755418123096956
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("oik(b,d2;`o.zlux");
      assertEquals("oik(b,d2;`o.zluc", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0307717730340098
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("*3uix");
      assertEquals("*3uic", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("arex");
      assertEquals("arec", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.7652998569343187
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("eridax");
      assertEquals("eridac", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9925378778810804
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("journtex");
      assertEquals("journtic", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.9897700299385648
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("writpex");
      assertEquals("writpic", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7590639940948603
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("uadex");
      assertEquals("uadic", string0);
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
  /*Coverage entropy=0.9506541676281843
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("eful");
      assertEquals("efl", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("olv");
      assertEquals("olut", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("metr");
      assertEquals("meter", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("istr");
      assertEquals("ister", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("umpt");
      assertEquals("um", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.9958630322510208
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Sorted arry (int))-");
      assertEquals("sort ar (int))-", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0150856991578154
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("xonll,end");
      assertEquals("xonl,ens", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0419832343123245
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("^&^,2Stgg E1f");
      assertEquals("^&^,2stg e1f", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0827778711642795
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("81UC3L>S}pJVF~FdD[$");
      assertEquals("81uc3l>s}pjvf~fd[$", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.8184520769137686
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("21F1{pBb");
      assertEquals("21f1{pb", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0023943037715197
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("any addit inform that can help th reader. th first word should be capital.");
      assertEquals("any addit inform that can help th reader. th first word should be capit.", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0369131388401531
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Ux+(-,.AGaL>");
      assertEquals("ux+(-,.agal>", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0149178222838986
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("n2Par N");
      assertEquals("n2par n", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.9452994815086471
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("editor");
      assertEquals("edit", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0087162067802902
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("get postion of otion -o: lud");
      assertEquals("ges post of otion -o: lus", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.9694057776732247
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Problem reading local properties: ");
      assertEquals("problem read loc propers: ", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.9481113174336513
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ioning");
      assertEquals("ion", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.9452994815086471
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ating");
      assertEquals("ating", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.9498200741363202
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The alternating decision tree learning algorithm");
      assertEquals("th altern decis tre learn algorithm", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.9901352687449608
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Induction of decision trees");
      assertEquals("induc of decis tree", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.9795276407612141
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.9880835235220845
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.lid");
      assertEquals("us for alphab, cro refer, and creat a label when th ``author'' inform is mi. th field should not be confus with th key that appear in th cit command and at th begin of th datab entr.lis", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.9710254376448935
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Fatal error.");
      assertEquals("fat error.", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.7770169874638001
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("editon");
      assertEquals("edit", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0149178222838986
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("52vA0yl Fb");
      assertEquals("52va0yl fb", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.7750898712278264
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("encies");
      assertEquals("enci", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.9992173531757648
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("C4.5: Programs for Machine Learning");
      assertEquals("c4.5: program for mach learn", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.9563968167464134
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("otide");
      assertEquals("ot", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.9622762028626188
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("the year of publication or, for an unpublished work, the year it was written. generally it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four nonpunctuation characters are numerals, such as `hbox{(about 1984)}'.vad");
      assertEquals("th year of public or, for an unpubl work, th year it wa writ. gener it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four nonpunctu character ar numer, such as `hbox{(about 1984)}'.vas", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.9746415911927695
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.9770404475363321
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("String should not finish with ");
      assertEquals("string should not finish with ", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.7587346953736293
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("L`y-lUj*_hUm");
      assertEquals("l`y-luj*_hum", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.7998026680257355
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("F>QF*tZyPp");
      assertEquals("f>qf*tzyp", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer.main((String[]) null);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }
}
