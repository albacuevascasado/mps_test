//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mps.data_model.From_XML_Messages package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MPREPORT_QNAME = new QName("", "MP_REPORT");
    private final static QName _Oem_QNAME = new QName("", "oem");
    private final static QName _PUW_QNAME = new QName("", "PUW");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mps.data_model.From_XML_Messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TCPDataBlock }
     * 
     */
    public TCPDataBlock createTCPDataBlock() {
        return new TCPDataBlock();
    }

    /**
     * Create an instance of {@link SRHeaderType }
     * 
     */
    public SRHeaderType createSRHeaderType() {
        return new SRHeaderType();
    }

    /**
     * Create an instance of {@link SRMPReportType }
     * 
     */
    public SRMPReportType createSRMPReportType() {
        return new SRMPReportType();
    }

    /**
     * Create an instance of {@link TCPDataBlock.TCPBody }
     * 
     */
    public TCPDataBlock.TCPBody createTCPDataBlockTCPBody() {
        return new TCPDataBlock.TCPBody();
    }

    /**
     * Create an instance of {@link TCPDataBlock.TCPBody.TCPCommandList }
     * 
     */
    public TCPDataBlock.TCPBody.TCPCommandList createTCPDataBlockTCPBodyTCPCommandList() {
        return new TCPDataBlock.TCPBody.TCPCommandList();
    }

    /**
     * Create an instance of {@link TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity }
     * 
     */
    public TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity createTCPDataBlockTCPBodyTCPCommandListTCPCommandActivity() {
        return new TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity();
    }

    /**
     * Create an instance of {@link TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList }
     * 
     */
    public TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList createTCPDataBlockTCPBodyTCPCommandListTCPCommandActivityTCPParameterList() {
        return new TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList();
    }

    /**
     * Create an instance of {@link SRPUWType }
     * 
     */
    public SRPUWType createSRPUWType() {
        return new SRPUWType();
    }

    /**
     * Create an instance of {@link SRMPReportMsgType }
     * 
     */
    public SRMPReportMsgType createSRMPReportMsgType() {
        return new SRMPReportMsgType();
    }

    /**
     * Create an instance of {@link OemType }
     * 
     */
    public OemType createOemType() {
        return new OemType();
    }

    /**
     * Create an instance of {@link TCPDataBlock.TCPHeader }
     * 
     */
    public TCPDataBlock.TCPHeader createTCPDataBlockTCPHeader() {
        return new TCPDataBlock.TCPHeader();
    }

    /**
     * Create an instance of {@link OemCovarianceMatrixType }
     * 
     */
    public OemCovarianceMatrixType createOemCovarianceMatrixType() {
        return new OemCovarianceMatrixType();
    }

    /**
     * Create an instance of {@link OpmCovarianceMatrixType }
     * 
     */
    public OpmCovarianceMatrixType createOpmCovarianceMatrixType() {
        return new OpmCovarianceMatrixType();
    }

    /**
     * Create an instance of {@link PositionCovarianceType }
     * 
     */
    public PositionCovarianceType createPositionCovarianceType() {
        return new PositionCovarianceType();
    }

    /**
     * Create an instance of {@link VelocityCovarianceType }
     * 
     */
    public VelocityCovarianceType createVelocityCovarianceType() {
        return new VelocityCovarianceType();
    }

    /**
     * Create an instance of {@link PositionVelocityCovarianceType }
     * 
     */
    public PositionVelocityCovarianceType createPositionVelocityCovarianceType() {
        return new PositionVelocityCovarianceType();
    }

    /**
     * Create an instance of {@link DeltamassType }
     * 
     */
    public DeltamassType createDeltamassType() {
        return new DeltamassType();
    }

    /**
     * Create an instance of {@link GmType }
     * 
     */
    public GmType createGmType() {
        return new GmType();
    }

    /**
     * Create an instance of {@link InclinationType }
     * 
     */
    public InclinationType createInclinationType() {
        return new InclinationType();
    }

    /**
     * Create an instance of {@link NdmHeader }
     * 
     */
    public NdmHeader createNdmHeader() {
        return new NdmHeader();
    }

    /**
     * Create an instance of {@link SpacecraftParametersType }
     * 
     */
    public SpacecraftParametersType createSpacecraftParametersType() {
        return new SpacecraftParametersType();
    }

    /**
     * Create an instance of {@link StateVectorType }
     * 
     */
    public StateVectorType createStateVectorType() {
        return new StateVectorType();
    }

    /**
     * Create an instance of {@link StateVectorAccType }
     * 
     */
    public StateVectorAccType createStateVectorAccType() {
        return new StateVectorAccType();
    }

    /**
     * Create an instance of {@link QuaternionType }
     * 
     */
    public QuaternionType createQuaternionType() {
        return new QuaternionType();
    }

    /**
     * Create an instance of {@link QuaternionRateType }
     * 
     */
    public QuaternionRateType createQuaternionRateType() {
        return new QuaternionRateType();
    }

    /**
     * Create an instance of {@link QuaternionDotType }
     * 
     */
    public QuaternionDotType createQuaternionDotType() {
        return new QuaternionDotType();
    }

    /**
     * Create an instance of {@link RotationAngleType }
     * 
     */
    public RotationAngleType createRotationAngleType() {
        return new RotationAngleType();
    }

    /**
     * Create an instance of {@link RotationAngleComponentTypeold }
     * 
     */
    public RotationAngleComponentTypeold createRotationAngleComponentTypeold() {
        return new RotationAngleComponentTypeold();
    }

    /**
     * Create an instance of {@link RotationAngleComponentType }
     * 
     */
    public RotationAngleComponentType createRotationAngleComponentType() {
        return new RotationAngleComponentType();
    }

    /**
     * Create an instance of {@link RotationRateType }
     * 
     */
    public RotationRateType createRotationRateType() {
        return new RotationRateType();
    }

    /**
     * Create an instance of {@link RotationRateComponentTypeOLD }
     * 
     */
    public RotationRateComponentTypeOLD createRotationRateComponentTypeOLD() {
        return new RotationRateComponentTypeOLD();
    }

    /**
     * Create an instance of {@link RotationRateComponentType }
     * 
     */
    public RotationRateComponentType createRotationRateComponentType() {
        return new RotationRateComponentType();
    }

    /**
     * Create an instance of {@link OdParametersType }
     * 
     */
    public OdParametersType createOdParametersType() {
        return new OdParametersType();
    }

    /**
     * Create an instance of {@link DayIntervalType }
     * 
     */
    public DayIntervalType createDayIntervalType() {
        return new DayIntervalType();
    }

    /**
     * Create an instance of {@link LengthType }
     * 
     */
    public LengthType createLengthType() {
        return new LengthType();
    }

    /**
     * Create an instance of {@link UserDefinedType }
     * 
     */
    public UserDefinedType createUserDefinedType() {
        return new UserDefinedType();
    }

    /**
     * Create an instance of {@link UserDefinedParameterType }
     * 
     */
    public UserDefinedParameterType createUserDefinedParameterType() {
        return new UserDefinedParameterType();
    }

    /**
     * Create an instance of {@link Ms2Type }
     * 
     */
    public Ms2Type createMs2Type() {
        return new Ms2Type();
    }

    /**
     * Create an instance of {@link Km2Type }
     * 
     */
    public Km2Type createKm2Type() {
        return new Km2Type();
    }

    /**
     * Create an instance of {@link Km2SType }
     * 
     */
    public Km2SType createKm2SType() {
        return new Km2SType();
    }

    /**
     * Create an instance of {@link Km2S2Type }
     * 
     */
    public Km2S2Type createKm2S2Type() {
        return new Km2S2Type();
    }

    /**
     * Create an instance of {@link AccType }
     * 
     */
    public AccType createAccType() {
        return new AccType();
    }

    /**
     * Create an instance of {@link AngleRateType }
     * 
     */
    public AngleRateType createAngleRateType() {
        return new AngleRateType();
    }

    /**
     * Create an instance of {@link AngleType }
     * 
     */
    public AngleType createAngleType() {
        return new AngleType();
    }

    /**
     * Create an instance of {@link AreaType }
     * 
     */
    public AreaType createAreaType() {
        return new AreaType();
    }

    /**
     * Create an instance of {@link DistanceType }
     * 
     */
    public DistanceType createDistanceType() {
        return new DistanceType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link DurationType }
     * 
     */
    public DurationType createDurationType() {
        return new DurationType();
    }

    /**
     * Create an instance of {@link FrequencyType }
     * 
     */
    public FrequencyType createFrequencyType() {
        return new FrequencyType();
    }

    /**
     * Create an instance of {@link MassType }
     * 
     */
    public MassType createMassType() {
        return new MassType();
    }

    /**
     * Create an instance of {@link VelocityType }
     * 
     */
    public VelocityType createVelocityType() {
        return new VelocityType();
    }

    /**
     * Create an instance of {@link PercentageType }
     * 
     */
    public PercentageType createPercentageType() {
        return new PercentageType();
    }

    /**
     * Create an instance of {@link AtmosphericReentryParametersType }
     * 
     */
    public AtmosphericReentryParametersType createAtmosphericReentryParametersType() {
        return new AtmosphericReentryParametersType();
    }

    /**
     * Create an instance of {@link GroundImpactParametersType }
     * 
     */
    public GroundImpactParametersType createGroundImpactParametersType() {
        return new GroundImpactParametersType();
    }

    /**
     * Create an instance of {@link RdmSpacecraftParametersType }
     * 
     */
    public RdmSpacecraftParametersType createRdmSpacecraftParametersType() {
        return new RdmSpacecraftParametersType();
    }

    /**
     * Create an instance of {@link RdmPositionType }
     * 
     */
    public RdmPositionType createRdmPositionType() {
        return new RdmPositionType();
    }

    /**
     * Create an instance of {@link RdmVelocityType }
     * 
     */
    public RdmVelocityType createRdmVelocityType() {
        return new RdmVelocityType();
    }

    /**
     * Create an instance of {@link LatType }
     * 
     */
    public LatType createLatType() {
        return new LatType();
    }

    /**
     * Create an instance of {@link BallisticCoeffType }
     * 
     */
    public BallisticCoeffType createBallisticCoeffType() {
        return new BallisticCoeffType();
    }

    /**
     * Create an instance of {@link AltType }
     * 
     */
    public AltType createAltType() {
        return new AltType();
    }

    /**
     * Create an instance of {@link LonType }
     * 
     */
    public LonType createLonType() {
        return new LonType();
    }

    /**
     * Create an instance of {@link MomentType }
     * 
     */
    public MomentType createMomentType() {
        return new MomentType();
    }

    /**
     * Create an instance of {@link OemBody }
     * 
     */
    public OemBody createOemBody() {
        return new OemBody();
    }

    /**
     * Create an instance of {@link OemSegment }
     * 
     */
    public OemSegment createOemSegment() {
        return new OemSegment();
    }

    /**
     * Create an instance of {@link OemMetadata }
     * 
     */
    public OemMetadata createOemMetadata() {
        return new OemMetadata();
    }

    /**
     * Create an instance of {@link OemData }
     * 
     */
    public OemData createOemData() {
        return new OemData();
    }

    /**
     * Create an instance of {@link SRHeaderType.GENERATIONEPOCH }
     * 
     */
    public SRHeaderType.GENERATIONEPOCH createSRHeaderTypeGENERATIONEPOCH() {
        return new SRHeaderType.GENERATIONEPOCH();
    }

    /**
     * Create an instance of {@link SRHeaderType.STARTEPOCH }
     * 
     */
    public SRHeaderType.STARTEPOCH createSRHeaderTypeSTARTEPOCH() {
        return new SRHeaderType.STARTEPOCH();
    }

    /**
     * Create an instance of {@link SRHeaderType.VALIDITY }
     * 
     */
    public SRHeaderType.VALIDITY createSRHeaderTypeVALIDITY() {
        return new SRHeaderType.VALIDITY();
    }

    /**
     * Create an instance of {@link SRMPReportType.SSFFILE }
     * 
     */
    public SRMPReportType.SSFFILE createSRMPReportTypeSSFFILE() {
        return new SRMPReportType.SSFFILE();
    }

    /**
     * Create an instance of {@link SRMPReportType.CMDENTRY }
     * 
     */
    public SRMPReportType.CMDENTRY createSRMPReportTypeCMDENTRY() {
        return new SRMPReportType.CMDENTRY();
    }

    /**
     * Create an instance of {@link TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList.TCPParameter }
     * 
     */
    public TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList.TCPParameter createTCPDataBlockTCPBodyTCPCommandListTCPCommandActivityTCPParameterListTCPParameter() {
        return new TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList.TCPParameter();
    }

    /**
     * Create an instance of {@link SRPUWType.GENERATIONEPOCH }
     * 
     */
    public SRPUWType.GENERATIONEPOCH createSRPUWTypeGENERATIONEPOCH() {
        return new SRPUWType.GENERATIONEPOCH();
    }

    /**
     * Create an instance of {@link SRPUWType.PUWDETAILS }
     * 
     */
    public SRPUWType.PUWDETAILS createSRPUWTypePUWDETAILS() {
        return new SRPUWType.PUWDETAILS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SRMPReportMsgType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SRMPReportMsgType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "MP_REPORT")
    public JAXBElement<SRMPReportMsgType> createMPREPORT(SRMPReportMsgType value) {
        return new JAXBElement<SRMPReportMsgType>(_MPREPORT_QNAME, SRMPReportMsgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OemType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "oem")
    public JAXBElement<OemType> createOem(OemType value) {
        return new JAXBElement<OemType>(_Oem_QNAME, OemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SRPUWType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SRPUWType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PUW")
    public JAXBElement<SRPUWType> createPUW(SRPUWType value) {
        return new JAXBElement<SRPUWType>(_PUW_QNAME, SRPUWType.class, null, value);
    }

}
