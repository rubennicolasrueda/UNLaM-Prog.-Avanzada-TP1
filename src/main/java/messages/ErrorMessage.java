package messages;

public enum ErrorMessage {

    ARCHIVO_INGREDIENTES_NO_ENCONTRADO("No se encontró un archivo ingredientes en la dirección definida"),
    ARCHIVO_RECETAS_NO_ENCONTRADO("No se encontró un archivo ingredientes en la dirección definida");
    private final String message;

    private ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
