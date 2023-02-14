//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TCP_Header"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TCP_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TCP_Version" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                   &lt;element name="TCP_Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TCP_Creation_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="TCP_Originator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TCP_MDB_Version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TCP_Body"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TCP_Command_List"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TCP_Command_Activity" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TCP_Command_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TCP_Command_Execution_Time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TCP_Parameter_List"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TCP_Parameter" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="TCP_Parameter_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="TCP_Parameter_Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="TCP_Parameter_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="TCP_Parameter_Value_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="TCP_Parameter_Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                         &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                                         &lt;attribute name="edit" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                                         &lt;attribute name="dyn" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                                         &lt;attribute name="grpSize" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "", propOrder = {
    "tcpHeader",
    "tcpBody"
})
@XmlRootElement(name = "TCP_Data_Block", namespace = "")
public class TCPDataBlock {

    @XmlElement(name = "TCP_Header", namespace = "", required = true)
    protected TCPDataBlock.TCPHeader tcpHeader;
    @XmlElement(name = "TCP_Body", namespace = "", required = true)
    protected TCPDataBlock.TCPBody tcpBody;

    /**
     * Recupera il valore della proprietà tcpHeader.
     * 
     * @return
     *     possible object is
     *     {@link TCPDataBlock.TCPHeader }
     *     
     */
    public TCPDataBlock.TCPHeader getTCPHeader() {
        return tcpHeader;
    }

    /**
     * Imposta il valore della proprietà tcpHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link TCPDataBlock.TCPHeader }
     *     
     */
    public void setTCPHeader(TCPDataBlock.TCPHeader value) {
        this.tcpHeader = value;
    }

    /**
     * Recupera il valore della proprietà tcpBody.
     * 
     * @return
     *     possible object is
     *     {@link TCPDataBlock.TCPBody }
     *     
     */
    public TCPDataBlock.TCPBody getTCPBody() {
        return tcpBody;
    }

    /**
     * Imposta il valore della proprietà tcpBody.
     * 
     * @param value
     *     allowed object is
     *     {@link TCPDataBlock.TCPBody }
     *     
     */
    public void setTCPBody(TCPDataBlock.TCPBody value) {
        this.tcpBody = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="TCP_Command_List"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TCP_Command_Activity" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TCP_Command_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TCP_Command_Execution_Time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TCP_Parameter_List"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TCP_Parameter" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="TCP_Parameter_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="TCP_Parameter_Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="TCP_Parameter_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="TCP_Parameter_Value_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="TCP_Parameter_Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                               &lt;attribute name="edit" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                               &lt;attribute name="dyn" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                               &lt;attribute name="grpSize" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
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
    @XmlType(name = "", propOrder = {
        "tcpCommandList"
    })
    public static class TCPBody {

        @XmlElement(name = "TCP_Command_List", namespace = "", required = true)
        protected TCPDataBlock.TCPBody.TCPCommandList tcpCommandList;

        /**
         * Recupera il valore della proprietà tcpCommandList.
         * 
         * @return
         *     possible object is
         *     {@link TCPDataBlock.TCPBody.TCPCommandList }
         *     
         */
        public TCPDataBlock.TCPBody.TCPCommandList getTCPCommandList() {
            return tcpCommandList;
        }

        /**
         * Imposta il valore della proprietà tcpCommandList.
         * 
         * @param value
         *     allowed object is
         *     {@link TCPDataBlock.TCPBody.TCPCommandList }
         *     
         */
        public void setTCPCommandList(TCPDataBlock.TCPBody.TCPCommandList value) {
            this.tcpCommandList = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="TCP_Command_Activity" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TCP_Command_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TCP_Command_Execution_Time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TCP_Parameter_List"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TCP_Parameter" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="TCP_Parameter_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="TCP_Parameter_Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="TCP_Parameter_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="TCP_Parameter_Value_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="TCP_Parameter_Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                     &lt;/sequence&gt;
         *                                     &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                                     &lt;attribute name="edit" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                                     &lt;attribute name="dyn" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                                     &lt;attribute name="grpSize" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tcpCommandActivity"
        })
        public static class TCPCommandList {

            @XmlElement(name = "TCP_Command_Activity", namespace = "")
            protected List<TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity> tcpCommandActivity;
            @XmlAttribute(name = "count")
            protected Byte count;

            /**
             * Gets the value of the tcpCommandActivity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tcpCommandActivity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTCPCommandActivity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity }
             * 
             * 
             */
            public List<TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity> getTCPCommandActivity() {
                if (tcpCommandActivity == null) {
                    tcpCommandActivity = new ArrayList<TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity>();
                }
                return this.tcpCommandActivity;
            }

            /**
             * Recupera il valore della proprietà count.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getCount() {
                return count;
            }

            /**
             * Imposta il valore della proprietà count.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setCount(Byte value) {
                this.count = value;
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
             *       &lt;sequence&gt;
             *         &lt;element name="TCP_Command_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TCP_Command_Execution_Time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TCP_Parameter_List"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TCP_Parameter" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="TCP_Parameter_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="TCP_Parameter_Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="TCP_Parameter_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="TCP_Parameter_Value_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="TCP_Parameter_Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                           &lt;/sequence&gt;
             *                           &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
             *                           &lt;attribute name="edit" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
             *                           &lt;attribute name="dyn" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
             *                           &lt;attribute name="grpSize" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
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
            @XmlType(name = "", propOrder = {
                "tcpCommandName",
                "tcpCommandExecutionTime",
                "tcpParameterList"
            })
            public static class TCPCommandActivity {

                @XmlElement(name = "TCP_Command_Name", namespace = "", required = true)
                protected String tcpCommandName;
                @XmlElement(name = "TCP_Command_Execution_Time", namespace = "", required = true)
                protected String tcpCommandExecutionTime;
                @XmlElement(name = "TCP_Parameter_List", namespace = "", required = true)
                protected TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList tcpParameterList;

                /**
                 * Recupera il valore della proprietà tcpCommandName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTCPCommandName() {
                    return tcpCommandName;
                }

                /**
                 * Imposta il valore della proprietà tcpCommandName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTCPCommandName(String value) {
                    this.tcpCommandName = value;
                }

                /**
                 * Recupera il valore della proprietà tcpCommandExecutionTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTCPCommandExecutionTime() {
                    return tcpCommandExecutionTime;
                }

                /**
                 * Imposta il valore della proprietà tcpCommandExecutionTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTCPCommandExecutionTime(String value) {
                    this.tcpCommandExecutionTime = value;
                }

                /**
                 * Recupera il valore della proprietà tcpParameterList.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList }
                 *     
                 */
                public TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList getTCPParameterList() {
                    return tcpParameterList;
                }

                /**
                 * Imposta il valore della proprietà tcpParameterList.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList }
                 *     
                 */
                public void setTCPParameterList(TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList value) {
                    this.tcpParameterList = value;
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
                 *       &lt;sequence&gt;
                 *         &lt;element name="TCP_Parameter" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="TCP_Parameter_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="TCP_Parameter_Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="TCP_Parameter_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="TCP_Parameter_Value_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="TCP_Parameter_Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                 &lt;/sequence&gt;
                 *                 &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *                 &lt;attribute name="edit" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *                 &lt;attribute name="dyn" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *                 &lt;attribute name="grpSize" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "tcpParameter"
                })
                public static class TCPParameterList {

                    @XmlElement(name = "TCP_Parameter", namespace = "")
                    protected List<TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList.TCPParameter> tcpParameter;
                    @XmlAttribute(name = "count")
                    protected Byte count;

                    /**
                     * Gets the value of the tcpParameter property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the tcpParameter property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTCPParameter().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList.TCPParameter }
                     * 
                     * 
                     */
                    public List<TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList.TCPParameter> getTCPParameter() {
                        if (tcpParameter == null) {
                            tcpParameter = new ArrayList<TCPDataBlock.TCPBody.TCPCommandList.TCPCommandActivity.TCPParameterList.TCPParameter>();
                        }
                        return this.tcpParameter;
                    }

                    /**
                     * Recupera il valore della proprietà count.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getCount() {
                        return count;
                    }

                    /**
                     * Imposta il valore della proprietà count.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setCount(Byte value) {
                        this.count = value;
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
                     *       &lt;sequence&gt;
                     *         &lt;element name="TCP_Parameter_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="TCP_Parameter_Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="TCP_Parameter_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="TCP_Parameter_Value_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="TCP_Parameter_Unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *       &lt;/sequence&gt;
                     *       &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                     *       &lt;attribute name="edit" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                     *       &lt;attribute name="dyn" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                     *       &lt;attribute name="grpSize" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "tcpParameterName",
                        "tcpParameterValue",
                        "tcpParameterType",
                        "tcpParameterValueType",
                        "tcpParameterUnit"
                    })
                    public static class TCPParameter {

                        @XmlElement(name = "TCP_Parameter_Name", namespace = "", required = true)
                        protected String tcpParameterName;
                        @XmlElement(name = "TCP_Parameter_Value", namespace = "", required = true)
                        protected String tcpParameterValue;
                        @XmlElement(name = "TCP_Parameter_Type", namespace = "", required = true)
                        protected String tcpParameterType;
                        @XmlElement(name = "TCP_Parameter_Value_Type", namespace = "", required = true)
                        protected String tcpParameterValueType;
                        @XmlElement(name = "TCP_Parameter_Unit", namespace = "", required = true)
                        protected String tcpParameterUnit;
                        @XmlAttribute(name = "pos")
                        protected Byte pos;
                        @XmlAttribute(name = "edit")
                        protected Byte edit;
                        @XmlAttribute(name = "dyn")
                        protected Byte dyn;
                        @XmlAttribute(name = "grpSize")
                        protected Byte grpSize;

                        /**
                         * Recupera il valore della proprietà tcpParameterName.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTCPParameterName() {
                            return tcpParameterName;
                        }

                        /**
                         * Imposta il valore della proprietà tcpParameterName.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTCPParameterName(String value) {
                            this.tcpParameterName = value;
                        }

                        /**
                         * Recupera il valore della proprietà tcpParameterValue.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTCPParameterValue() {
                            return tcpParameterValue;
                        }

                        /**
                         * Imposta il valore della proprietà tcpParameterValue.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTCPParameterValue(String value) {
                            this.tcpParameterValue = value;
                        }

                        /**
                         * Recupera il valore della proprietà tcpParameterType.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTCPParameterType() {
                            return tcpParameterType;
                        }

                        /**
                         * Imposta il valore della proprietà tcpParameterType.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTCPParameterType(String value) {
                            this.tcpParameterType = value;
                        }

                        /**
                         * Recupera il valore della proprietà tcpParameterValueType.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTCPParameterValueType() {
                            return tcpParameterValueType;
                        }

                        /**
                         * Imposta il valore della proprietà tcpParameterValueType.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTCPParameterValueType(String value) {
                            this.tcpParameterValueType = value;
                        }

                        /**
                         * Recupera il valore della proprietà tcpParameterUnit.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTCPParameterUnit() {
                            return tcpParameterUnit;
                        }

                        /**
                         * Imposta il valore della proprietà tcpParameterUnit.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTCPParameterUnit(String value) {
                            this.tcpParameterUnit = value;
                        }

                        /**
                         * Recupera il valore della proprietà pos.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getPos() {
                            return pos;
                        }

                        /**
                         * Imposta il valore della proprietà pos.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setPos(Byte value) {
                            this.pos = value;
                        }

                        /**
                         * Recupera il valore della proprietà edit.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getEdit() {
                            return edit;
                        }

                        /**
                         * Imposta il valore della proprietà edit.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setEdit(Byte value) {
                            this.edit = value;
                        }

                        /**
                         * Recupera il valore della proprietà dyn.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getDyn() {
                            return dyn;
                        }

                        /**
                         * Imposta il valore della proprietà dyn.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setDyn(Byte value) {
                            this.dyn = value;
                        }

                        /**
                         * Recupera il valore della proprietà grpSize.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getGrpSize() {
                            return grpSize;
                        }

                        /**
                         * Imposta il valore della proprietà grpSize.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setGrpSize(Byte value) {
                            this.grpSize = value;
                        }

                    }

                }

            }

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
     *       &lt;sequence&gt;
     *         &lt;element name="TCP_Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TCP_Version" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *         &lt;element name="TCP_Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TCP_Creation_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="TCP_Originator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TCP_MDB_Version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tcpName",
        "tcpVersion",
        "tcpDescription",
        "tcpCreationTime",
        "tcpOriginator",
        "tcpmdbVersion"
    })
    public static class TCPHeader {

        @XmlElement(name = "TCP_Name", namespace = "", required = true)
        protected String tcpName;
        @XmlElement(name = "TCP_Version", namespace = "")
        protected byte tcpVersion;
        @XmlElement(name = "TCP_Description", namespace = "", required = true)
        protected String tcpDescription;
        @XmlElement(name = "TCP_Creation_Time", namespace = "", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tcpCreationTime;
        @XmlElement(name = "TCP_Originator", namespace = "", required = true)
        protected String tcpOriginator;
        @XmlElement(name = "TCP_MDB_Version", namespace = "", required = true)
        protected String tcpmdbVersion;

        /**
         * Recupera il valore della proprietà tcpName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTCPName() {
            return tcpName;
        }

        /**
         * Imposta il valore della proprietà tcpName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTCPName(String value) {
            this.tcpName = value;
        }

        /**
         * Recupera il valore della proprietà tcpVersion.
         * 
         */
        public byte getTCPVersion() {
            return tcpVersion;
        }

        /**
         * Imposta il valore della proprietà tcpVersion.
         * 
         */
        public void setTCPVersion(byte value) {
            this.tcpVersion = value;
        }

        /**
         * Recupera il valore della proprietà tcpDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTCPDescription() {
            return tcpDescription;
        }

        /**
         * Imposta il valore della proprietà tcpDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTCPDescription(String value) {
            this.tcpDescription = value;
        }

        /**
         * Recupera il valore della proprietà tcpCreationTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTCPCreationTime() {
            return tcpCreationTime;
        }

        /**
         * Imposta il valore della proprietà tcpCreationTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTCPCreationTime(XMLGregorianCalendar value) {
            this.tcpCreationTime = value;
        }

        /**
         * Recupera il valore della proprietà tcpOriginator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTCPOriginator() {
            return tcpOriginator;
        }

        /**
         * Imposta il valore della proprietà tcpOriginator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTCPOriginator(String value) {
            this.tcpOriginator = value;
        }

        /**
         * Recupera il valore della proprietà tcpmdbVersion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTCPMDBVersion() {
            return tcpmdbVersion;
        }

        /**
         * Imposta il valore della proprietà tcpmdbVersion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTCPMDBVersion(String value) {
            this.tcpmdbVersion = value;
        }

    }

}
