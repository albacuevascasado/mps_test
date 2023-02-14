//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per SR_PUW_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SR_PUW_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOURCE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="IOCC_MCS"/&gt;
 *               &lt;enumeration value="PLCC"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GENERATION_EPOCH"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="TIME" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PUW_DETAILS"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="isContingency" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="isMemoryErased" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="isActivity1ToBeStopped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="isActivity2ToBeStopped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="isActivityNToBeStopped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="instantaneousDeltaEnergy" type="{}restrictedDecimal" /&gt;
 *                 &lt;attribute name="DeltaTime" type="{}restrictedDecimal" /&gt;
 *                 &lt;attribute name="IDENTIFIER" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *                 &lt;attribute name="START" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="STOP" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SR_PUW_Type", namespace = "", propOrder = {
    "source",
    "generationepoch",
    "puwdetails"
})
public class SRPUWType {

    @XmlElement(name = "SOURCE", required = true)
    protected String source;
    @XmlElement(name = "GENERATION_EPOCH", required = true)
    protected SRPUWType.GENERATIONEPOCH generationepoch;
    @XmlElement(name = "PUW_DETAILS", required = true)
    protected SRPUWType.PUWDETAILS puwdetails;

    /**
     * Recupera il valore della proprietà source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Imposta il valore della proprietà source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Recupera il valore della proprietà generationepoch.
     * 
     * @return
     *     possible object is
     *     {@link SRPUWType.GENERATIONEPOCH }
     *     
     */
    public SRPUWType.GENERATIONEPOCH getGENERATIONEPOCH() {
        return generationepoch;
    }

    /**
     * Imposta il valore della proprietà generationepoch.
     * 
     * @param value
     *     allowed object is
     *     {@link SRPUWType.GENERATIONEPOCH }
     *     
     */
    public void setGENERATIONEPOCH(SRPUWType.GENERATIONEPOCH value) {
        this.generationepoch = value;
    }

    /**
     * Recupera il valore della proprietà puwdetails.
     * 
     * @return
     *     possible object is
     *     {@link SRPUWType.PUWDETAILS }
     *     
     */
    public SRPUWType.PUWDETAILS getPUWDETAILS() {
        return puwdetails;
    }

    /**
     * Imposta il valore della proprietà puwdetails.
     * 
     * @param value
     *     allowed object is
     *     {@link SRPUWType.PUWDETAILS }
     *     
     */
    public void setPUWDETAILS(SRPUWType.PUWDETAILS value) {
        this.puwdetails = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="DATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="TIME" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GENERATIONEPOCH {

        @XmlAttribute(name = "DATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "TIME", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar time;

        /**
         * Recupera il valore della proprietà date.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATE() {
            return date;
        }

        /**
         * Imposta il valore della proprietà date.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATE(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Recupera il valore della proprietà time.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTIME() {
            return time;
        }

        /**
         * Imposta il valore della proprietà time.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTIME(XMLGregorianCalendar value) {
            this.time = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="isContingency" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="isMemoryErased" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="isActivity1ToBeStopped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="isActivity2ToBeStopped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="isActivityNToBeStopped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="instantaneousDeltaEnergy" type="{}restrictedDecimal" /&gt;
     *       &lt;attribute name="DeltaTime" type="{}restrictedDecimal" /&gt;
     *       &lt;attribute name="IDENTIFIER" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
     *       &lt;attribute name="START" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="STOP" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PUWDETAILS {

        @XmlAttribute(name = "isContingency", required = true)
        protected boolean isContingency;
        @XmlAttribute(name = "isMemoryErased", required = true)
        protected boolean isMemoryErased;
        @XmlAttribute(name = "isActivity1ToBeStopped", required = true)
        protected boolean isActivity1ToBeStopped;
        @XmlAttribute(name = "isActivity2ToBeStopped", required = true)
        protected boolean isActivity2ToBeStopped;
        @XmlAttribute(name = "isActivityNToBeStopped", required = true)
        protected boolean isActivityNToBeStopped;
        @XmlAttribute(name = "instantaneousDeltaEnergy")
        protected BigDecimal instantaneousDeltaEnergy;
        @XmlAttribute(name = "DeltaTime")
        protected BigDecimal deltaTime;
        @XmlAttribute(name = "IDENTIFIER", required = true)
        protected BigInteger identifier;
        @XmlAttribute(name = "TYPE", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected String type;
        @XmlAttribute(name = "START", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar start;
        @XmlAttribute(name = "STOP", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar stop;

        /**
         * Recupera il valore della proprietà isContingency.
         * 
         */
        public boolean isIsContingency() {
            return isContingency;
        }

        /**
         * Imposta il valore della proprietà isContingency.
         * 
         */
        public void setIsContingency(boolean value) {
            this.isContingency = value;
        }

        /**
         * Recupera il valore della proprietà isMemoryErased.
         * 
         */
        public boolean isIsMemoryErased() {
            return isMemoryErased;
        }

        /**
         * Imposta il valore della proprietà isMemoryErased.
         * 
         */
        public void setIsMemoryErased(boolean value) {
            this.isMemoryErased = value;
        }

        /**
         * Recupera il valore della proprietà isActivity1ToBeStopped.
         * 
         */
        public boolean isIsActivity1ToBeStopped() {
            return isActivity1ToBeStopped;
        }

        /**
         * Imposta il valore della proprietà isActivity1ToBeStopped.
         * 
         */
        public void setIsActivity1ToBeStopped(boolean value) {
            this.isActivity1ToBeStopped = value;
        }

        /**
         * Recupera il valore della proprietà isActivity2ToBeStopped.
         * 
         */
        public boolean isIsActivity2ToBeStopped() {
            return isActivity2ToBeStopped;
        }

        /**
         * Imposta il valore della proprietà isActivity2ToBeStopped.
         * 
         */
        public void setIsActivity2ToBeStopped(boolean value) {
            this.isActivity2ToBeStopped = value;
        }

        /**
         * Recupera il valore della proprietà isActivityNToBeStopped.
         * 
         */
        public boolean isIsActivityNToBeStopped() {
            return isActivityNToBeStopped;
        }

        /**
         * Imposta il valore della proprietà isActivityNToBeStopped.
         * 
         */
        public void setIsActivityNToBeStopped(boolean value) {
            this.isActivityNToBeStopped = value;
        }

        /**
         * Recupera il valore della proprietà instantaneousDeltaEnergy.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInstantaneousDeltaEnergy() {
            return instantaneousDeltaEnergy;
        }

        /**
         * Imposta il valore della proprietà instantaneousDeltaEnergy.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInstantaneousDeltaEnergy(BigDecimal value) {
            this.instantaneousDeltaEnergy = value;
        }

        /**
         * Recupera il valore della proprietà deltaTime.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDeltaTime() {
            return deltaTime;
        }

        /**
         * Imposta il valore della proprietà deltaTime.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDeltaTime(BigDecimal value) {
            this.deltaTime = value;
        }

        /**
         * Recupera il valore della proprietà identifier.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDENTIFIER() {
            return identifier;
        }

        /**
         * Imposta il valore della proprietà identifier.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDENTIFIER(BigInteger value) {
            this.identifier = value;
        }

        /**
         * Recupera il valore della proprietà type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Imposta il valore della proprietà type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Recupera il valore della proprietà start.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTART() {
            return start;
        }

        /**
         * Imposta il valore della proprietà start.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTART(XMLGregorianCalendar value) {
            this.start = value;
        }

        /**
         * Recupera il valore della proprietà stop.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTOP() {
            return stop;
        }

        /**
         * Imposta il valore della proprietà stop.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTOP(XMLGregorianCalendar value) {
            this.stop = value;
        }

    }

}
