package antimomandorino.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String entityName, String id) {
        super(entityName + " con ID " + id + " non trovato!");
    }
}