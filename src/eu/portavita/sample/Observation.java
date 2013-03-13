
package eu.portavita.sample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Observation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Observation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://portavita.eu/sample/}CD"/>
 *         &lt;element name="value" type="{http://portavita.eu/sample/}Value"/>
 *       &lt;/sequence>
 *       &lt;attribute name="classCode" type="{http://portavita.eu/sample/}ClassCode" />
 *       &lt;attribute name="moodCode" type="{http://portavita.eu/sample/}MoodCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Observation", propOrder = {
    "code",
    "value"
})
public class Observation {

    @XmlElement(required = true)
    protected CD code;
    @XmlElement(required = true)
    protected Value value;
    @XmlAttribute(name = "classCode")
    protected ClassCode classCode;
    @XmlAttribute(name = "moodCode")
    protected MoodCode moodCode;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClassCode }
     *     
     */
    public ClassCode getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassCode }
     *     
     */
    public void setClassCode(ClassCode value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * @return
     *     possible object is
     *     {@link MoodCode }
     *     
     */
    public MoodCode getMoodCode() {
        return moodCode;
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoodCode }
     *     
     */
    public void setMoodCode(MoodCode value) {
        this.moodCode = value;
    }

}
