//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per odParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="odParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TIME_LASTOB_START" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="TIME_LASTOB_END" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="RECOMMENDED_OD_SPAN" type="{urn:ccsds:schema:ndmxml}dayIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="ACTUAL_OD_SPAN" type="{urn:ccsds:schema:ndmxml}dayIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="OBS_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="OBS_USED" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TRACKS_AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TRACKS_USED" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="RESIDUALS_ACCEPTED" type="{urn:ccsds:schema:ndmxml}percentageType" minOccurs="0"/&gt;
 *         &lt;element name="WEIGHTED_RMS" type="{urn:ccsds:schema:ndmxml}nonNegativeDouble" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odParametersType", propOrder = {
    "comment",
    "timelastobstart",
    "timelastobend",
    "recommendedodspan",
    "actualodspan",
    "obsavailable",
    "obsused",
    "tracksavailable",
    "tracksused",
    "residualsaccepted",
    "weightedrms"
})
public class OdParametersType {

    @XmlElement(name = "COMMENT")
    protected List<String> comment;
    @XmlElement(name = "TIME_LASTOB_START")
    protected String timelastobstart;
    @XmlElement(name = "TIME_LASTOB_END")
    protected String timelastobend;
    @XmlElement(name = "RECOMMENDED_OD_SPAN")
    protected DayIntervalType recommendedodspan;
    @XmlElement(name = "ACTUAL_OD_SPAN")
    protected DayIntervalType actualodspan;
    @XmlElement(name = "OBS_AVAILABLE")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger obsavailable;
    @XmlElement(name = "OBS_USED")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger obsused;
    @XmlElement(name = "TRACKS_AVAILABLE")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tracksavailable;
    @XmlElement(name = "TRACKS_USED")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tracksused;
    @XmlElement(name = "RESIDUALS_ACCEPTED")
    protected PercentageType residualsaccepted;
    @XmlElement(name = "WEIGHTED_RMS")
    protected Double weightedrms;

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOMMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCOMMENT() {
        if (comment == null) {
            comment = new ArrayList<String>();
        }
        return this.comment;
    }

    /**
     * Recupera il valore della proprietà timelastobstart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMELASTOBSTART() {
        return timelastobstart;
    }

    /**
     * Imposta il valore della proprietà timelastobstart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMELASTOBSTART(String value) {
        this.timelastobstart = value;
    }

    /**
     * Recupera il valore della proprietà timelastobend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMELASTOBEND() {
        return timelastobend;
    }

    /**
     * Imposta il valore della proprietà timelastobend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMELASTOBEND(String value) {
        this.timelastobend = value;
    }

    /**
     * Recupera il valore della proprietà recommendedodspan.
     * 
     * @return
     *     possible object is
     *     {@link DayIntervalType }
     *     
     */
    public DayIntervalType getRECOMMENDEDODSPAN() {
        return recommendedodspan;
    }

    /**
     * Imposta il valore della proprietà recommendedodspan.
     * 
     * @param value
     *     allowed object is
     *     {@link DayIntervalType }
     *     
     */
    public void setRECOMMENDEDODSPAN(DayIntervalType value) {
        this.recommendedodspan = value;
    }

    /**
     * Recupera il valore della proprietà actualodspan.
     * 
     * @return
     *     possible object is
     *     {@link DayIntervalType }
     *     
     */
    public DayIntervalType getACTUALODSPAN() {
        return actualodspan;
    }

    /**
     * Imposta il valore della proprietà actualodspan.
     * 
     * @param value
     *     allowed object is
     *     {@link DayIntervalType }
     *     
     */
    public void setACTUALODSPAN(DayIntervalType value) {
        this.actualodspan = value;
    }

    /**
     * Recupera il valore della proprietà obsavailable.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOBSAVAILABLE() {
        return obsavailable;
    }

    /**
     * Imposta il valore della proprietà obsavailable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOBSAVAILABLE(BigInteger value) {
        this.obsavailable = value;
    }

    /**
     * Recupera il valore della proprietà obsused.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOBSUSED() {
        return obsused;
    }

    /**
     * Imposta il valore della proprietà obsused.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOBSUSED(BigInteger value) {
        this.obsused = value;
    }

    /**
     * Recupera il valore della proprietà tracksavailable.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRACKSAVAILABLE() {
        return tracksavailable;
    }

    /**
     * Imposta il valore della proprietà tracksavailable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRACKSAVAILABLE(BigInteger value) {
        this.tracksavailable = value;
    }

    /**
     * Recupera il valore della proprietà tracksused.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRACKSUSED() {
        return tracksused;
    }

    /**
     * Imposta il valore della proprietà tracksused.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRACKSUSED(BigInteger value) {
        this.tracksused = value;
    }

    /**
     * Recupera il valore della proprietà residualsaccepted.
     * 
     * @return
     *     possible object is
     *     {@link PercentageType }
     *     
     */
    public PercentageType getRESIDUALSACCEPTED() {
        return residualsaccepted;
    }

    /**
     * Imposta il valore della proprietà residualsaccepted.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageType }
     *     
     */
    public void setRESIDUALSACCEPTED(PercentageType value) {
        this.residualsaccepted = value;
    }

    /**
     * Recupera il valore della proprietà weightedrms.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWEIGHTEDRMS() {
        return weightedrms;
    }

    /**
     * Imposta il valore della proprietà weightedrms.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWEIGHTEDRMS(Double value) {
        this.weightedrms = value;
    }

}
