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
 * <p>Classe Java per ballisticCoeffUnitsType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ballisticCoeffUnitsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="kg/m**2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ballisticCoeffUnitsType")
@XmlEnum
public enum BallisticCoeffUnitsType {

    @XmlEnumValue("kg/m**2")
    KG_M_2("kg/m**2");
    private final String value;

    BallisticCoeffUnitsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BallisticCoeffUnitsType fromValue(String v) {
        for (BallisticCoeffUnitsType c: BallisticCoeffUnitsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
