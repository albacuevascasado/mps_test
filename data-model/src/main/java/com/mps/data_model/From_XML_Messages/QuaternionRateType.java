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
 * <p>Classe Java per quaternionRateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="quaternionRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="QC_DOT" type="{urn:ccsds:schema:ndmxml}quaternionDotType"/&gt;
 *         &lt;element name="Q1_DOT" type="{urn:ccsds:schema:ndmxml}quaternionDotType"/&gt;
 *         &lt;element name="Q2_DOT" type="{urn:ccsds:schema:ndmxml}quaternionDotType"/&gt;
 *         &lt;element name="Q3_DOT" type="{urn:ccsds:schema:ndmxml}quaternionDotType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quaternionRateType", propOrder = {

})
public class QuaternionRateType {

    @XmlElement(name = "QC_DOT", required = true)
    protected QuaternionDotType qcdot;
    @XmlElement(name = "Q1_DOT", required = true)
    protected QuaternionDotType q1DOT;
    @XmlElement(name = "Q2_DOT", required = true)
    protected QuaternionDotType q2DOT;
    @XmlElement(name = "Q3_DOT", required = true)
    protected QuaternionDotType q3DOT;

    /**
     * Recupera il valore della proprietà qcdot.
     * 
     * @return
     *     possible object is
     *     {@link QuaternionDotType }
     *     
     */
    public QuaternionDotType getQCDOT() {
        return qcdot;
    }

    /**
     * Imposta il valore della proprietà qcdot.
     * 
     * @param value
     *     allowed object is
     *     {@link QuaternionDotType }
     *     
     */
    public void setQCDOT(QuaternionDotType value) {
        this.qcdot = value;
    }

    /**
     * Recupera il valore della proprietà q1DOT.
     * 
     * @return
     *     possible object is
     *     {@link QuaternionDotType }
     *     
     */
    public QuaternionDotType getQ1DOT() {
        return q1DOT;
    }

    /**
     * Imposta il valore della proprietà q1DOT.
     * 
     * @param value
     *     allowed object is
     *     {@link QuaternionDotType }
     *     
     */
    public void setQ1DOT(QuaternionDotType value) {
        this.q1DOT = value;
    }

    /**
     * Recupera il valore della proprietà q2DOT.
     * 
     * @return
     *     possible object is
     *     {@link QuaternionDotType }
     *     
     */
    public QuaternionDotType getQ2DOT() {
        return q2DOT;
    }

    /**
     * Imposta il valore della proprietà q2DOT.
     * 
     * @param value
     *     allowed object is
     *     {@link QuaternionDotType }
     *     
     */
    public void setQ2DOT(QuaternionDotType value) {
        this.q2DOT = value;
    }

    /**
     * Recupera il valore della proprietà q3DOT.
     * 
     * @return
     *     possible object is
     *     {@link QuaternionDotType }
     *     
     */
    public QuaternionDotType getQ3DOT() {
        return q3DOT;
    }

    /**
     * Imposta il valore della proprietà q3DOT.
     * 
     * @param value
     *     allowed object is
     *     {@link QuaternionDotType }
     *     
     */
    public void setQ3DOT(QuaternionDotType value) {
        this.q3DOT = value;
    }

}
