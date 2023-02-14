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
 * <p>Classe Java per quaternionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="quaternionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="QC" type="{urn:ccsds:schema:ndmxml}quaternionComponentType"/&gt;
 *         &lt;element name="Q1" type="{urn:ccsds:schema:ndmxml}quaternionComponentType"/&gt;
 *         &lt;element name="Q2" type="{urn:ccsds:schema:ndmxml}quaternionComponentType"/&gt;
 *         &lt;element name="Q3" type="{urn:ccsds:schema:ndmxml}quaternionComponentType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quaternionType", propOrder = {

})
public class QuaternionType {

    @XmlElement(name = "QC")
    protected double qc;
    @XmlElement(name = "Q1")
    protected double q1;
    @XmlElement(name = "Q2")
    protected double q2;
    @XmlElement(name = "Q3")
    protected double q3;

    /**
     * Recupera il valore della proprietà qc.
     * 
     */
    public double getQC() {
        return qc;
    }

    /**
     * Imposta il valore della proprietà qc.
     * 
     */
    public void setQC(double value) {
        this.qc = value;
    }

    /**
     * Recupera il valore della proprietà q1.
     * 
     */
    public double getQ1() {
        return q1;
    }

    /**
     * Imposta il valore della proprietà q1.
     * 
     */
    public void setQ1(double value) {
        this.q1 = value;
    }

    /**
     * Recupera il valore della proprietà q2.
     * 
     */
    public double getQ2() {
        return q2;
    }

    /**
     * Imposta il valore della proprietà q2.
     * 
     */
    public void setQ2(double value) {
        this.q2 = value;
    }

    /**
     * Recupera il valore della proprietà q3.
     * 
     */
    public double getQ3() {
        return q3;
    }

    /**
     * Imposta il valore della proprietà q3.
     * 
     */
    public void setQ3(double value) {
        this.q3 = value;
    }

}
