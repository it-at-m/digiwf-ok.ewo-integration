package io.muenchendigital.digiwf.okewo.integration.repository;

import io.muenchendigital.digiwf.okewo.integration.exception.DocumentStorageClientErrorException;
import io.muenchendigital.digiwf.okewo.integration.exception.DocumentStorageException;
import io.muenchendigital.digiwf.okewo.integration.exception.DocumentStorageServerErrorException;
import io.muenchendigital.digiwf.okewo.integration.gen.api.PersonErweitertApi;
import io.muenchendigital.digiwf.okewo.integration.gen.model.PersonErweitert;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonerweitertAnfrage;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonerweitertAntwort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OkEwoPersonErweitertRepository {

    private final PersonErweitertApi personErweitertApi;

    public PersonErweitert getPerson(final String om) throws DocumentStorageClientErrorException, DocumentStorageServerErrorException, DocumentStorageException {
        try {
            return this.personErweitertApi.deMuenchenEaiEwoRouteROUTEPROCESSGETPERSONERWEITERT(om);
        } catch (final HttpClientErrorException exception) {
            final String message = String.format("The request to get a person failed with %s.", exception.getStatusCode());
            log.error(message);
            throw new DocumentStorageClientErrorException(message, exception);
        } catch (final HttpServerErrorException exception) {
            final String message = String.format("The request to get a person failed with %s.", exception.getStatusCode());
            log.error(message);
            throw new DocumentStorageServerErrorException(message, exception);
        } catch (final RestClientException exception) {
            final String message = String.format("The request to get a person failed.");
            log.error(message);
            throw new DocumentStorageException(message, exception);
        }
    }

    public SuchePersonerweitertAntwort searchPerson(final SuchePersonerweitertAnfrage suchePersonAnfrage) throws DocumentStorageClientErrorException, DocumentStorageServerErrorException, DocumentStorageException {
        try {
            return this.personErweitertApi.deMuenchenEaiEwoRouteROUTEPROCESSSEARCHPERSONERWEITERT(suchePersonAnfrage);
        } catch (final HttpClientErrorException exception) {
            final String message = String.format("The request to search a person failed with %s.", exception.getStatusCode());
            log.error(message);
            throw new DocumentStorageClientErrorException(message, exception);
        } catch (final HttpServerErrorException exception) {
            final String message = String.format("The request to search a person failed with %s.", exception.getStatusCode());
            log.error(message);
            throw new DocumentStorageServerErrorException(message, exception);
        } catch (final RestClientException exception) {
            final String message = String.format("The request to search a person failed.");
            log.error(message);
            throw new DocumentStorageException(message, exception);
        }
    }

}
