//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.09.25 à 05:58:53 PM CEST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour saslQopType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="saslQopType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="auth"/&gt;
 *     &lt;enumeration value="auth-int"/&gt;
 *     &lt;enumeration value="auth-conf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "saslQopType")
@XmlEnum
public enum SaslQopType {

    @XmlEnumValue("auth")
    AUTH("auth"),
    @XmlEnumValue("auth-int")
    AUTH_INT("auth-int"),
    @XmlEnumValue("auth-conf")
    AUTH_CONF("auth-conf");
    private final String value;

    SaslQopType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaslQopType fromValue(String v) {
        for (SaslQopType c: SaslQopType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
