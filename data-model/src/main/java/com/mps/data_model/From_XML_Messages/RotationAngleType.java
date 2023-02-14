//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per rotationAngleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rotationAngleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rotation1" type="{urn:ccsds:schema:ndmxml}rotationAngleComponentType"/&gt;
 *         &lt;element name="rotation2" type="{urn:ccsds:schema:ndmxml}rotationAngleComponentType"/&gt;
 *         &lt;element name="rotation3" type="{urn:ccsds:schema:ndmxml}rotationAngleComponentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rotationAngleType", propOrder = {
    "rotation1",
    "rotation2",
    "rotation3"
})
public class RotationAngleType {

    @XmlElement(required = true)
    protected RotationAngleComponentType rotation1;
    @XmlElement(required = true)
    protected RotationAngleComponentType rotation2;
    @XmlElement(required = true)
    protected RotationAngleComponentType rotation3;

    /**
     * Recupera il valore della proprietà rotation1.
     * 
     * @return
     *     possible object is
     *     {@link RotationAngleComponentType }
     *     
     */
    public RotationAngleComponentType getRotation1() {
        return rotation1;
    }

    /**
     * Imposta il valore della proprietà rotation1.
     * 
     * @param value
     *     allowed object is
     *     {@link RotationAngleComponentType }
     *     
     */
    public void setRotation1(RotationAngleComponentType value) {
        this.rotation1 = value;
    }

    /**
     * Recupera il valore della proprietà rotation2.
     * 
     * @return
     *     possible object is
     *     {@link RotationAngleComponentType }
     *     
     */
    public RotationAngleComponentType getRotation2() {
        return rotation2;
    }

    /**
     * Imposta il valore della proprietà rotation2.
     * 
     * @param value
     *     allowed object is
     *     {@link RotationAngleComponentType }
     *     
     */
    public void setRotation2(RotationAngleComponentType value) {
        this.rotation2 = value;
    }

    /**
     * Recupera il valore della proprietà rotation3.
     * 
     * @return
     *     possible object is
     *     {@link RotationAngleComponentType }
     *     
     */
    public RotationAngleComponentType getRotation3() {
        return rotation3;
    }

    /**
     * Imposta il valore della proprietà rotation3.
     * 
     * @param value
     *     allowed object is
     *     {@link RotationAngleComponentType }
     *     
     */
    public void setRotation3(RotationAngleComponentType value) {
        this.rotation3 = value;
    }

}
