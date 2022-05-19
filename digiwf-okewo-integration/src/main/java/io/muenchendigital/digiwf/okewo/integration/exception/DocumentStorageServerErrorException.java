package io.muenchendigital.digiwf.okewo.integration.exception;

public class DocumentStorageServerErrorException extends Exception {

    public DocumentStorageServerErrorException(final String message, final Exception exception) {
        super(message, exception);
    }

}
