/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 02:44:32 GMT 2020
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.assembly.consed.phd.ArtificialPhd;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhd;
import org.jcvi.jillion.assembly.consed.phd.Phd;
import org.jcvi.jillion.assembly.consed.phd.PhdBuilder;
import org.jcvi.jillion.assembly.consed.phd.PhdReadTag;
import org.jcvi.jillion.assembly.consed.phd.PhdWholeReadItem;
import org.jcvi.jillion.core.pos.PositionSequence;
import org.jcvi.jillion.core.qual.QualitySequence;
import org.jcvi.jillion.core.residue.nt.NucleotideSequence;
import org.jcvi.jillion.internal.trace.chromat.BasicChromatogram;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannel;
import org.jcvi.jillion.internal.trace.chromat.DefaultChannelGroup;
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
      doReturn(32L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(148L).when(qualitySequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("JodgiS`N-.", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("-'-v;\"A9nE`m|", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      linkedList0.add((PhdWholeReadItem) null);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      linkedList0.add((PhdReadTag) null);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("gapped offset ", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks(1, 1);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("GYt.", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks((-4300), (-4300));
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
      PhdBuilder phdBuilder0 = new PhdBuilder("org.jcvi.jillion.core.Range$EmptyShortRange", nucleotideSequence0, qualitySequence0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      PhdBuilder phdBuilder1 = phdBuilder0.comments(map0);
      assertSame(phdBuilder1, phdBuilder0);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("inputstream can not be null", nucleotideSequence0, qualitySequence0);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("-j\"&fIzUJ$Eg4|)l", nucleotideSequence0, qualitySequence0);
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
      doReturn(1507L).when(nucleotideSequence0).getLength();
      ArtificialPhd artificialPhd0 = new ArtificialPhd("", nucleotideSequence0, (QualitySequence) null, 2546);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
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
      DefaultPhd defaultPhd0 = new DefaultPhd("org.jcvi.jillion.core.Range", nucleotideSequence0, (QualitySequence) null, (PositionSequence) null, (Map<String, String>) null);
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
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("5XK{HT:\b~ct'K^H0c", nucleotideSequence0, qualitySequence0);
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
  //Test case number: 12
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("chromatogram can not be null", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.fakePeaks();
      Phd phd0 = phdBuilder1.build();
      assertEquals("chromatogram can not be null", phd0.getId());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("inputstream can not be null", nucleotideSequence0, qualitySequence0);
      Phd phd0 = phdBuilder0.build();
      assertEquals("inputstream can not be null", phd0.getId());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("[", nucleotideSequence0, qualitySequence0);
      // Undeclared exception!
      try { 
        phdBuilder0.fakePeaks(13, (-2485));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // peak spacing must be >0
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.PhdBuilder", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("qualities can not be null", nucleotideSequence0, qualitySequence0);
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
  //Test case number: 16
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(32L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("JodgiS`N-.", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
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
  //Test case number: 17
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(20L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(20L).when(qualitySequence0).getLength();
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("Index: ", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder0 = new PhdBuilder(artificialPhd0);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      PhdBuilder phdBuilder1 = phdBuilder0.peaks(positionSequence0);
      assertSame(phdBuilder1, phdBuilder0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("length can not be negative", nucleotideSequence0, qualitySequence0);
      PhdBuilder phdBuilder1 = phdBuilder0.peaks((PositionSequence) null);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  //Test case number: 20
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      DefaultPhd defaultPhd0 = new DefaultPhd("", (NucleotideSequence) null, qualitySequence0, (PositionSequence) null);
      PhdBuilder phdBuilder0 = new PhdBuilder(defaultPhd0);
      phdBuilder0.fakePeaks();
      // Undeclared exception!
      try { 
        phdBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.assembly.consed.phd.ArtificialPhd", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1507L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      ArtificialPhd artificialPhd0 = ArtificialPhd.createNewbler454Phd("", nucleotideSequence0, qualitySequence0);
      PositionSequence positionSequence0 = artificialPhd0.getPositionSequence();
      QualitySequence qualitySequence1 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L, 0L, 0L, 0L).when(qualitySequence1).getLength();
      DefaultChannel defaultChannel0 = new DefaultChannel(qualitySequence1, positionSequence0);
      DefaultChannelGroup defaultChannelGroup0 = new DefaultChannelGroup(defaultChannel0, defaultChannel0, defaultChannel0, defaultChannel0);
      BasicChromatogram basicChromatogram0 = new BasicChromatogram("", nucleotideSequence0, qualitySequence0, positionSequence0, defaultChannelGroup0);
      PhdBuilder phdBuilder0 = new PhdBuilder(basicChromatogram0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(1490L).when(qualitySequence0).getLength();
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("R", nucleotideSequence0, qualitySequence0);
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
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder("r5", (NucleotideSequence) null, (QualitySequence) null);
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
      PhdBuilder phdBuilder0 = null;
      try {
        phdBuilder0 = new PhdBuilder((String) null, nucleotideSequence0, (QualitySequence) null);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("org.jcvi.jillion.core.pos.Position", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdReadTag> linkedList0 = new LinkedList<PhdReadTag>();
      PhdBuilder phdBuilder1 = phdBuilder0.readTags(linkedList0);
      assertSame(phdBuilder1, phdBuilder0);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("R", nucleotideSequence0, qualitySequence0);
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
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      LinkedList<PhdWholeReadItem> linkedList0 = new LinkedList<PhdWholeReadItem>();
      PhdBuilder phdBuilder1 = phdBuilder0.wholeReadItems(linkedList0);
      assertSame(phdBuilder0, phdBuilder1);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NucleotideSequence nucleotideSequence0 = mock(NucleotideSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(nucleotideSequence0).getLength();
      QualitySequence qualitySequence0 = mock(QualitySequence.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(qualitySequence0).getLength();
      PhdBuilder phdBuilder0 = new PhdBuilder("", nucleotideSequence0, qualitySequence0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PhdBuilder phdBuilder1 = phdBuilder0.comments(hashMap0);
      assertSame(phdBuilder0, phdBuilder1);
  }
}
