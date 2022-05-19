package io.muenchendigital.digiwf.okewo.integration.gen.api;

import io.muenchendigital.digiwf.okewo.integration.gen.ApiClient;

import io.muenchendigital.digiwf.okewo.integration.gen.model.PersonErweitert;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonerweitertAnfrage;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonerweitertAntwort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Component("io.muenchendigital.digiwf.okewo.integration.gen.api.PersonErweitertApi")
public class PersonErweitertApi {
    private ApiClient apiClient;

    public PersonErweitertApi() {
        this(new ApiClient());
    }

    @Autowired
    public PersonErweitertApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Lesen von Daten auf Basis des Ordnungsmerkmales
     * 
     * <p><b>200</b> - Output type
     * @param om Ordnungsmerkmal der gesuchten Person (required)
     * @return PersonErweitert
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PersonErweitert deMuenchenEaiEwoRouteROUTEPROCESSGETPERSONERWEITERT(String om) throws RestClientException {
        return deMuenchenEaiEwoRouteROUTEPROCESSGETPERSONERWEITERTWithHttpInfo(om).getBody();
    }

    /**
     * Lesen von Daten auf Basis des Ordnungsmerkmales
     * 
     * <p><b>200</b> - Output type
     * @param om Ordnungsmerkmal der gesuchten Person (required)
     * @return ResponseEntity&lt;PersonErweitert&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PersonErweitert> deMuenchenEaiEwoRouteROUTEPROCESSGETPERSONERWEITERTWithHttpInfo(String om) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'om' is set
        if (om == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'om' when calling deMuenchenEaiEwoRouteROUTEPROCESSGETPERSONERWEITERT");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("om", om);
        String path = UriComponentsBuilder.fromPath("personErweitert/{om}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json;charset&#x3D;UTF-8"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PersonErweitert> returnType = new ParameterizedTypeReference<PersonErweitert>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Suchparameter für zu den gesuchten Personen
     * 
     * <p><b>200</b> - Output type
     * @param body  (required)
     * @return SuchePersonerweitertAntwort
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SuchePersonerweitertAntwort deMuenchenEaiEwoRouteROUTEPROCESSSEARCHPERSONERWEITERT(SuchePersonerweitertAnfrage body) throws RestClientException {
        return deMuenchenEaiEwoRouteROUTEPROCESSSEARCHPERSONERWEITERTWithHttpInfo(body).getBody();
    }

    /**
     * Suchparameter für zu den gesuchten Personen
     * 
     * <p><b>200</b> - Output type
     * @param body  (required)
     * @return ResponseEntity&lt;SuchePersonerweitertAntwort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SuchePersonerweitertAntwort> deMuenchenEaiEwoRouteROUTEPROCESSSEARCHPERSONERWEITERTWithHttpInfo(SuchePersonerweitertAnfrage body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling deMuenchenEaiEwoRouteROUTEPROCESSSEARCHPERSONERWEITERT");
        }
        String path = UriComponentsBuilder.fromPath("personErweitert/search").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json;charset&#x3D;UTF-8"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "*/*"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SuchePersonerweitertAntwort> returnType = new ParameterizedTypeReference<SuchePersonerweitertAntwort>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
