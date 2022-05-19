package io.muenchendigital.digiwf.okewo.integration.exception;

public class DocumentStorageClientErrorException extends Exception {

    public DocumentStorageClientErrorException(final String message, final Exception exception) {
        super(message, exception);
    }

}
