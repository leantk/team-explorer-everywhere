// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.ws._AccessMapping;
import ms.ws._ConnectionData;
import ms.ws._IdentityDescriptor;
import ms.ws._KeyValueOfStringString;
import ms.ws._LocationMapping;
import ms.ws._LocationServiceData;
import ms.ws._LocationWebServiceSoap_ConfigureAccessMapping;
import ms.ws._LocationWebServiceSoap_ConfigureAccessMappingResponse;
import ms.ws._LocationWebServiceSoap_Connect;
import ms.ws._LocationWebServiceSoap_ConnectResponse;
import ms.ws._LocationWebServiceSoap_QueryServices;
import ms.ws._LocationWebServiceSoap_QueryServicesResponse;
import ms.ws._LocationWebServiceSoap_RemoveAccessMapping;
import ms.ws._LocationWebServiceSoap_RemoveAccessMappingResponse;
import ms.ws._LocationWebServiceSoap_RemoveServiceDefinitions;
import ms.ws._LocationWebServiceSoap_RemoveServiceDefinitionsResponse;
import ms.ws._LocationWebServiceSoap_SaveServiceDefinitions;
import ms.ws._LocationWebServiceSoap_SaveServiceDefinitionsResponse;
import ms.ws._LocationWebServiceSoap_SetDefaultAccessMapping;
import ms.ws._LocationWebServiceSoap_SetDefaultAccessMappingResponse;
import ms.ws._PropertyValue;
import ms.ws._ServiceDefinition;
import ms.ws._ServiceTypeFilter;
import ms.ws._TeamFoundationIdentity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.Object;
import java.lang.String;

import java.net.URI;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://microsoft.com/webservices/}LocationWebServiceSoapService
 */
public class _LocationWebServiceSoapService
    extends SOAP11Service
    implements _LocationWebServiceSoap
{
    private static final QName PORT_QNAME = new QName("http://microsoft.com/webservices/",
            "LocationWebServiceSoapService");
    private static final String ENDPOINT_PATH = "/tfs/TeamFoundation/Administration/v3.0/LocationService.asmx";

    public _LocationWebServiceSoapService(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _LocationWebServiceSoapService(
        final HttpClient client,
        URI endpoint,
        QName port)
    {
        super(client, endpoint, port);
    }

    /**
     * @return the qualified name of the WSDL port this service implementation can be used with
     */
    public static QName getPortQName()
    {
        return _LocationWebServiceSoapService.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _LocationWebServiceSoapService.ENDPOINT_PATH;
    }

    public _LocationServiceData saveServiceDefinitions(
        final _ServiceDefinition[] serviceDefinitions,
        final int lastChangeId)
        throws TransportException, SOAPFault
    {
        final _LocationWebServiceSoap_SaveServiceDefinitions requestData = new _LocationWebServiceSoap_SaveServiceDefinitions(
                    serviceDefinitions,
                    lastChangeId);

        final SOAPRequest request = createSOAPRequest(
                "SaveServiceDefinitions",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "SaveServiceDefinitions");
                    }
                });

        final _LocationWebServiceSoap_SaveServiceDefinitionsResponse responseData = new _LocationWebServiceSoap_SaveServiceDefinitionsResponse();

        executeSOAPRequest(
            request,
            "SaveServiceDefinitionsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getSaveServiceDefinitionsResult();
    }

    public _LocationServiceData removeServiceDefinitions(
        final _ServiceDefinition[] serviceDefinitions,
        final int lastChangeId)
        throws TransportException, SOAPFault
    {
        final _LocationWebServiceSoap_RemoveServiceDefinitions requestData = new _LocationWebServiceSoap_RemoveServiceDefinitions(
                    serviceDefinitions,
                    lastChangeId);

        final SOAPRequest request = createSOAPRequest(
                "RemoveServiceDefinitions",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemoveServiceDefinitions");
                    }
                });

        final _LocationWebServiceSoap_RemoveServiceDefinitionsResponse responseData = new _LocationWebServiceSoap_RemoveServiceDefinitionsResponse();

        executeSOAPRequest(
            request,
            "RemoveServiceDefinitionsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getRemoveServiceDefinitionsResult();
    }

    public _LocationServiceData configureAccessMapping(
        final _AccessMapping accessMapping,
        final int lastChangeId,
        final boolean makeDefault)
        throws TransportException, SOAPFault
    {
        final _LocationWebServiceSoap_ConfigureAccessMapping requestData = new _LocationWebServiceSoap_ConfigureAccessMapping(
                    accessMapping,
                    lastChangeId,
                    makeDefault);

        final SOAPRequest request = createSOAPRequest(
                "ConfigureAccessMapping",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "ConfigureAccessMapping");
                    }
                });

        final _LocationWebServiceSoap_ConfigureAccessMappingResponse responseData = new _LocationWebServiceSoap_ConfigureAccessMappingResponse();

        executeSOAPRequest(
            request,
            "ConfigureAccessMappingResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getConfigureAccessMappingResult();
    }

    public _LocationServiceData setDefaultAccessMapping(
        final _AccessMapping accessMapping,
        final int lastChangeId)
        throws TransportException, SOAPFault
    {
        final _LocationWebServiceSoap_SetDefaultAccessMapping requestData = new _LocationWebServiceSoap_SetDefaultAccessMapping(
                    accessMapping,
                    lastChangeId);

        final SOAPRequest request = createSOAPRequest(
                "SetDefaultAccessMapping",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "SetDefaultAccessMapping");
                    }
                });

        final _LocationWebServiceSoap_SetDefaultAccessMappingResponse responseData = new _LocationWebServiceSoap_SetDefaultAccessMappingResponse();

        executeSOAPRequest(
            request,
            "SetDefaultAccessMappingResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getSetDefaultAccessMappingResult();
    }

    public _LocationServiceData removeAccessMapping(
        final _AccessMapping accessMapping,
        final int lastChangeId)
        throws TransportException, SOAPFault
    {
        final _LocationWebServiceSoap_RemoveAccessMapping requestData = new _LocationWebServiceSoap_RemoveAccessMapping(
                    accessMapping,
                    lastChangeId);

        final SOAPRequest request = createSOAPRequest(
                "RemoveAccessMapping",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "RemoveAccessMapping");
                    }
                });

        final _LocationWebServiceSoap_RemoveAccessMappingResponse responseData = new _LocationWebServiceSoap_RemoveAccessMappingResponse();

        executeSOAPRequest(
            request,
            "RemoveAccessMappingResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getRemoveAccessMappingResult();
    }

    public _LocationServiceData queryServices(
        final _ServiceTypeFilter[] serviceTypeFilters,
        final int lastChangeId)
        throws TransportException, SOAPFault
    {
        final _LocationWebServiceSoap_QueryServices requestData = new _LocationWebServiceSoap_QueryServices(
                    serviceTypeFilters,
                    lastChangeId);

        final SOAPRequest request = createSOAPRequest(
                "QueryServices",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryServices");
                    }
                });

        final _LocationWebServiceSoap_QueryServicesResponse responseData = new _LocationWebServiceSoap_QueryServicesResponse();

        executeSOAPRequest(
            request,
            "QueryServicesResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getQueryServicesResult();
    }

    public _ConnectionData connect(
        final int connectOptions,
        final int lastChangeId,
        final int features)
        throws TransportException, SOAPFault
    {
        final _LocationWebServiceSoap_Connect requestData = new _LocationWebServiceSoap_Connect(connectOptions,
                lastChangeId, features);

        final SOAPRequest request = createSOAPRequest(
                "Connect",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "Connect");
                    }
                });

        final _LocationWebServiceSoap_ConnectResponse responseData = new _LocationWebServiceSoap_ConnectResponse();

        executeSOAPRequest(
            request,
            "ConnectResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getConnectResult();
    }
}
