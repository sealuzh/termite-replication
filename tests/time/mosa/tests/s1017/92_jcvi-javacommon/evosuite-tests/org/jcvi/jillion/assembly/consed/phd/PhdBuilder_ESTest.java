/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 00:56:05 GMT 2020
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.assembly.consed.phd.ArtificialPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhdWholeReadItem;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.PhdBuilder;
import org.jcvi.jillion.assembly.consed.phd.PhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem;
import org.jcvi.jillion.core.Range;
import org.jcvi.jillion.core.pos.PositionSequence;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.trace.chromat.Chromatogram;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PhdBuilder_ESTest extends PhdBuilder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(743L).when(nucleotideSequence0).getLength();
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(743L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(743L, 32767L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("sequence can not be null", nucleotideSequence1, qualitySequence0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("", nucleotideSequence0, qualitySequence1, map0);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      // Undeclared exception!
      try { 
        phdBuilder0.peaks(positionSequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("RP;oR4;wZj", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      DefaultPhdWholeReadItem defaultPhdWholeReadItem0 = new DefaultPhdWholeReadItem(linkedList1);
      linkedList0.add((PhdWholeReadItem) defaultPhdWholeReadItem0);
      PhdBuilder phdBuilder1 = phdBuilder0.wholeReadItems(linkedList0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("channels can not be null", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      DefaultPhdReadTag defaultPhdReadTag0 = new DefaultPhdReadTag("channels can not be null", "35K+j ^UmB$,B!", (Range) null, (Date) null, "first peak position must be >0", "35K+j ^UmB$,B!");
      linkedList0.add((PhdReadTag) defaultPhdReadTag0);
      PhdBuilder phdBuilder1 = phdBuilder0.readTags(linkedList0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks(1773, 1773);
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("!`w5>i3", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks((-566), (-566));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first peak position must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("qualities can not be null", nucleotideSequence0, qualitySequence0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PhdBuilder phdBuilder1 = phdBuilder0.comments(hashMap0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("f&", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.wholeReadItems((List<PhdWholeReadItem>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("-g.w>O3O", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.readTags((List<PhdReadTag>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(448L).when(nucleotideSequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("U1;^oX6J", nucleotideSequence0, (QualitySequence) null);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      // Undeclared exception!
      try { 
        phdBuilder0.peaks(positionSequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("peak spacing must be >0", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.comments((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(32767L).when(nucleotideSequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("U1;^X6J", nucleotideSequence0, (QualitySequence) null);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      DefaultPhd defaultPhd0 = new DefaultPhd("", nucleotideSequence0, qualitySequence0, (PositionSequence) null, (Map<String, String>) null);
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder(defaultPhd0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("U1;^oX6J", nucleotideSequence0, (QualitySequence) null);
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder(artificialPhd0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initial capacity should be > 0 :0
         //
         verifyException("org.jcvi.jillion.internal.core.util.GrowableShortArray", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks();
      Phd phd0 = phdBuilder1.build();
      assertEquals("", phd0.getId());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("org.jcvi.jillion.core.Range$ByteRange", nucleotideSequence0, qualitySequence0);
      Phd phd0 = phdBuilder0.build();
      assertEquals("org.jcvi.jillion.core.Range$ByteRange", phd0.getId());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("r()-2hLVJ$", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks(3880, (-1464));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peak spacing must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // first peak position must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(743L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(743L, 743L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("sequence can not be null", nucleotideSequence0, qualitySequence0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(743L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("sequence can not be null", nucleotideSequence1, qualitySequence1, map0);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      PhdBuilder phdBuilder1 = phdBuilder0.peaks(positionSequence0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(743L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd(" 3yX{tU;KEWK", nucleotideSequence0, qualitySequence0, map0);
      NucleotideSequence nucleotideSequence1 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence1).getLength();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(qualitySequence1).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder(" 3yX{tU;KEWK", nucleotideSequence1, qualitySequence1);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      // Undeclared exception!
      try { 
        phdBuilder0.peaks(positionSequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peaks and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("id can not be null", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.peaks((PositionSequence) null);
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((Phd) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // phd to copy can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      DefaultPhd defaultPhd0 = new DefaultPhd((String) null, (NucleotideSequence) null, qualitySequence0, (PositionSequence) null);
      PhdBuilder phdBuilder0 = new PhdBuilder(defaultPhd0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks();
      // Undeclared exception!
      try { 
        phdBuilder1.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.ArtificialPhd", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((Chromatogram) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // chromatogram can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(2154L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("\"yA#A)", nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sequence and qualities have unequal lengths
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("", nucleotideSequence0, (QualitySequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // qualities can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("JOG}(L?\"2MEt7F^`;S", (NucleotideSequence) null, qualitySequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sequence can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((String) null, nucleotideSequence0, qualitySequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // id can not be null
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("x ", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      PhdBuilder phdBuilder1 = phdBuilder0.readTags(linkedList0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("sequence and qualities have unequal lengths", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.copy();
      assertNotSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("RP;oR4;wZj", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      PhdBuilder phdBuilder1 = phdBuilder0.wholeReadItems(linkedList0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder(" 3yX{tU;KEWK", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.comments(map0);
      assertSame(phdBuilder0, phdBuilder1);
  }
}
