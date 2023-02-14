//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per disintegrationType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="disintegrationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="MASS-LOSS"/&gt;
 *     &lt;enumeration value="BREAK-UP"/&gt;
 *     &lt;enumeration value="MASS-LOSS + BREAK-UP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "disintegrationType")
@XmlEnum
public enum DisintegrationType {

    NONE("NONE"),
    @XmlEnumValue("MASS-LOSS")
    MASS_LOSS("MASS-LOSS"),
    @XmlEnumValue("BREAK-UP")
    BREAK_UP("BREAK-UP"),
    @XmlEnumValue("MASS-LOSS + BREAK-UP")
    MASS_LOSS_BREAK_UP("MASS-LOSS + BREAK-UP");
    private final String value;

    DisintegrationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisintegrationType fromValue(String v) {
        for (DisintegrationType c: DisintegrationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
