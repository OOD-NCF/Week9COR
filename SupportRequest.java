class SupportRequest {
    private final String message;
    private final int severityLevel; // 1 for simple, 2 for complex, 3 for critical

    public SupportRequest(String message, int severityLevel) {
        this.message = message;
        this.severityLevel = severityLevel;
    }

    public String getMessage() {
        return message;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }
}