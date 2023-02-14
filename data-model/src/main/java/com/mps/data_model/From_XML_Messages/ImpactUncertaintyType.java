//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.02.06 alle 05:25:32 PM CET 
//


package com.mps.data_model.From_XML_Messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per impactUncertaintyType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="impactUncertaintyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="ANALYTICAL"/&gt;
 *     &lt;enumeration value="STOCHASTIC"/&gt;
 *     &lt;enumeration value="EMPIRICAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "impactUncertaintyType")
@XmlEnum
public enum ImpactUncertaintyType {

    NONE,
    ANALYTICAL,
    STOCHASTIC,
    EMPIRICAL;

    public String value() {
        return name();
    }

    public static ImpactUncertaintyType fromValue(String v) {
        return valueOf(v);
    }

}
