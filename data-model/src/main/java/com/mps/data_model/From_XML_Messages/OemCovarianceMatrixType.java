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
 * <p>Classe Java per oemCovarianceMatrixType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="oemCovarianceMatrixType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ccsds:schema:ndmxml}oemCovarianceMatrixAbstractType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:ccsds:schema:ndmxml}covarianceMatrixElementsGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oemCovarianceMatrixType", propOrder = {
    "cxx",
    "cyx",
    "cyy",
    "czx",
    "czy",
    "czz",
    "cxdotx",
    "cxdoty",
    "cxdotz",
    "cxdotxdot",
    "cydotx",
    "cydoty",
    "cydotz",
    "cydotxdot",
    "cydotydot",
    "czdotx",
    "czdoty",
    "czdotz",
    "czdotxdot",
    "czdotydot",
    "czdotzdot"
})
public class OemCovarianceMatrixType
    extends OemCovarianceMatrixAbstractType
{

    @XmlElement(name = "CX_X", required = true)
    protected PositionCovarianceType cxx;
    @XmlElement(name = "CY_X", required = true)
    protected PositionCovarianceType cyx;
    @XmlElement(name = "CY_Y", required = true)
    protected PositionCovarianceType cyy;
    @XmlElement(name = "CZ_X", required = true)
    protected PositionCovarianceType czx;
    @XmlElement(name = "CZ_Y", required = true)
    protected PositionCovarianceType czy;
    @XmlElement(name = "CZ_Z", required = true)
    protected PositionCovarianceType czz;
    @XmlElement(name = "CX_DOT_X", required = true)
    protected PositionVelocityCovarianceType cxdotx;
    @XmlElement(name = "CX_DOT_Y", required = true)
    protected PositionVelocityCovarianceType cxdoty;
    @XmlElement(name = "CX_DOT_Z", required = true)
    protected PositionVelocityCovarianceType cxdotz;
    @XmlElement(name = "CX_DOT_X_DOT", required = true)
    protected VelocityCovarianceType cxdotxdot;
    @XmlElement(name = "CY_DOT_X", required = true)
    protected PositionVelocityCovarianceType cydotx;
    @XmlElement(name = "CY_DOT_Y", required = true)
    protected PositionVelocityCovarianceType cydoty;
    @XmlElement(name = "CY_DOT_Z", required = true)
    protected PositionVelocityCovarianceType cydotz;
    @XmlElement(name = "CY_DOT_X_DOT", required = true)
    protected VelocityCovarianceType cydotxdot;
    @XmlElement(name = "CY_DOT_Y_DOT", required = true)
    protected VelocityCovarianceType cydotydot;
    @XmlElement(name = "CZ_DOT_X", required = true)
    protected PositionVelocityCovarianceType czdotx;
    @XmlElement(name = "CZ_DOT_Y", required = true)
    protected PositionVelocityCovarianceType czdoty;
    @XmlElement(name = "CZ_DOT_Z", required = true)
    protected PositionVelocityCovarianceType czdotz;
    @XmlElement(name = "CZ_DOT_X_DOT", required = true)
    protected VelocityCovarianceType czdotxdot;
    @XmlElement(name = "CZ_DOT_Y_DOT", required = true)
    protected VelocityCovarianceType czdotydot;
    @XmlElement(name = "CZ_DOT_Z_DOT", required = true)
    protected VelocityCovarianceType czdotzdot;

    /**
     * Recupera il valore della proprietà cxx.
     * 
     * @return
     *     possible object is
     *     {@link PositionCovarianceType }
     *     
     */
    public PositionCovarianceType getCXX() {
        return cxx;
    }

    /**
     * Imposta il valore della proprietà cxx.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCovarianceType }
     *     
     */
    public void setCXX(PositionCovarianceType value) {
        this.cxx = value;
    }

    /**
     * Recupera il valore della proprietà cyx.
     * 
     * @return
     *     possible object is
     *     {@link PositionCovarianceType }
     *     
     */
    public PositionCovarianceType getCYX() {
        return cyx;
    }

    /**
     * Imposta il valore della proprietà cyx.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCovarianceType }
     *     
     */
    public void setCYX(PositionCovarianceType value) {
        this.cyx = value;
    }

    /**
     * Recupera il valore della proprietà cyy.
     * 
     * @return
     *     possible object is
     *     {@link PositionCovarianceType }
     *     
     */
    public PositionCovarianceType getCYY() {
        return cyy;
    }

    /**
     * Imposta il valore della proprietà cyy.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCovarianceType }
     *     
     */
    public void setCYY(PositionCovarianceType value) {
        this.cyy = value;
    }

    /**
     * Recupera il valore della proprietà czx.
     * 
     * @return
     *     possible object is
     *     {@link PositionCovarianceType }
     *     
     */
    public PositionCovarianceType getCZX() {
        return czx;
    }

    /**
     * Imposta il valore della proprietà czx.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCovarianceType }
     *     
     */
    public void setCZX(PositionCovarianceType value) {
        this.czx = value;
    }

    /**
     * Recupera il valore della proprietà czy.
     * 
     * @return
     *     possible object is
     *     {@link PositionCovarianceType }
     *     
     */
    public PositionCovarianceType getCZY() {
        return czy;
    }

    /**
     * Imposta il valore della proprietà czy.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCovarianceType }
     *     
     */
    public void setCZY(PositionCovarianceType value) {
        this.czy = value;
    }

    /**
     * Recupera il valore della proprietà czz.
     * 
     * @return
     *     possible object is
     *     {@link PositionCovarianceType }
     *     
     */
    public PositionCovarianceType getCZZ() {
        return czz;
    }

    /**
     * Imposta il valore della proprietà czz.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCovarianceType }
     *     
     */
    public void setCZZ(PositionCovarianceType value) {
        this.czz = value;
    }

    /**
     * Recupera il valore della proprietà cxdotx.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCXDOTX() {
        return cxdotx;
    }

    /**
     * Imposta il valore della proprietà cxdotx.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCXDOTX(PositionVelocityCovarianceType value) {
        this.cxdotx = value;
    }

    /**
     * Recupera il valore della proprietà cxdoty.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCXDOTY() {
        return cxdoty;
    }

    /**
     * Imposta il valore della proprietà cxdoty.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCXDOTY(PositionVelocityCovarianceType value) {
        this.cxdoty = value;
    }

    /**
     * Recupera il valore della proprietà cxdotz.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCXDOTZ() {
        return cxdotz;
    }

    /**
     * Imposta il valore della proprietà cxdotz.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCXDOTZ(PositionVelocityCovarianceType value) {
        this.cxdotz = value;
    }

    /**
     * Recupera il valore della proprietà cxdotxdot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public VelocityCovarianceType getCXDOTXDOT() {
        return cxdotxdot;
    }

    /**
     * Imposta il valore della proprietà cxdotxdot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public void setCXDOTXDOT(VelocityCovarianceType value) {
        this.cxdotxdot = value;
    }

    /**
     * Recupera il valore della proprietà cydotx.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCYDOTX() {
        return cydotx;
    }

    /**
     * Imposta il valore della proprietà cydotx.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCYDOTX(PositionVelocityCovarianceType value) {
        this.cydotx = value;
    }

    /**
     * Recupera il valore della proprietà cydoty.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCYDOTY() {
        return cydoty;
    }

    /**
     * Imposta il valore della proprietà cydoty.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCYDOTY(PositionVelocityCovarianceType value) {
        this.cydoty = value;
    }

    /**
     * Recupera il valore della proprietà cydotz.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCYDOTZ() {
        return cydotz;
    }

    /**
     * Imposta il valore della proprietà cydotz.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCYDOTZ(PositionVelocityCovarianceType value) {
        this.cydotz = value;
    }

    /**
     * Recupera il valore della proprietà cydotxdot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public VelocityCovarianceType getCYDOTXDOT() {
        return cydotxdot;
    }

    /**
     * Imposta il valore della proprietà cydotxdot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public void setCYDOTXDOT(VelocityCovarianceType value) {
        this.cydotxdot = value;
    }

    /**
     * Recupera il valore della proprietà cydotydot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public VelocityCovarianceType getCYDOTYDOT() {
        return cydotydot;
    }

    /**
     * Imposta il valore della proprietà cydotydot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public void setCYDOTYDOT(VelocityCovarianceType value) {
        this.cydotydot = value;
    }

    /**
     * Recupera il valore della proprietà czdotx.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCZDOTX() {
        return czdotx;
    }

    /**
     * Imposta il valore della proprietà czdotx.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCZDOTX(PositionVelocityCovarianceType value) {
        this.czdotx = value;
    }

    /**
     * Recupera il valore della proprietà czdoty.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCZDOTY() {
        return czdoty;
    }

    /**
     * Imposta il valore della proprietà czdoty.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCZDOTY(PositionVelocityCovarianceType value) {
        this.czdoty = value;
    }

    /**
     * Recupera il valore della proprietà czdotz.
     * 
     * @return
     *     possible object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public PositionVelocityCovarianceType getCZDOTZ() {
        return czdotz;
    }

    /**
     * Imposta il valore della proprietà czdotz.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionVelocityCovarianceType }
     *     
     */
    public void setCZDOTZ(PositionVelocityCovarianceType value) {
        this.czdotz = value;
    }

    /**
     * Recupera il valore della proprietà czdotxdot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public VelocityCovarianceType getCZDOTXDOT() {
        return czdotxdot;
    }

    /**
     * Imposta il valore della proprietà czdotxdot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public void setCZDOTXDOT(VelocityCovarianceType value) {
        this.czdotxdot = value;
    }

    /**
     * Recupera il valore della proprietà czdotydot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public VelocityCovarianceType getCZDOTYDOT() {
        return czdotydot;
    }

    /**
     * Imposta il valore della proprietà czdotydot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public void setCZDOTYDOT(VelocityCovarianceType value) {
        this.czdotydot = value;
    }

    /**
     * Recupera il valore della proprietà czdotzdot.
     * 
     * @return
     *     possible object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public VelocityCovarianceType getCZDOTZDOT() {
        return czdotzdot;
    }

    /**
     * Imposta il valore della proprietà czdotzdot.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityCovarianceType }
     *     
     */
    public void setCZDOTZDOT(VelocityCovarianceType value) {
        this.czdotzdot = value;
    }

}
