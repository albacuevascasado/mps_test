//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per SR_Header_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SR_Header_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="START_EPOCH"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="TIME" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALIDITY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="HOURS" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
@XmlType(name = "SR_Header_Type", namespace = "", propOrder = {
    "source",
    "generationepoch",
    "startepoch",
    "validity"
})
public class SRHeaderType {

    @XmlElement(name = "SOURCE", required = true)
    protected String source;
    @XmlElement(name = "GENERATION_EPOCH", required = true)
    protected SRHeaderType.GENERATIONEPOCH generationepoch;
    @XmlElement(name = "START_EPOCH", required = true)
    protected SRHeaderType.STARTEPOCH startepoch;
    @XmlElement(name = "VALIDITY", required = true)
    protected SRHeaderType.VALIDITY validity;

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
     *     {@link SRHeaderType.GENERATIONEPOCH }
     *     
     */
    public SRHeaderType.GENERATIONEPOCH getGENERATIONEPOCH() {
        return generationepoch;
    }

    /**
     * Imposta il valore della proprietà generationepoch.
     * 
     * @param value
     *     allowed object is
     *     {@link SRHeaderType.GENERATIONEPOCH }
     *     
     */
    public void setGENERATIONEPOCH(SRHeaderType.GENERATIONEPOCH value) {
        this.generationepoch = value;
    }

    /**
     * Recupera il valore della proprietà startepoch.
     * 
     * @return
     *     possible object is
     *     {@link SRHeaderType.STARTEPOCH }
     *     
     */
    public SRHeaderType.STARTEPOCH getSTARTEPOCH() {
        return startepoch;
    }

    /**
     * Imposta il valore della proprietà startepoch.
     * 
     * @param value
     *     allowed object is
     *     {@link SRHeaderType.STARTEPOCH }
     *     
     */
    public void setSTARTEPOCH(SRHeaderType.STARTEPOCH value) {
        this.startepoch = value;
    }

    /**
     * Recupera il valore della proprietà validity.
     * 
     * @return
     *     possible object is
     *     {@link SRHeaderType.VALIDITY }
     *     
     */
    public SRHeaderType.VALIDITY getVALIDITY() {
        return validity;
    }

    /**
     * Imposta il valore della proprietà validity.
     * 
     * @param value
     *     allowed object is
     *     {@link SRHeaderType.VALIDITY }
     *     
     */
    public void setVALIDITY(SRHeaderType.VALIDITY value) {
        this.validity = value;
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
    public static class STARTEPOCH {

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
     *       &lt;attribute name="HOURS" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VALIDITY {

        @XmlAttribute(name = "HOURS", required = true)
        protected BigInteger hours;

        /**
         * Recupera il valore della proprietà hours.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHOURS() {
            return hours;
        }

        /**
         * Imposta il valore della proprietà hours.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHOURS(BigInteger value) {
            this.hours = value;
        }

    }

}
