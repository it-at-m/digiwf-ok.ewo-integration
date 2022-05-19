package io.muenchendigital.digiwf.okewo.integration.repository;

import io.muenchendigital.digiwf.okewo.integration.exception.DocumentStorageClientErrorException;
import io.muenchendigital.digiwf.okewo.integration.exception.DocumentStorageException;
import io.muenchendigital.digiwf.okewo.integration.exception.DocumentStorageServerErrorException;
import io.muenchendigital.digiwf.okewo.integration.gen.api.PersonApi;
import io.muenchendigital.digiwf.okewo.integration.gen.model.Person;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonAnfrage;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonAntwort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OkEwoPersonRepository {

    private final PersonApi personApi;

    public Person getPerson(final String om) throws DocumentStorageClientErrorException, DocumentStorageServerErrorException, DocumentStorageException {
        try {
            return this.personApi.deMuenchenEaiEwoRouteROUTEPROCESSGETPERSON(om);
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

    public SuchePersonAntwort searchPerson(final SuchePersonAnfrage suchePersonAnfrage) throws DocumentStorageClientErrorException, DocumentStorageServerErrorException, DocumentStorageException {
        try {
            return this.personApi.deMuenchenEaiEwoRouteROUTEPROCESSSEARCHPERSON(suchePersonAnfrage);
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
