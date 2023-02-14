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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per rotationAngleComponentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rotationAngleComponentType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:ccsds:schema:ndmxml&gt;angleRange"&gt;
 *       &lt;attribute name="angle" use="required" type="{urn:ccsds:schema:ndmxml}angleKeywordType" /&gt;
 *       &lt;attribute name="units" type="{urn:ccsds:schema:ndmxml}angleUnits" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rotationAngleComponentType", propOrder = {
    "value"
})
public class RotationAngleComponentType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "angle", required = true)
    protected AngleKeywordType angle;
    @XmlAttribute(name = "units")
    protected AngleUnits units;

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

}
