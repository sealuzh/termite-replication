/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 04:18:15 GMT 2020
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
      String[] stringArray0 = new String[1];
      LovinsStemmer.main(stringArray0);
      assertEquals(1, stringArray0.length);
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
  /*Coverage entropy=0.7905698620453724
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("FL_}q('c&<yZ");
      assertEquals("fl_}q('c&<ys", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9925378778810804
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("qrwqbfyt");
      assertEquals("qrwqbfys", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9936432583961486
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString(".BUnETy");
      assertEquals(".bunet", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9826446443097824
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("arert");
      assertEquals("arers", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("mit");
      assertEquals("mis", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9633894941007449
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("weka.core.stemmers.lovinsstemmerher");
      assertEquals("wek.cor.stemmer.lovinsstemmerhes", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9771676162369937
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("coipher");
      assertEquals("coipher", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9897700299385648
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("2kefrud");
      assertEquals("2kefrus", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9897700299385648
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("8034lud");
      assertEquals("8034lus", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.7356907463699587
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ond");
      assertEquals("ons", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7755361553921803
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("nhe7mktend");
      assertEquals("nhe7mktens", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.955958987522819
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("isend");
      assertEquals("isens", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0523657088019276
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("58&hv 1^4:u{end");
      assertEquals("58&hv 1^4:u{ens", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pand");
      assertEquals("pans", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erid");
      assertEquals("eris", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("lid");
      assertEquals("lis", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("eofcid");
      assertEquals("eofcis", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vad");
      assertEquals("vas", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9897700299385648
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("publuad");
      assertEquals("publuas", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9864885932036829
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("1984ix");
      assertEquals("1984ic", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.7708712659660121
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("n=[[yeX");
      assertEquals("n=[[yec", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9826446443097824
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("luxax");
      assertEquals("luxac", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("pex");
      assertEquals("pic", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("dex");
      assertEquals("dic", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("bex");
      assertEquals("bic", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.054849954438863
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("?8(3oUl<");
      assertEquals("?8(3oul<", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0133703568439605
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.tex");
      assertEquals("a stemmer ba on th lovin stemmer, describ he:\n\njl beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.tic", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("olv");
      assertEquals("olut", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("metr");
      assertEquals("meter", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.752099816102316
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("istr");
      assertEquals("ister", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("rpt");
      assertEquals("rb", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.9781835205352001
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("umpt");
      assertEquals("um", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.9671568298620783
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iev");
      assertEquals("ief", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.7938008781487673
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("8V^x]D.pp");
      assertEquals("8v^x]d.p", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0023672066002696
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("}ully");
      assertEquals("}l", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.066197979413553
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("gKPR4+PgGN");
      assertEquals("gkpr4+pgn", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.002727982931539
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("probToLogOdds: probability must be ic [0,1]D");
      assertEquals("probtologod: prob must be ic [0,1]d", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.04781051553442
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("bto>P]7bb\"d#C8?]");
      assertEquals("bt>p]7b\"d#c8?]", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.9424669566424351
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ental");
      assertEquals("ent", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.9481113174336513
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ical");
      assertEquals("ical", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.7691292431918038
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("?)Y!Pqxo@(}0JWekCus");
      assertEquals("?)y!pqxo@(}0jwekc", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.9536627513006996
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("VOLUM");
      assertEquals("vol", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.9582101602470495
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Name(s) of editor(s), typed as indicated in the LaTeX book. If there is also an author field, then the editor field gives the editor of the book or collection in which the reference appears.");
      assertEquals("nam(s) of edit(s), typ as indic in th latic book. if ther is als an author field, then th edit field giv th edit of th book or collect in which th refer appear.", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.9452994815086471
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("izBton");
      assertEquals("izbt", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0276355151602763
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("k_]X82BRq=s;sFRON\"");
      assertEquals("k_]x82brq=s;sfron\"", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0107142161555855
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("eC5,/VNyL");
      assertEquals("ec5,/vn", string0);
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
  /*Coverage entropy=0.9424669566424351
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ancies");
      assertEquals("anci", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.9717988770641838
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("\tUses lowercase strings.");
      assertEquals("\tus lowercas string.", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.9757988965482207
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The database key of the entry being cross referenced. Any fields that are missing from the current record are inherited from the field being cross referenced.");
      assertEquals("th databas key of th entr being cros refer. any field that ar mis from th cur record ar inherit from th field being cros refer.", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.9481113174336513
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ement");
      assertEquals("ement", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0086768778828243
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th pric of th docum.ix");
      assertEquals("th pr of th docum.ix", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.0086768778828243
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th organ that sponsor a confer or that publish a manu.");
      assertEquals("th organ that spons a confer or that publ a manu.", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.9600550878172814
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("An annotatyon. It is not6used by the standar  bibliography styles, but may be used by others that produ8e an annotated bibliography.");
      assertEquals("an annotatyon. it is not6us by th standar  bibliograph styl, but may be us by other that produ8 an annot bibliograph.", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.9918312295324027
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("an annot. it itnotus by th standard bibliograp styl, ut may be us b other that prbduc an antat bibliograph.lux");
      assertEquals("an annot. it itnotus by th standard bibliograp styl, ut may be us b other that prbduc an antat bibliograph.luc", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.9901352687449608
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Induction of decision trees");
      assertEquals("induc of decis tree", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.9883629382453766
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The name of a seies or set of ooks. When citing aK entire book, the the title field gives its title and an optional series field gives the name of a series or multi-vo&u?e set in which the boo@ is pub#ished.");
      assertEquals("th nam of a se or ses of ook. when cit ak entir book, th th titl field giv it titl and an opt ser field giv th nam of a ser or mult-vo&u?e ses in which th bo@ is pub#ish.", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.9770404475363321
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Machine Learning");
      assertEquals("mach learn", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.9563968167464134
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("icide");
      assertEquals("ic", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.9746415911927695
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.9795276407612141
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.9607162505764949
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The year of publication or, for an unpublished work, the year it was written. Generally it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four nonpunctuation characters are nKmerals, such as `hbox{(about 1984)}'.");
      assertEquals("th year of public or, for an unpubl work, th year it wa writ. gener it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four nonpunctu character ar nkmer, such as `hbox{(about 1984)}'.", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LovinsStemmer.main((String[]) null);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }
}
