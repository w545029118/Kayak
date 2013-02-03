//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.03 at 02:56:36 PM CET 
//


package com.github.kayak.canio.kcd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.kayak.canio.kcd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Notes_QNAME = new QName("http://kayak.2codeornot2code.org/1.0", "Notes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.kayak.canio.kcd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LabelGroup }
     * 
     */
    public LabelGroup createLabelGroup() {
        return new LabelGroup();
    }

    /**
     * Create an instance of {@link BasicLabelType }
     * 
     */
    public BasicLabelType createBasicLabelType() {
        return new BasicLabelType();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link NodeRef }
     * 
     */
    public NodeRef createNodeRef() {
        return new NodeRef();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Producer }
     * 
     */
    public Producer createProducer() {
        return new Producer();
    }

    /**
     * Create an instance of {@link Multiplex }
     * 
     */
    public Multiplex createMultiplex() {
        return new Multiplex();
    }

    /**
     * Create an instance of {@link BasicSignalType }
     * 
     */
    public BasicSignalType createBasicSignalType() {
        return new BasicSignalType();
    }

    /**
     * Create an instance of {@link MuxGroup }
     * 
     */
    public MuxGroup createMuxGroup() {
        return new MuxGroup();
    }

    /**
     * Create an instance of {@link Signal }
     * 
     */
    public Signal createSignal() {
        return new Signal();
    }

    /**
     * Create an instance of {@link Consumer }
     * 
     */
    public Consumer createConsumer() {
        return new Consumer();
    }

    /**
     * Create an instance of {@link LabelSet }
     * 
     */
    public LabelSet createLabelSet() {
        return new LabelSet();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link NetworkDefinition }
     * 
     */
    public NetworkDefinition createNetworkDefinition() {
        return new NetworkDefinition();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link Bus }
     * 
     */
    public Bus createBus() {
        return new Bus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kayak.2codeornot2code.org/1.0", name = "Notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
    }

}
