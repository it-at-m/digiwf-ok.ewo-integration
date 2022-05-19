package io.muenchendigital.digiwf.okewo.integration.exception;

public class DocumentStorageException extends Exception {

    public DocumentStorageException(final String message, final Exception exception) {
        super(message, exception);
    }

}
