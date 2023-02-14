//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per groundImpactParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="groundImpactParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PROBABILITY_OF_IMPACT" type="{urn:ccsds:schema:ndmxml}probabilityType" minOccurs="0"/&gt;
 *         &lt;element name="PROBABILITY_OF_BURN_UP" type="{urn:ccsds:schema:ndmxml}probabilityType" minOccurs="0"/&gt;
 *         &lt;element name="PROBABILITY_OF_BREAK_UP" type="{urn:ccsds:schema:ndmxml}probabilityType" minOccurs="0"/&gt;
 *         &lt;element name="PROBABILITY_OF_LAND_IMPACT" type="{urn:ccsds:schema:ndmxml}probabilityType" minOccurs="0"/&gt;
 *         &lt;element name="PROBABILITY_OF_CASUALTY" type="{urn:ccsds:schema:ndmxml}probabilityType" minOccurs="0"/&gt;
 *         &lt;element name="NOMINAL_IMPACT_EPOCH" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_WINDOW_START" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_WINDOW_END" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_REF_FRAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOMINAL_IMPACT_LON" type="{urn:ccsds:schema:ndmxml}lonType" minOccurs="0"/&gt;
 *         &lt;element name="NOMINAL_IMPACT_LAT" type="{urn:ccsds:schema:ndmxml}latType" minOccurs="0"/&gt;
 *         &lt;element name="NOMINAL_IMPACT_ALT" type="{urn:ccsds:schema:ndmxml}altType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_1_CONFIDENCE" type="{urn:ccsds:schema:ndmxml}percentageType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_1_START_LON" type="{urn:ccsds:schema:ndmxml}lonType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_1_START_LAT" type="{urn:ccsds:schema:ndmxml}latType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_1_STOP_LON" type="{urn:ccsds:schema:ndmxml}lonType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_1_STOP_LAT" type="{urn:ccsds:schema:ndmxml}latType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_1_CROSS_TRACK" type="{urn:ccsds:schema:ndmxml}distanceType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_2_CONFIDENCE" type="{urn:ccsds:schema:ndmxml}percentageType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_2_START_LON" type="{urn:ccsds:schema:ndmxml}lonType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_2_START_LAT" type="{urn:ccsds:schema:ndmxml}latType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_2_STOP_LON" type="{urn:ccsds:schema:ndmxml}lonType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_2_STOP_LAT" type="{urn:ccsds:schema:ndmxml}latType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_2_CROSS_TRACK" type="{urn:ccsds:schema:ndmxml}distanceType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_3_CONFIDENCE" type="{urn:ccsds:schema:ndmxml}percentageType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_3_START_LON" type="{urn:ccsds:schema:ndmxml}lonType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_3_START_LAT" type="{urn:ccsds:schema:ndmxml}latType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_3_STOP_LON" type="{urn:ccsds:schema:ndmxml}lonType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_3_STOP_LAT" type="{urn:ccsds:schema:ndmxml}latType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT_3_CROSS_TRACK" type="{urn:ccsds:schema:ndmxml}distanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groundImpactParametersType", propOrder = {
    "comment",
    "probabilityofimpact",
    "probabilityofburnup",
    "probabilityofbreakup",
    "probabilityoflandimpact",
    "probabilityofcasualty",
    "nominalimpactepoch",
    "impactwindowstart",
    "impactwindowend",
    "impactrefframe",
    "nominalimpactlon",
    "nominalimpactlat",
    "nominalimpactalt",
    "impact1CONFIDENCE",
    "impact1STARTLON",
    "impact1STARTLAT",
    "impact1STOPLON",
    "impact1STOPLAT",
    "impact1CROSSTRACK",
    "impact2CONFIDENCE",
    "impact2STARTLON",
    "impact2STARTLAT",
    "impact2STOPLON",
    "impact2STOPLAT",
    "impact2CROSSTRACK",
    "impact3CONFIDENCE",
    "impact3STARTLON",
    "impact3STARTLAT",
    "impact3STOPLON",
    "impact3STOPLAT",
    "impact3CROSSTRACK"
})
public class GroundImpactParametersType {

    @XmlElement(name = "COMMENT")
    protected List<String> comment;
    @XmlElement(name = "PROBABILITY_OF_IMPACT")
    protected Double probabilityofimpact;
    @XmlElement(name = "PROBABILITY_OF_BURN_UP")
    protected Double probabilityofburnup;
    @XmlElement(name = "PROBABILITY_OF_BREAK_UP")
    protected Double probabilityofbreakup;
    @XmlElement(name = "PROBABILITY_OF_LAND_IMPACT")
    protected Double probabilityoflandimpact;
    @XmlElement(name = "PROBABILITY_OF_CASUALTY")
    protected Double probabilityofcasualty;
    @XmlElement(name = "NOMINAL_IMPACT_EPOCH")
    protected String nominalimpactepoch;
    @XmlElement(name = "IMPACT_WINDOW_START")
    protected String impactwindowstart;
    @XmlElement(name = "IMPACT_WINDOW_END")
    protected String impactwindowend;
    @XmlElement(name = "IMPACT_REF_FRAME")
    protected String impactrefframe;
    @XmlElement(name = "NOMINAL_IMPACT_LON")
    protected LonType nominalimpactlon;
    @XmlElement(name = "NOMINAL_IMPACT_LAT")
    protected LatType nominalimpactlat;
    @XmlElement(name = "NOMINAL_IMPACT_ALT")
    protected AltType nominalimpactalt;
    @XmlElement(name = "IMPACT_1_CONFIDENCE")
    protected PercentageType impact1CONFIDENCE;
    @XmlElement(name = "IMPACT_1_START_LON")
    protected LonType impact1STARTLON;
    @XmlElement(name = "IMPACT_1_START_LAT")
    protected LatType impact1STARTLAT;
    @XmlElement(name = "IMPACT_1_STOP_LON")
    protected LonType impact1STOPLON;
    @XmlElement(name = "IMPACT_1_STOP_LAT")
    protected LatType impact1STOPLAT;
    @XmlElement(name = "IMPACT_1_CROSS_TRACK")
    protected DistanceType impact1CROSSTRACK;
    @XmlElement(name = "IMPACT_2_CONFIDENCE")
    protected PercentageType impact2CONFIDENCE;
    @XmlElement(name = "IMPACT_2_START_LON")
    protected LonType impact2STARTLON;
    @XmlElement(name = "IMPACT_2_START_LAT")
    protected LatType impact2STARTLAT;
    @XmlElement(name = "IMPACT_2_STOP_LON")
    protected LonType impact2STOPLON;
    @XmlElement(name = "IMPACT_2_STOP_LAT")
    protected LatType impact2STOPLAT;
    @XmlElement(name = "IMPACT_2_CROSS_TRACK")
    protected DistanceType impact2CROSSTRACK;
    @XmlElement(name = "IMPACT_3_CONFIDENCE")
    protected PercentageType impact3CONFIDENCE;
    @XmlElement(name = "IMPACT_3_START_LON")
    protected LonType impact3STARTLON;
    @XmlElement(name = "IMPACT_3_START_LAT")
    protected LatType impact3STARTLAT;
    @XmlElement(name = "IMPACT_3_STOP_LON")
    protected LonType impact3STOPLON;
    @XmlElement(name = "IMPACT_3_STOP_LAT")
    protected LatType impact3STOPLAT;
    @XmlElement(name = "IMPACT_3_CROSS_TRACK")
    protected DistanceType impact3CROSSTRACK;

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
     * Recupera il valore della proprietà probabilityofimpact.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPROBABILITYOFIMPACT() {
        return probabilityofimpact;
    }

    /**
     * Imposta il valore della proprietà probabilityofimpact.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPROBABILITYOFIMPACT(Double value) {
        this.probabilityofimpact = value;
    }

    /**
     * Recupera il valore della proprietà probabilityofburnup.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPROBABILITYOFBURNUP() {
        return probabilityofburnup;
    }

    /**
     * Imposta il valore della proprietà probabilityofburnup.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPROBABILITYOFBURNUP(Double value) {
        this.probabilityofburnup = value;
    }

    /**
     * Recupera il valore della proprietà probabilityofbreakup.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPROBABILITYOFBREAKUP() {
        return probabilityofbreakup;
    }

    /**
     * Imposta il valore della proprietà probabilityofbreakup.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPROBABILITYOFBREAKUP(Double value) {
        this.probabilityofbreakup = value;
    }

    /**
     * Recupera il valore della proprietà probabilityoflandimpact.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPROBABILITYOFLANDIMPACT() {
        return probabilityoflandimpact;
    }

    /**
     * Imposta il valore della proprietà probabilityoflandimpact.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPROBABILITYOFLANDIMPACT(Double value) {
        this.probabilityoflandimpact = value;
    }

    /**
     * Recupera il valore della proprietà probabilityofcasualty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPROBABILITYOFCASUALTY() {
        return probabilityofcasualty;
    }

    /**
     * Imposta il valore della proprietà probabilityofcasualty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPROBABILITYOFCASUALTY(Double value) {
        this.probabilityofcasualty = value;
    }

    /**
     * Recupera il valore della proprietà nominalimpactepoch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMINALIMPACTEPOCH() {
        return nominalimpactepoch;
    }

    /**
     * Imposta il valore della proprietà nominalimpactepoch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMINALIMPACTEPOCH(String value) {
        this.nominalimpactepoch = value;
    }

    /**
     * Recupera il valore della proprietà impactwindowstart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPACTWINDOWSTART() {
        return impactwindowstart;
    }

    /**
     * Imposta il valore della proprietà impactwindowstart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPACTWINDOWSTART(String value) {
        this.impactwindowstart = value;
    }

    /**
     * Recupera il valore della proprietà impactwindowend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPACTWINDOWEND() {
        return impactwindowend;
    }

    /**
     * Imposta il valore della proprietà impactwindowend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPACTWINDOWEND(String value) {
        this.impactwindowend = value;
    }

    /**
     * Recupera il valore della proprietà impactrefframe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPACTREFFRAME() {
        return impactrefframe;
    }

    /**
     * Imposta il valore della proprietà impactrefframe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPACTREFFRAME(String value) {
        this.impactrefframe = value;
    }

    /**
     * Recupera il valore della proprietà nominalimpactlon.
     * 
     * @return
     *     possible object is
     *     {@link LonType }
     *     
     */
    public LonType getNOMINALIMPACTLON() {
        return nominalimpactlon;
    }

    /**
     * Imposta il valore della proprietà nominalimpactlon.
     * 
     * @param value
     *     allowed object is
     *     {@link LonType }
     *     
     */
    public void setNOMINALIMPACTLON(LonType value) {
        this.nominalimpactlon = value;
    }

    /**
     * Recupera il valore della proprietà nominalimpactlat.
     * 
     * @return
     *     possible object is
     *     {@link LatType }
     *     
     */
    public LatType getNOMINALIMPACTLAT() {
        return nominalimpactlat;
    }

    /**
     * Imposta il valore della proprietà nominalimpactlat.
     * 
     * @param value
     *     allowed object is
     *     {@link LatType }
     *     
     */
    public void setNOMINALIMPACTLAT(LatType value) {
        this.nominalimpactlat = value;
    }

    /**
     * Recupera il valore della proprietà nominalimpactalt.
     * 
     * @return
     *     possible object is
     *     {@link AltType }
     *     
     */
    public AltType getNOMINALIMPACTALT() {
        return nominalimpactalt;
    }

    /**
     * Imposta il valore della proprietà nominalimpactalt.
     * 
     * @param value
     *     allowed object is
     *     {@link AltType }
     *     
     */
    public void setNOMINALIMPACTALT(AltType value) {
        this.nominalimpactalt = value;
    }

    /**
     * Recupera il valore della proprietà impact1CONFIDENCE.
     * 
     * @return
     *     possible object is
     *     {@link PercentageType }
     *     
     */
    public PercentageType getIMPACT1CONFIDENCE() {
        return impact1CONFIDENCE;
    }

    /**
     * Imposta il valore della proprietà impact1CONFIDENCE.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageType }
     *     
     */
    public void setIMPACT1CONFIDENCE(PercentageType value) {
        this.impact1CONFIDENCE = value;
    }

    /**
     * Recupera il valore della proprietà impact1STARTLON.
     * 
     * @return
     *     possible object is
     *     {@link LonType }
     *     
     */
    public LonType getIMPACT1STARTLON() {
        return impact1STARTLON;
    }

    /**
     * Imposta il valore della proprietà impact1STARTLON.
     * 
     * @param value
     *     allowed object is
     *     {@link LonType }
     *     
     */
    public void setIMPACT1STARTLON(LonType value) {
        this.impact1STARTLON = value;
    }

    /**
     * Recupera il valore della proprietà impact1STARTLAT.
     * 
     * @return
     *     possible object is
     *     {@link LatType }
     *     
     */
    public LatType getIMPACT1STARTLAT() {
        return impact1STARTLAT;
    }

    /**
     * Imposta il valore della proprietà impact1STARTLAT.
     * 
     * @param value
     *     allowed object is
     *     {@link LatType }
     *     
     */
    public void setIMPACT1STARTLAT(LatType value) {
        this.impact1STARTLAT = value;
    }

    /**
     * Recupera il valore della proprietà impact1STOPLON.
     * 
     * @return
     *     possible object is
     *     {@link LonType }
     *     
     */
    public LonType getIMPACT1STOPLON() {
        return impact1STOPLON;
    }

    /**
     * Imposta il valore della proprietà impact1STOPLON.
     * 
     * @param value
     *     allowed object is
     *     {@link LonType }
     *     
     */
    public void setIMPACT1STOPLON(LonType value) {
        this.impact1STOPLON = value;
    }

    /**
     * Recupera il valore della proprietà impact1STOPLAT.
     * 
     * @return
     *     possible object is
     *     {@link LatType }
     *     
     */
    public LatType getIMPACT1STOPLAT() {
        return impact1STOPLAT;
    }

    /**
     * Imposta il valore della proprietà impact1STOPLAT.
     * 
     * @param value
     *     allowed object is
     *     {@link LatType }
     *     
     */
    public void setIMPACT1STOPLAT(LatType value) {
        this.impact1STOPLAT = value;
    }

    /**
     * Recupera il valore della proprietà impact1CROSSTRACK.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getIMPACT1CROSSTRACK() {
        return impact1CROSSTRACK;
    }

    /**
     * Imposta il valore della proprietà impact1CROSSTRACK.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setIMPACT1CROSSTRACK(DistanceType value) {
        this.impact1CROSSTRACK = value;
    }

    /**
     * Recupera il valore della proprietà impact2CONFIDENCE.
     * 
     * @return
     *     possible object is
     *     {@link PercentageType }
     *     
     */
    public PercentageType getIMPACT2CONFIDENCE() {
        return impact2CONFIDENCE;
    }

    /**
     * Imposta il valore della proprietà impact2CONFIDENCE.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageType }
     *     
     */
    public void setIMPACT2CONFIDENCE(PercentageType value) {
        this.impact2CONFIDENCE = value;
    }

    /**
     * Recupera il valore della proprietà impact2STARTLON.
     * 
     * @return
     *     possible object is
     *     {@link LonType }
     *     
     */
    public LonType getIMPACT2STARTLON() {
        return impact2STARTLON;
    }

    /**
     * Imposta il valore della proprietà impact2STARTLON.
     * 
     * @param value
     *     allowed object is
     *     {@link LonType }
     *     
     */
    public void setIMPACT2STARTLON(LonType value) {
        this.impact2STARTLON = value;
    }

    /**
     * Recupera il valore della proprietà impact2STARTLAT.
     * 
     * @return
     *     possible object is
     *     {@link LatType }
     *     
     */
    public LatType getIMPACT2STARTLAT() {
        return impact2STARTLAT;
    }

    /**
     * Imposta il valore della proprietà impact2STARTLAT.
     * 
     * @param value
     *     allowed object is
     *     {@link LatType }
     *     
     */
    public void setIMPACT2STARTLAT(LatType value) {
        this.impact2STARTLAT = value;
    }

    /**
     * Recupera il valore della proprietà impact2STOPLON.
     * 
     * @return
     *     possible object is
     *     {@link LonType }
     *     
     */
    public LonType getIMPACT2STOPLON() {
        return impact2STOPLON;
    }

    /**
     * Imposta il valore della proprietà impact2STOPLON.
     * 
     * @param value
     *     allowed object is
     *     {@link LonType }
     *     
     */
    public void setIMPACT2STOPLON(LonType value) {
        this.impact2STOPLON = value;
    }

    /**
     * Recupera il valore della proprietà impact2STOPLAT.
     * 
     * @return
     *     possible object is
     *     {@link LatType }
     *     
     */
    public LatType getIMPACT2STOPLAT() {
        return impact2STOPLAT;
    }

    /**
     * Imposta il valore della proprietà impact2STOPLAT.
     * 
     * @param value
     *     allowed object is
     *     {@link LatType }
     *     
     */
    public void setIMPACT2STOPLAT(LatType value) {
        this.impact2STOPLAT = value;
    }

    /**
     * Recupera il valore della proprietà impact2CROSSTRACK.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getIMPACT2CROSSTRACK() {
        return impact2CROSSTRACK;
    }

    /**
     * Imposta il valore della proprietà impact2CROSSTRACK.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setIMPACT2CROSSTRACK(DistanceType value) {
        this.impact2CROSSTRACK = value;
    }

    /**
     * Recupera il valore della proprietà impact3CONFIDENCE.
     * 
     * @return
     *     possible object is
     *     {@link PercentageType }
     *     
     */
    public PercentageType getIMPACT3CONFIDENCE() {
        return impact3CONFIDENCE;
    }

    /**
     * Imposta il valore della proprietà impact3CONFIDENCE.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageType }
     *     
     */
    public void setIMPACT3CONFIDENCE(PercentageType value) {
        this.impact3CONFIDENCE = value;
    }

    /**
     * Recupera il valore della proprietà impact3STARTLON.
     * 
     * @return
     *     possible object is
     *     {@link LonType }
     *     
     */
    public LonType getIMPACT3STARTLON() {
        return impact3STARTLON;
    }

    /**
     * Imposta il valore della proprietà impact3STARTLON.
     * 
     * @param value
     *     allowed object is
     *     {@link LonType }
     *     
     */
    public void setIMPACT3STARTLON(LonType value) {
        this.impact3STARTLON = value;
    }

    /**
     * Recupera il valore della proprietà impact3STARTLAT.
     * 
     * @return
     *     possible object is
     *     {@link LatType }
     *     
     */
    public LatType getIMPACT3STARTLAT() {
        return impact3STARTLAT;
    }

    /**
     * Imposta il valore della proprietà impact3STARTLAT.
     * 
     * @param value
     *     allowed object is
     *     {@link LatType }
     *     
     */
    public void setIMPACT3STARTLAT(LatType value) {
        this.impact3STARTLAT = value;
    }

    /**
     * Recupera il valore della proprietà impact3STOPLON.
     * 
     * @return
     *     possible object is
     *     {@link LonType }
     *     
     */
    public LonType getIMPACT3STOPLON() {
        return impact3STOPLON;
    }

    /**
     * Imposta il valore della proprietà impact3STOPLON.
     * 
     * @param value
     *     allowed object is
     *     {@link LonType }
     *     
     */
    public void setIMPACT3STOPLON(LonType value) {
        this.impact3STOPLON = value;
    }

    /**
     * Recupera il valore della proprietà impact3STOPLAT.
     * 
     * @return
     *     possible object is
     *     {@link LatType }
     *     
     */
    public LatType getIMPACT3STOPLAT() {
        return impact3STOPLAT;
    }

    /**
     * Imposta il valore della proprietà impact3STOPLAT.
     * 
     * @param value
     *     allowed object is
     *     {@link LatType }
     *     
     */
    public void setIMPACT3STOPLAT(LatType value) {
        this.impact3STOPLAT = value;
    }

    /**
     * Recupera il valore della proprietà impact3CROSSTRACK.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getIMPACT3CROSSTRACK() {
        return impact3CROSSTRACK;
    }

    /**
     * Imposta il valore della proprietà impact3CROSSTRACK.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setIMPACT3CROSSTRACK(DistanceType value) {
        this.impact3CROSSTRACK = value;
    }

}
