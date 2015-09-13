
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="First" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Second" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", propOrder = {
    "first",
    "second",
    "operation"
})
public class Operation {

    @XmlElement(name = "First")
    protected int first;
    @XmlElement(name = "Second")
    protected int second;
    @XmlElement(name = "Operation")
    @XmlSchemaType(name = "unsignedShort")
    protected int operation;

    /**
     * Gets the value of the first property.
     * 
     */
    public int getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     */
    public void setFirst(int value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     */
    public int getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     */
    public void setSecond(int value) {
        this.second = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     */
    public int getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     */
    public void setOperation(int value) {
        this.operation = value;
    }

}
