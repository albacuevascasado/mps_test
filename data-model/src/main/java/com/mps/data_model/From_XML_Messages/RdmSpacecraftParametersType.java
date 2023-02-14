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
 * <p>Classe Java per rdmSpacecraftParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rdmSpacecraftParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WET_MASS" type="{urn:ccsds:schema:ndmxml}massType" minOccurs="0"/&gt;
 *         &lt;element name="DRY_MASS" type="{urn:ccsds:schema:ndmxml}massType" minOccurs="0"/&gt;
 *         &lt;element name="HAZARDOUS_SUBSTANCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOLAR_RAD_AREA" type="{urn:ccsds:schema:ndmxml}areaType" minOccurs="0"/&gt;
 *         &lt;element name="SOLAR_RAD_COEFF" type="{urn:ccsds:schema:ndmxml}nonNegativeDouble" minOccurs="0"/&gt;
 *         &lt;element name="DRAG_AREA" type="{urn:ccsds:schema:ndmxml}areaType" minOccurs="0"/&gt;
 *         &lt;element name="DRAG_COEFF" type="{urn:ccsds:schema:ndmxml}nonNegativeDouble" minOccurs="0"/&gt;
 *         &lt;element name="RCS" type="{urn:ccsds:schema:ndmxml}areaType" minOccurs="0"/&gt;
 *         &lt;element name="BALLISTIC_COEFF" type="{urn:ccsds:schema:ndmxml}ballisticCoeffType" minOccurs="0"/&gt;
 *         &lt;element name="THRUST_ACCELERATION" type="{urn:ccsds:schema:ndmxml}ms2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rdmSpacecraftParametersType", propOrder = {
    "comment",
    "wetmass",
    "drymass",
    "hazardoussubstances",
    "solarradarea",
    "solarradcoeff",
    "dragarea",
    "dragcoeff",
    "rcs",
    "ballisticcoeff",
    "thrustacceleration"
})
public class RdmSpacecraftParametersType {

    @XmlElement(name = "COMMENT")
    protected List<String> comment;
    @XmlElement(name = "WET_MASS")
    protected MassType wetmass;
    @XmlElement(name = "DRY_MASS")
    protected MassType drymass;
    @XmlElement(name = "HAZARDOUS_SUBSTANCES")
    protected String hazardoussubstances;
    @XmlElement(name = "SOLAR_RAD_AREA")
    protected AreaType solarradarea;
    @XmlElement(name = "SOLAR_RAD_COEFF")
    protected Double solarradcoeff;
    @XmlElement(name = "DRAG_AREA")
    protected AreaType dragarea;
    @XmlElement(name = "DRAG_COEFF")
    protected Double dragcoeff;
    @XmlElement(name = "RCS")
    protected AreaType rcs;
    @XmlElement(name = "BALLISTIC_COEFF")
    protected BallisticCoeffType ballisticcoeff;
    @XmlElement(name = "THRUST_ACCELERATION")
    protected Ms2Type thrustacceleration;

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
     * Recupera il valore della proprietà wetmass.
     * 
     * @return
     *     possible object is
     *     {@link MassType }
     *     
     */
    public MassType getWETMASS() {
        return wetmass;
    }

    /**
     * Imposta il valore della proprietà wetmass.
     * 
     * @param value
     *     allowed object is
     *     {@link MassType }
     *     
     */
    public void setWETMASS(MassType value) {
        this.wetmass = value;
    }

    /**
     * Recupera il valore della proprietà drymass.
     * 
     * @return
     *     possible object is
     *     {@link MassType }
     *     
     */
    public MassType getDRYMASS() {
        return drymass;
    }

    /**
     * Imposta il valore della proprietà drymass.
     * 
     * @param value
     *     allowed object is
     *     {@link MassType }
     *     
     */
    public void setDRYMASS(MassType value) {
        this.drymass = value;
    }

    /**
     * Recupera il valore della proprietà hazardoussubstances.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHAZARDOUSSUBSTANCES() {
        return hazardoussubstances;
    }

    /**
     * Imposta il valore della proprietà hazardoussubstances.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHAZARDOUSSUBSTANCES(String value) {
        this.hazardoussubstances = value;
    }

    /**
     * Recupera il valore della proprietà solarradarea.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getSOLARRADAREA() {
        return solarradarea;
    }

    /**
     * Imposta il valore della proprietà solarradarea.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setSOLARRADAREA(AreaType value) {
        this.solarradarea = value;
    }

    /**
     * Recupera il valore della proprietà solarradcoeff.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSOLARRADCOEFF() {
        return solarradcoeff;
    }

    /**
     * Imposta il valore della proprietà solarradcoeff.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSOLARRADCOEFF(Double value) {
        this.solarradcoeff = value;
    }

    /**
     * Recupera il valore della proprietà dragarea.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getDRAGAREA() {
        return dragarea;
    }

    /**
     * Imposta il valore della proprietà dragarea.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setDRAGAREA(AreaType value) {
        this.dragarea = value;
    }

    /**
     * Recupera il valore della proprietà dragcoeff.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDRAGCOEFF() {
        return dragcoeff;
    }

    /**
     * Imposta il valore della proprietà dragcoeff.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDRAGCOEFF(Double value) {
        this.dragcoeff = value;
    }

    /**
     * Recupera il valore della proprietà rcs.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getRCS() {
        return rcs;
    }

    /**
     * Imposta il valore della proprietà rcs.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setRCS(AreaType value) {
        this.rcs = value;
    }

    /**
     * Recupera il valore della proprietà ballisticcoeff.
     * 
     * @return
     *     possible object is
     *     {@link BallisticCoeffType }
     *     
     */
    public BallisticCoeffType getBALLISTICCOEFF() {
        return ballisticcoeff;
    }

    /**
     * Imposta il valore della proprietà ballisticcoeff.
     * 
     * @param value
     *     allowed object is
     *     {@link BallisticCoeffType }
     *     
     */
    public void setBALLISTICCOEFF(BallisticCoeffType value) {
        this.ballisticcoeff = value;
    }

    /**
     * Recupera il valore della proprietà thrustacceleration.
     * 
     * @return
     *     possible object is
     *     {@link Ms2Type }
     *     
     */
    public Ms2Type getTHRUSTACCELERATION() {
        return thrustacceleration;
    }

    /**
     * Imposta il valore della proprietà thrustacceleration.
     * 
     * @param value
     *     allowed object is
     *     {@link Ms2Type }
     *     
     */
    public void setTHRUSTACCELERATION(Ms2Type value) {
        this.thrustacceleration = value;
    }

}
