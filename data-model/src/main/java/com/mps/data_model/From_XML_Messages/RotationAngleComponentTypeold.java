//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per rotationAngleComponentTypeold complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rotationAngleComponentTypeold"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="units" type="{urn:ccsds:schema:ndmxml}angleUnits" /&gt;
 *       &lt;attribute name="angle" use="required" type="{urn:ccsds:schema:ndmxml}angleKeywordType" /&gt;
 *       &lt;attribute name="value" use="required" type="{urn:ccsds:schema:ndmxml}angleRange" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rotationAngleComponentTypeold")
public class RotationAngleComponentTypeold {

    @XmlAttribute(name = "units")
    protected AngleUnits units;
    @XmlAttribute(name = "angle", required = true)
    protected AngleKeywordType angle;
    @XmlAttribute(name = "value", required = true)
    protected double value;

    /**
     * Recupera il valore della proprietà units.
     * 
     * @return
     *     possible object is
     *     {@link AngleUnits }
     *     
     */
    public AngleUnits getUnits() {
        return units;
    }

    /**
     * Imposta il valore della proprietà units.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleUnits }
     *     
     */
    public void setUnits(AngleUnits value) {
        this.units = value;
    }

    /**
     * Recupera il valore della proprietà angle.
     * 
     * @return
     *     possible object is
     *     {@link AngleKeywordType }
     *     
     */
    public AngleKeywordType getAngle() {
        return angle;
    }

    /**
     * Imposta il valore della proprietà angle.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleKeywordType }
     *     
     */
    public void setAngle(AngleKeywordType value) {
        this.angle = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
