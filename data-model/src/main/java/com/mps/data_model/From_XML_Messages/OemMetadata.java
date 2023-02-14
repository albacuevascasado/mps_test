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
 * <p>Classe Java per oemMetadata complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="oemMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OBJECT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OBJECT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CENTER_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REF_FRAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REF_FRAME_EPOCH" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="TIME_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="START_TIME" type="{urn:ccsds:schema:ndmxml}epochType"/&gt;
 *         &lt;element name="USEABLE_START_TIME" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="USEABLE_STOP_TIME" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="STOP_TIME" type="{urn:ccsds:schema:ndmxml}epochType"/&gt;
 *         &lt;element name="INTERPOLATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTERPOLATION_DEGREE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oemMetadata", propOrder = {
    "comment",
    "objectname",
    "objectid",
    "centername",
    "refframe",
    "refframeepoch",
    "timesystem",
    "starttime",
    "useablestarttime",
    "useablestoptime",
    "stoptime",
    "interpolation",
    "interpolationdegree"
})
public class OemMetadata {

    @XmlElement(name = "COMMENT")
    protected List<String> comment;
    @XmlElement(name = "OBJECT_NAME", required = true)
    protected String objectname;
    @XmlElement(name = "OBJECT_ID", required = true)
    protected String objectid;
    @XmlElement(name = "CENTER_NAME", required = true)
    protected String centername;
    @XmlElement(name = "REF_FRAME", required = true)
    protected String refframe;
    @XmlElement(name = "REF_FRAME_EPOCH")
    protected String refframeepoch;
    @XmlElement(name = "TIME_SYSTEM", required = true)
    protected String timesystem;
    @XmlElement(name = "START_TIME", required = true)
    protected String starttime;
    @XmlElement(name = "USEABLE_START_TIME")
    protected String useablestarttime;
    @XmlElement(name = "USEABLE_STOP_TIME")
    protected String useablestoptime;
    @XmlElement(name = "STOP_TIME", required = true)
    protected String stoptime;
    @XmlElement(name = "INTERPOLATION")
    protected String interpolation;
    @XmlElement(name = "INTERPOLATION_DEGREE")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger interpolationdegree;

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
     * Recupera il valore della proprietà objectname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECTNAME() {
        return objectname;
    }

    /**
     * Imposta il valore della proprietà objectname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECTNAME(String value) {
        this.objectname = value;
    }

    /**
     * Recupera il valore della proprietà objectid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECTID() {
        return objectid;
    }

    /**
     * Imposta il valore della proprietà objectid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECTID(String value) {
        this.objectid = value;
    }

    /**
     * Recupera il valore della proprietà centername.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTERNAME() {
        return centername;
    }

    /**
     * Imposta il valore della proprietà centername.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTERNAME(String value) {
        this.centername = value;
    }

    /**
     * Recupera il valore della proprietà refframe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFFRAME() {
        return refframe;
    }

    /**
     * Imposta il valore della proprietà refframe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFFRAME(String value) {
        this.refframe = value;
    }

    /**
     * Recupera il valore della proprietà refframeepoch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFFRAMEEPOCH() {
        return refframeepoch;
    }

    /**
     * Imposta il valore della proprietà refframeepoch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFFRAMEEPOCH(String value) {
        this.refframeepoch = value;
    }

    /**
     * Recupera il valore della proprietà timesystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIMESYSTEM() {
        return timesystem;
    }

    /**
     * Imposta il valore della proprietà timesystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIMESYSTEM(String value) {
        this.timesystem = value;
    }

    /**
     * Recupera il valore della proprietà starttime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTTIME() {
        return starttime;
    }

    /**
     * Imposta il valore della proprietà starttime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTTIME(String value) {
        this.starttime = value;
    }

    /**
     * Recupera il valore della proprietà useablestarttime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSEABLESTARTTIME() {
        return useablestarttime;
    }

    /**
     * Imposta il valore della proprietà useablestarttime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSEABLESTARTTIME(String value) {
        this.useablestarttime = value;
    }

    /**
     * Recupera il valore della proprietà useablestoptime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSEABLESTOPTIME() {
        return useablestoptime;
    }

    /**
     * Imposta il valore della proprietà useablestoptime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSEABLESTOPTIME(String value) {
        this.useablestoptime = value;
    }

    /**
     * Recupera il valore della proprietà stoptime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPTIME() {
        return stoptime;
    }

    /**
     * Imposta il valore della proprietà stoptime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPTIME(String value) {
        this.stoptime = value;
    }

    /**
     * Recupera il valore della proprietà interpolation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERPOLATION() {
        return interpolation;
    }

    /**
     * Imposta il valore della proprietà interpolation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERPOLATION(String value) {
        this.interpolation = value;
    }

    /**
     * Recupera il valore della proprietà interpolationdegree.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINTERPOLATIONDEGREE() {
        return interpolationdegree;
    }

    /**
     * Imposta il valore della proprietà interpolationdegree.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINTERPOLATIONDEGREE(BigInteger value) {
        this.interpolationdegree = value;
    }

}
