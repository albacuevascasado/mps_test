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
 * <p>Classe Java per altType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="altType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:ccsds:schema:ndmxml&gt;altRange"&gt;
 *       &lt;attribute name="units" type="{urn:ccsds:schema:ndmxml}lengthUnits" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altType", propOrder = {
    "value"
})
public class AltType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "units")
    protected LengthUnits units;

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
     * Recupera il valore della proprietà units.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnits }
     *     
     */
    public LengthUnits getUnits() {
        return units;
    }

    /**
     * Imposta il valore della proprietà units.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnits }
     *     
     */
    public void setUnits(LengthUnits value) {
        this.units = value;
    }

}
