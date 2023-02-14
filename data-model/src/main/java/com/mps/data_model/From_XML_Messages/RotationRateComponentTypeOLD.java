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
 * <p>Classe Java per rotationRateComponentTypeOLD complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rotationRateComponentTypeOLD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="units" type="{urn:ccsds:schema:ndmxml}angleRateUnits" /&gt;
 *       &lt;attribute name="rate" use="required" type="{urn:ccsds:schema:ndmxml}angleRateKeywordType" /&gt;
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rotationRateComponentTypeOLD")
public class RotationRateComponentTypeOLD {

    @XmlAttribute(name = "units")
    protected AngleRateUnits units;
    @XmlAttribute(name = "rate", required = true)
    protected AngleRateKeywordType rate;
    @XmlAttribute(name = "value", required = true)
    protected double value;

    /**
     * Recupera il valore della proprietà units.
     * 
     * @return
     *     possible object is
     *     {@link AngleRateUnits }
     *     
     */
    public AngleRateUnits getUnits() {
        return units;
    }

    /**
     * Imposta il valore della proprietà units.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleRateUnits }
     *     
     */
    public void setUnits(AngleRateUnits value) {
        this.units = value;
    }

    /**
     * Recupera il valore della proprietà rate.
     * 
     * @return
     *     possible object is
     *     {@link AngleRateKeywordType }
     *     
     */
    public AngleRateKeywordType getRate() {
        return rate;
    }

    /**
     * Imposta il valore della proprietà rate.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleRateKeywordType }
     *     
     */
    public void setRate(AngleRateKeywordType value) {
        this.rate = value;
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
