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
 * <p>Classe Java per spacecraftParametersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="spacecraftParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MASS" type="{urn:ccsds:schema:ndmxml}massType"/&gt;
 *         &lt;element name="SOLAR_RAD_AREA" type="{urn:ccsds:schema:ndmxml}areaType"/&gt;
 *         &lt;element name="SOLAR_RAD_COEFF" type="{urn:ccsds:schema:ndmxml}nonNegativeDouble"/&gt;
 *         &lt;element name="DRAG_AREA" type="{urn:ccsds:schema:ndmxml}areaType"/&gt;
 *         &lt;element name="DRAG_COEFF" type="{urn:ccsds:schema:ndmxml}nonNegativeDouble"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spacecraftParametersType", propOrder = {
    "comment",
    "mass",
    "solarradarea",
    "solarradcoeff",
    "dragarea",
    "dragcoeff"
})
public class SpacecraftParametersType {

    @XmlElement(name = "COMMENT")
    protected List<String> comment;
    @XmlElement(name = "MASS", required = true)
    protected MassType mass;
    @XmlElement(name = "SOLAR_RAD_AREA", required = true)
    protected AreaType solarradarea;
    @XmlElement(name = "SOLAR_RAD_COEFF")
    protected double solarradcoeff;
    @XmlElement(name = "DRAG_AREA", required = true)
    protected AreaType dragarea;
    @XmlElement(name = "DRAG_COEFF")
    protected double dragcoeff;

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
     * Recupera il valore della proprietà mass.
     * 
     * @return
     *     possible object is
     *     {@link MassType }
     *     
     */
    public MassType getMASS() {
        return mass;
    }

    /**
     * Imposta il valore della proprietà mass.
     * 
     * @param value
     *     allowed object is
     *     {@link MassType }
     *     
     */
    public void setMASS(MassType value) {
        this.mass = value;
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
     */
    public double getSOLARRADCOEFF() {
        return solarradcoeff;
    }

    /**
     * Imposta il valore della proprietà solarradcoeff.
     * 
     */
    public void setSOLARRADCOEFF(double value) {
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
     */
    public double getDRAGCOEFF() {
        return dragcoeff;
    }

    /**
     * Imposta il valore della proprietà dragcoeff.
     * 
     */
    public void setDRAGCOEFF(double value) {
        this.dragcoeff = value;
    }

}
