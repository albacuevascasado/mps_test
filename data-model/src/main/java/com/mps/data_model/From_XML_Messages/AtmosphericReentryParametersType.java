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
 * <p>Classe Java per atmosphericReentryParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="atmosphericReentryParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ORBIT_LIFETIME" type="{urn:ccsds:schema:ndmxml}dayIntervalType"/&gt;
 *         &lt;element name="REENTRY_ALTITUDE" type="{urn:ccsds:schema:ndmxml}positionType"/&gt;
 *         &lt;element name="ORBIT_LIFETIME_WINDOW_START" type="{urn:ccsds:schema:ndmxml}dayIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="ORBIT_LIFETIME_WINDOW_END" type="{urn:ccsds:schema:ndmxml}dayIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="NOMINAL_REENTRY_EPOCH" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="REENTRY_WINDOW_START" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="REENTRY_WINDOW_END" type="{urn:ccsds:schema:ndmxml}epochType" minOccurs="0"/&gt;
 *         &lt;element name="ORBIT_LIFETIME_CONFIDENCE_LEVEL" type="{urn:ccsds:schema:ndmxml}percentageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atmosphericReentryParametersType", propOrder = {
    "comment",
    "orbitlifetime",
    "reentryaltitude",
    "orbitlifetimewindowstart",
    "orbitlifetimewindowend",
    "nominalreentryepoch",
    "reentrywindowstart",
    "reentrywindowend",
    "orbitlifetimeconfidencelevel"
})
public class AtmosphericReentryParametersType {

    @XmlElement(name = "COMMENT")
    protected List<String> comment;
    @XmlElement(name = "ORBIT_LIFETIME", required = true)
    protected DayIntervalType orbitlifetime;
    @XmlElement(name = "REENTRY_ALTITUDE", required = true)
    protected PositionType reentryaltitude;
    @XmlElement(name = "ORBIT_LIFETIME_WINDOW_START")
    protected DayIntervalType orbitlifetimewindowstart;
    @XmlElement(name = "ORBIT_LIFETIME_WINDOW_END")
    protected DayIntervalType orbitlifetimewindowend;
    @XmlElement(name = "NOMINAL_REENTRY_EPOCH")
    protected String nominalreentryepoch;
    @XmlElement(name = "REENTRY_WINDOW_START")
    protected String reentrywindowstart;
    @XmlElement(name = "REENTRY_WINDOW_END")
    protected String reentrywindowend;
    @XmlElement(name = "ORBIT_LIFETIME_CONFIDENCE_LEVEL")
    protected PercentageType orbitlifetimeconfidencelevel;

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
     * Recupera il valore della proprietà orbitlifetime.
     * 
     * @return
     *     possible object is
     *     {@link DayIntervalType }
     *     
     */
    public DayIntervalType getORBITLIFETIME() {
        return orbitlifetime;
    }

    /**
     * Imposta il valore della proprietà orbitlifetime.
     * 
     * @param value
     *     allowed object is
     *     {@link DayIntervalType }
     *     
     */
    public void setORBITLIFETIME(DayIntervalType value) {
        this.orbitlifetime = value;
    }

    /**
     * Recupera il valore della proprietà reentryaltitude.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getREENTRYALTITUDE() {
        return reentryaltitude;
    }

    /**
     * Imposta il valore della proprietà reentryaltitude.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setREENTRYALTITUDE(PositionType value) {
        this.reentryaltitude = value;
    }

    /**
     * Recupera il valore della proprietà orbitlifetimewindowstart.
     * 
     * @return
     *     possible object is
     *     {@link DayIntervalType }
     *     
     */
    public DayIntervalType getORBITLIFETIMEWINDOWSTART() {
        return orbitlifetimewindowstart;
    }

    /**
     * Imposta il valore della proprietà orbitlifetimewindowstart.
     * 
     * @param value
     *     allowed object is
     *     {@link DayIntervalType }
     *     
     */
    public void setORBITLIFETIMEWINDOWSTART(DayIntervalType value) {
        this.orbitlifetimewindowstart = value;
    }

    /**
     * Recupera il valore della proprietà orbitlifetimewindowend.
     * 
     * @return
     *     possible object is
     *     {@link DayIntervalType }
     *     
     */
    public DayIntervalType getORBITLIFETIMEWINDOWEND() {
        return orbitlifetimewindowend;
    }

    /**
     * Imposta il valore della proprietà orbitlifetimewindowend.
     * 
     * @param value
     *     allowed object is
     *     {@link DayIntervalType }
     *     
     */
    public void setORBITLIFETIMEWINDOWEND(DayIntervalType value) {
        this.orbitlifetimewindowend = value;
    }

    /**
     * Recupera il valore della proprietà nominalreentryepoch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMINALREENTRYEPOCH() {
        return nominalreentryepoch;
    }

    /**
     * Imposta il valore della proprietà nominalreentryepoch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMINALREENTRYEPOCH(String value) {
        this.nominalreentryepoch = value;
    }

    /**
     * Recupera il valore della proprietà reentrywindowstart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREENTRYWINDOWSTART() {
        return reentrywindowstart;
    }

    /**
     * Imposta il valore della proprietà reentrywindowstart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREENTRYWINDOWSTART(String value) {
        this.reentrywindowstart = value;
    }

    /**
     * Recupera il valore della proprietà reentrywindowend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREENTRYWINDOWEND() {
        return reentrywindowend;
    }

    /**
     * Imposta il valore della proprietà reentrywindowend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREENTRYWINDOWEND(String value) {
        this.reentrywindowend = value;
    }

    /**
     * Recupera il valore della proprietà orbitlifetimeconfidencelevel.
     * 
     * @return
     *     possible object is
     *     {@link PercentageType }
     *     
     */
    public PercentageType getORBITLIFETIMECONFIDENCELEVEL() {
        return orbitlifetimeconfidencelevel;
    }

    /**
     * Imposta il valore della proprietà orbitlifetimeconfidencelevel.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageType }
     *     
     */
    public void setORBITLIFETIMECONFIDENCELEVEL(PercentageType value) {
        this.orbitlifetimeconfidencelevel = value;
    }

}
