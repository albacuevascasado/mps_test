//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SR_MP_Report_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SR_MP_Report_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SSF_FILE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VALID" use="required" type="{}SR_MP_Boolean_Enum" /&gt;
 *                 &lt;attribute name="NUMCMD" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="REPCOUNT" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;attribute name="LASTREP" use="required" type="{}SR_MP_Boolean_Enum" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CMD_ENTRY" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CMDPOS" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;attribute name="EXEC_TIME" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="PARENT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="STATUS" use="required" type="{}SR_MP_Status_Enum" /&gt;
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
@XmlType(name = "SR_MP_Report_Type", namespace = "", propOrder = {
    "ssffile",
    "cmdentry"
})
public class SRMPReportType {

    @XmlElement(name = "SSF_FILE", required = true)
    protected SRMPReportType.SSFFILE ssffile;
    @XmlElement(name = "CMD_ENTRY")
    protected List<SRMPReportType.CMDENTRY> cmdentry;

    /**
     * Recupera il valore della proprietà ssffile.
     * 
     * @return
     *     possible object is
     *     {@link SRMPReportType.SSFFILE }
     *     
     */
    public SRMPReportType.SSFFILE getSSFFILE() {
        return ssffile;
    }

    /**
     * Imposta il valore della proprietà ssffile.
     * 
     * @param value
     *     allowed object is
     *     {@link SRMPReportType.SSFFILE }
     *     
     */
    public void setSSFFILE(SRMPReportType.SSFFILE value) {
        this.ssffile = value;
    }

    /**
     * Gets the value of the cmdentry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmdentry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMDENTRY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SRMPReportType.CMDENTRY }
     * 
     * 
     */
    public List<SRMPReportType.CMDENTRY> getCMDENTRY() {
        if (cmdentry == null) {
            cmdentry = new ArrayList<SRMPReportType.CMDENTRY>();
        }
        return this.cmdentry;
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
     *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CMDPOS" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *       &lt;attribute name="EXEC_TIME" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="PARENT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="STATUS" use="required" type="{}SR_MP_Status_Enum" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CMDENTRY {

        @XmlAttribute(name = "NAME", required = true)
        protected String name;
        @XmlAttribute(name = "CMDPOS", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger cmdpos;
        @XmlAttribute(name = "EXEC_TIME", required = true)
        protected BigInteger exectime;
        @XmlAttribute(name = "PARENT", required = true)
        protected String parent;
        @XmlAttribute(name = "STATUS", required = true)
        protected SRMPStatusEnum status;

        /**
         * Recupera il valore della proprietà name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Imposta il valore della proprietà name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Recupera il valore della proprietà cmdpos.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCMDPOS() {
            return cmdpos;
        }

        /**
         * Imposta il valore della proprietà cmdpos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCMDPOS(BigInteger value) {
            this.cmdpos = value;
        }

        /**
         * Recupera il valore della proprietà exectime.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEXECTIME() {
            return exectime;
        }

        /**
         * Imposta il valore della proprietà exectime.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEXECTIME(BigInteger value) {
            this.exectime = value;
        }

        /**
         * Recupera il valore della proprietà parent.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARENT() {
            return parent;
        }

        /**
         * Imposta il valore della proprietà parent.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARENT(String value) {
            this.parent = value;
        }

        /**
         * Recupera il valore della proprietà status.
         * 
         * @return
         *     possible object is
         *     {@link SRMPStatusEnum }
         *     
         */
        public SRMPStatusEnum getSTATUS() {
            return status;
        }

        /**
         * Imposta il valore della proprietà status.
         * 
         * @param value
         *     allowed object is
         *     {@link SRMPStatusEnum }
         *     
         */
        public void setSTATUS(SRMPStatusEnum value) {
            this.status = value;
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
     *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VALID" use="required" type="{}SR_MP_Boolean_Enum" /&gt;
     *       &lt;attribute name="NUMCMD" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="REPCOUNT" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *       &lt;attribute name="LASTREP" use="required" type="{}SR_MP_Boolean_Enum" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SSFFILE {

        @XmlAttribute(name = "NAME", required = true)
        protected String name;
        @XmlAttribute(name = "VALID", required = true)
        protected SRMPBooleanEnum valid;
        @XmlAttribute(name = "NUMCMD", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger numcmd;
        @XmlAttribute(name = "REPCOUNT", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger repcount;
        @XmlAttribute(name = "LASTREP", required = true)
        protected SRMPBooleanEnum lastrep;

        /**
         * Recupera il valore della proprietà name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Imposta il valore della proprietà name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Recupera il valore della proprietà valid.
         * 
         * @return
         *     possible object is
         *     {@link SRMPBooleanEnum }
         *     
         */
        public SRMPBooleanEnum getVALID() {
            return valid;
        }

        /**
         * Imposta il valore della proprietà valid.
         * 
         * @param value
         *     allowed object is
         *     {@link SRMPBooleanEnum }
         *     
         */
        public void setVALID(SRMPBooleanEnum value) {
            this.valid = value;
        }

        /**
         * Recupera il valore della proprietà numcmd.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMCMD() {
            return numcmd;
        }

        /**
         * Imposta il valore della proprietà numcmd.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMCMD(BigInteger value) {
            this.numcmd = value;
        }

        /**
         * Recupera il valore della proprietà repcount.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getREPCOUNT() {
            return repcount;
        }

        /**
         * Imposta il valore della proprietà repcount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setREPCOUNT(BigInteger value) {
            this.repcount = value;
        }

        /**
         * Recupera il valore della proprietà lastrep.
         * 
         * @return
         *     possible object is
         *     {@link SRMPBooleanEnum }
         *     
         */
        public SRMPBooleanEnum getLASTREP() {
            return lastrep;
        }

        /**
         * Imposta il valore della proprietà lastrep.
         * 
         * @param value
         *     allowed object is
         *     {@link SRMPBooleanEnum }
         *     
         */
        public void setLASTREP(SRMPBooleanEnum value) {
            this.lastrep = value;
        }

    }

}
