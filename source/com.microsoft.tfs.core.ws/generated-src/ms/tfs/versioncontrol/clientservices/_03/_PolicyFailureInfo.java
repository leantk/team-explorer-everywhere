// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._PolicyFailureInfo;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _PolicyFailureInfo
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String policyName;
    protected String message;

    public _PolicyFailureInfo()
    {
        super();
    }

    public _PolicyFailureInfo(
        final String policyName,
        final String message)
    {
        // TODO : Call super() instead of setting all fields directly?
        setPolicyName(policyName);
        setMessage(message);
    }

    public String getPolicyName()
    {
        return this.policyName;
    }

    public void setPolicyName(String value)
    {
        this.policyName = value;
    }

    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(String value)
    {
        this.message = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "PolicyName",
            this.policyName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Message",
            this.message);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("PolicyName"))
                {
                    this.policyName = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Message"))
                {
                    this.message = reader.getElementText();
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
