/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 29 06:28:29 GMT 2020
 */

package org.pdfsam.guiclient.commons.models;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class VisualListModel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.pdfsam.guiclient.commons.models.VisualListModel"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/termite/projects/109_pdfsam"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VisualListModel_ESTest_scaffolding.class.getClassLoader() ,
      "org.pdfsam.guiclient.dto.Rotation",
      "org.bouncycastle.asn1.ASN1Sequence",
      "com.lowagie.text.pdf.FdfWriter",
      "com.lowagie.text.pdf.TrueTypeFontUnicode",
      "com.lowagie.text.Jpeg2000",
      "com.lowagie.text.pdf.PdfOCG",
      "com.lowagie.text.Element",
      "com.lowagie.text.pdf.PushbuttonField",
      "com.lowagie.text.pdf.collection.PdfCollectionItem",
      "org.bouncycastle.asn1.DERBMPString",
      "org.bouncycastle.asn1.DERGeneralString",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "org.apache.log4j.Level",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "com.lowagie.text.xml.xmp.LangAlt",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "com.lowagie.text.Annotation",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.bouncycastle.asn1.ocsp.CertID",
      "com.lowagie.text.xml.xmp.PdfA1Schema",
      "com.lowagie.text.pdf.TSAClient",
      "com.lowagie.text.pdf.ColumnText",
      "com.lowagie.text.pdf.CJKFont",
      "com.lowagie.text.pdf.PdfDeveloperExtension",
      "com.lowagie.text.pdf.PdfBoolean",
      "com.lowagie.text.pdf.PdfDocument$RenderingContext",
      "com.lowagie.text.TextElementArray",
      "com.lowagie.text.pdf.PdfChunk",
      "org.apache.log4j.spi.Filter",
      "com.lowagie.text.exceptions.IllegalPdfSyntaxException",
      "org.bouncycastle.asn1.DERPrintableString",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "com.lowagie.text.pdf.PdfEFStream",
      "org.apache.log4j.Layout",
      "org.bouncycastle.asn1.x509.X509ObjectIdentifiers",
      "com.lowagie.text.pdf.PageResources",
      "com.lowagie.text.HeaderFooter",
      "com.lowagie.text.pdf.XfaForm$Xml2Som",
      "org.bouncycastle.ocsp.SingleResp",
      "org.bouncycastle.jce.X509Principal",
      "org.bouncycastle.asn1.DERObject",
      "org.bouncycastle.asn1.LimitedInputStream",
      "com.lowagie.text.LargeElement",
      "com.lowagie.text.ImgJBIG2",
      "com.lowagie.text.pdf.PdfStructureElement",
      "com.lowagie.text.pdf.BaseField",
      "org.bouncycastle.asn1.DERNumericString",
      "com.lowagie.text.pdf.PdfException",
      "org.bouncycastle.ocsp.RespData",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "com.lowagie.text.pdf.PdfPTable",
      "org.apache.log4j.Hierarchy",
      "com.lowagie.text.pdf.DocumentFont",
      "com.lowagie.text.pdf.ColorDetails",
      "org.bouncycastle.asn1.DERApplicationSpecific",
      "com.lowagie.text.pdf.PdfPattern",
      "com.lowagie.text.pdf.PdfRectangle",
      "com.lowagie.text.pdf.PdfArray",
      "com.lowagie.text.pdf.XfaForm$AcroFieldsSearch",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "com.lowagie.text.pdf.PdfPageEvent",
      "org.bouncycastle.asn1.DERUTF8String",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "com.lowagie.text.pdf.XfaForm$Stack2",
      "org.bouncycastle.asn1.x509.X509Name",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.bouncycastle.ocsp.RespID",
      "com.lowagie.text.pdf.PdfStamperImp",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfOutline",
      "org.bouncycastle.asn1.DERVisibleString",
      "org.apache.log4j.helpers.OptionConverter",
      "com.lowagie.text.pdf.PdfSpotColor",
      "com.lowagie.text.ListItem",
      "com.lowagie.text.pdf.XfdfReader",
      "org.bouncycastle.asn1.ASN1Set",
      "org.bouncycastle.ocsp.OCSPException",
      "org.bouncycastle.asn1.ASN1SequenceParser",
      "com.lowagie.text.xml.xmp.XmpReader",
      "org.apache.log4j.or.ObjectRenderer",
      "com.lowagie.text.pdf.PdfAction",
      "com.lowagie.text.pdf.PdfTransition",
      "org.bouncycastle.ocsp.BasicOCSPResp",
      "com.lowagie.text.pdf.PdfStamperImp$PageStamp",
      "org.bouncycastle.asn1.DefiniteLengthInputStream",
      "com.lowagie.text.pdf.XfaForm$Xml2SomDatasets",
      "org.bouncycastle.asn1.DERGeneralizedTime",
      "org.bouncycastle.asn1.ASN1Object",
      "org.bouncycastle.asn1.DEREncodableVector",
      "org.apache.log4j.Category",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "org.bouncycastle.asn1.DERSet",
      "com.lowagie.text.pdf.XfaForm$Xml2SomTemplate",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfSignature",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "org.bouncycastle.asn1.x509.X509DefaultEntryConverter",
      "com.lowagie.text.pdf.PdfStructureTreeRoot",
      "org.apache.log4j.spi.LocationInfo",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "org.bouncycastle.asn1.DERTags",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.collection.PdfCollectionField",
      "com.lowagie.text.pdf.GrayColor",
      "org.apache.log4j.PropertyWatchdog",
      "org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers",
      "org.bouncycastle.asn1.DERUTCTime",
      "org.bouncycastle.asn1.DEROctetString",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.bouncycastle.asn1.ASN1InputStream",
      "com.lowagie.text.DocListener",
      "com.lowagie.text.ImgCCITT",
      "com.lowagie.text.pdf.collection.PdfCollectionSchema",
      "com.lowagie.text.Chunk",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.pdf.PdfPKCS7",
      "com.lowagie.text.pdf.FontMapper",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.PdfDestination",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey",
      "com.lowagie.text.pdf.PdfTable",
      "com.lowagie.text.pdf.PdfImportedPage",
      "org.bouncycastle.asn1.DERIA5String",
      "com.lowagie.text.pdf.PdfNumber",
      "org.bouncycastle.asn1.ASN1Choice",
      "org.bouncycastle.asn1.ASN1EncodableVector",
      "com.lowagie.text.Paragraph",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.bouncycastle.asn1.LazyDERSequence",
      "com.lowagie.text.pdf.PdfPRow",
      "org.apache.log4j.Priority",
      "com.lowagie.text.pdf.PdfGraphics2D$FakeComponent",
      "org.bouncycastle.asn1.DEREnumerated",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.PdfCell",
      "org.apache.log4j.LogManager",
      "com.lowagie.text.pdf.PdfPCell",
      "org.bouncycastle.asn1.DERUniversalString",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfFunction",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.PdfAcroForm",
      "com.lowagie.text.pdf.PdfLine",
      "org.apache.log4j.DefaultCategoryFactory",
      "com.lowagie.text.exceptions.UnsupportedPdfException",
      "com.lowagie.text.pdf.PdfCopyFieldsImp",
      "org.apache.log4j.or.RendererMap",
      "org.bouncycastle.asn1.ASN1OctetString",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfBorderArray",
      "com.lowagie.text.pdf.PdfEncryption",
      "org.bouncycastle.asn1.BERSequence",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.PdfFormXObject",
      "org.bouncycastle.asn1.ASN1TaggedObject",
      "com.lowagie.text.pdf.PRStream",
      "com.lowagie.text.pdf.FontDetails",
      "com.lowagie.text.pdf.PdfShading",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.pdf.PdfPKCS7$X509Name",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfIndirectObject",
      "com.lowagie.text.pdf.TextField",
      "com.lowagie.text.ImgTemplate",
      "com.lowagie.text.pdf.PdfReader",
      "org.apache.log4j.CategoryKey",
      "org.pdfsam.guiclient.dto.VisualPageListItem",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.bouncycastle.asn1.ASN1Null",
      "com.lowagie.text.pdf.StandardDecryption",
      "com.lowagie.text.pdf.XfaForm",
      "org.bouncycastle.asn1.x509.X509Extensions",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "com.lowagie.text.pdf.CMYKColor",
      "org.bouncycastle.asn1.DERTaggedObject",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "org.apache.log4j.helpers.FileWatchdog",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "com.lowagie.text.pdf.PdfPageLabels",
      "com.lowagie.text.pdf.PdfRendition",
      "org.bouncycastle.asn1.IndefiniteLengthInputStream",
      "com.lowagie.text.pdf.PdfDashPattern",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "com.lowagie.text.Table",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.apache.log4j.spi.RootLogger",
      "com.lowagie.text.pdf.PdfStream",
      "com.lowagie.text.pdf.PRAcroForm$FieldInformation",
      "com.lowagie.text.pdf.PdfGraphics2D$1",
      "org.bouncycastle.asn1.x509.X509NameEntryConverter",
      "com.lowagie.text.SplitCharacter",
      "org.apache.log4j.spi.ErrorHandler",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.apache.log4j.spi.RendererSupport",
      "com.lowagie.text.pdf.AcroFields$RevisionStream",
      "org.bouncycastle.asn1.DERUnknownTag",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.ElementListener",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.bouncycastle.asn1.x509.AlgorithmIdentifier",
      "org.bouncycastle.asn1.DEROutputStream",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "org.bouncycastle.asn1.ASN1TaggedObjectParser",
      "com.lowagie.text.exceptions.BadPasswordException",
      "org.bouncycastle.asn1.DERBitString",
      "com.lowagie.text.pdf.collection.PdfCollectionSort",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "org.apache.log4j.Logger",
      "com.lowagie.text.pdf.FdfReader",
      "com.lowagie.text.pdf.PdfImage",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "org.apache.log4j.helpers.LogLog",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "org.bouncycastle.asn1.DERObjectIdentifier",
      "org.bouncycastle.asn1.ASN1OctetStringParser",
      "org.bouncycastle.asn1.DERBoolean",
      "com.lowagie.text.pdf.PdfPage",
      "com.lowagie.text.xml.xmp.XmpArray",
      "com.lowagie.text.pdf.PdfFileSpecification",
      "com.lowagie.text.xml.simpleparser.SimpleXMLDocHandler",
      "org.apache.log4j.spi.RepositorySelector",
      "com.lowagie.text.pdf.StampContent",
      "org.bouncycastle.asn1.DERSequence",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfGState",
      "com.lowagie.text.List",
      "org.pdfsam.guiclient.utils.ImageUtility",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "com.lowagie.text.Rectangle",
      "org.pdfsam.guiclient.commons.models.VisualListModel",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.pdf.HyphenationEvent",
      "org.apache.log4j.or.DefaultRenderer",
      "com.lowagie.text.pdf.PdfAppearance",
      "com.lowagie.text.pdf.PdfTextArray",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "org.bouncycastle.asn1.DERString",
      "com.lowagie.text.exceptions.InvalidPdfException",
      "com.lowagie.text.pdf.AcroFields$Item",
      "org.bouncycastle.ocsp.CertificateID",
      "org.bouncycastle.asn1.DEREncodable",
      "org.bouncycastle.asn1.x509.X509Extension",
      "com.lowagie.text.pdf.PdfColor",
      "org.apache.log4j.PropertyConfigurator",
      "org.bouncycastle.asn1.BERConstructedOctetString",
      "com.lowagie.text.Jpeg",
      "com.lowagie.text.pdf.PdfLayer",
      "com.lowagie.text.ImgRaw",
      "com.lowagie.text.pdf.IntHashtable",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "org.apache.log4j.Appender",
      "com.lowagie.text.pdf.Type1Font",
      "org.bouncycastle.asn1.DERNull",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.pdf.collection.PdfTargetDictionary",
      "com.lowagie.text.pdf.PdfContents",
      "com.lowagie.text.pdf.TrueTypeFont",
      "org.bouncycastle.asn1.ocsp.ResponderID",
      "org.bouncycastle.asn1.ASN1SetParser",
      "com.lowagie.text.pdf.PdfPageLabels$PdfPageLabelFormat",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.bouncycastle.asn1.ASN1Encodable",
      "com.lowagie.text.pdf.PdfReaderInstance",
      "com.lowagie.text.pdf.PRIndirectReference",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.apache.log4j.spi.LoggingEvent",
      "org.bouncycastle.asn1.DERT61String",
      "com.lowagie.text.pdf.BaseFont$StreamFont",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.Font",
      "org.bouncycastle.asn1.DERInteger",
      "com.lowagie.text.Document",
      "com.lowagie.text.pdf.PdfFont",
      "org.apache.log4j.spi.ThrowableInformation",
      "com.lowagie.text.pdf.PdfPSXObject",
      "com.lowagie.text.pdf.PdfResources",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "com.lowagie.text.pdf.PRAcroForm",
      "org.apache.log4j.spi.LoggerRepository",
      "com.lowagie.text.pdf.AcroFields",
      "com.lowagie.text.pdf.OutputStreamEncryption"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VisualListModel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.pdfsam.guiclient.commons.models.VisualListModel",
      "org.pdfsam.guiclient.dto.VisualPageListItem",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.pdfsam.guiclient.utils.ImageUtility",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey"
    );
  }
}
