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
 * <p>Classe Java per SR_MP_Report_Msg_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SR_MP_Report_Msg_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HEADER" type="{}SR_Header_Type"/&gt;
 *         &lt;element name="REPORT" type="{}SR_MP_Report_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SR_MP_Report_Msg_Type", namespace = "", propOrder = {
    "header",
    "report"
})
public class SRMPReportMsgType {

    @XmlElement(name = "HEADER", required = true)
    protected SRHeaderType header;
    @XmlElement(name = "REPORT", required = true)
    protected SRMPReportType report;

    /**
     * Recupera il valore della proprietà header.
     * 
     * @return
     *     possible object is
     *     {@link SRHeaderType }
     *     
     */
    public SRHeaderType getHEADER() {
        return header;
    }

    /**
     * Imposta il valore della proprietà header.
     * 
     * @param value
     *     allowed object is
     *     {@link SRHeaderType }
     *     
     */
    public void setHEADER(SRHeaderType value) {
        this.header = value;
    }

    /**
     * Recupera il valore della proprietà report.
     * 
     * @return
     *     possible object is
     *     {@link SRMPReportType }
     *     
     */
    public SRMPReportType getREPORT() {
        return report;
    }

    /**
     * Imposta il valore della proprietà report.
     * 
     * @param value
     *     allowed object is
     *     {@link SRMPReportType }
     *     
     */
    public void setREPORT(SRMPReportType value) {
        this.report = value;
    }

}
