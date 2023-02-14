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
 * <p>Classe Java per stateVectorType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="stateVectorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EPOCH" type="{urn:ccsds:schema:ndmxml}epochType"/&gt;
 *         &lt;element name="X" type="{urn:ccsds:schema:ndmxml}positionType"/&gt;
 *         &lt;element name="Y" type="{urn:ccsds:schema:ndmxml}positionType"/&gt;
 *         &lt;element name="Z" type="{urn:ccsds:schema:ndmxml}positionType"/&gt;
 *         &lt;element name="X_DOT" type="{urn:ccsds:schema:ndmxml}velocityType"/&gt;
 *         &lt;element name="Y_DOT" type="{urn:ccsds:schema:ndmxml}velocityType"/&gt;
 *         &lt;element name="Z_DOT" type="{urn:ccsds:schema:ndmxml}velocityType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stateVectorType", propOrder = {
    "comment",
    "epoch",
    "x",
    "y",
    "z",
    "xdot",
    "ydot",
    "zdot"
})
public class StateVectorType {

    @XmlElement(name = "COMMENT")
    protected List<String> comment;
    @XmlElement(name = "EPOCH", required = true)
    protected String epoch;
    @XmlElement(name = "X", required = true)
    protected PositionType x;
    @XmlElement(name = "Y", required = true)
    protected PositionType y;
    @XmlElement(name = "Z", required = true)
    protected PositionType z;
    @XmlElement(name = "X_DOT", required = true)
    protected VelocityType xdot;
    @XmlElement(name = "Y_DOT", required = true)
    protected VelocityType ydot;
    @XmlElement(name = "Z_DOT", required = true)
    protected VelocityType zdot;

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
     * Recupera il valore della proprietà epoch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPOCH() {
        return epoch;
    }

    /**
     * Imposta il valore della proprietà epoch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPOCH(String value) {
        this.epoch = value;
    }

    /**
     * Recupera il valore della proprietà x.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getX() {
        return x;
    }

    /**
     * Imposta il valore della proprietà x.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setX(PositionType value) {
        this.x = value;
    }

    /**
     * Recupera il valore della proprietà y.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getY() {
        return y;
    }

    /**
     * Imposta il valore della proprietà y.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setY(PositionType value) {
        this.y = value;
    }

    /**
     * Recupera il valore della proprietà z.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getZ() {
        return z;
    }

    /**
     * Imposta il valore della proprietà z.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setZ(PositionType value) {
        this.z = value;
    }

    /**
     * Recupera il valore della proprietà xdot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityType }
     *     
     */
    public VelocityType getXDOT() {
        return xdot;
    }

    /**
     * Imposta il valore della proprietà xdot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityType }
     *     
     */
    public void setXDOT(VelocityType value) {
        this.xdot = value;
    }

    /**
     * Recupera il valore della proprietà ydot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityType }
     *     
     */
    public VelocityType getYDOT() {
        return ydot;
    }

    /**
     * Imposta il valore della proprietà ydot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityType }
     *     
     */
    public void setYDOT(VelocityType value) {
        this.ydot = value;
    }

    /**
     * Recupera il valore della proprietà zdot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityType }
     *     
     */
    public VelocityType getZDOT() {
        return zdot;
    }

    /**
     * Imposta il valore della proprietà zdot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityType }
     *     
     */
    public void setZDOT(VelocityType value) {
        this.zdot = value;
    }

}
