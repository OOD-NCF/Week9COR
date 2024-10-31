interface SupportHandler {
    void setNextHandler(SupportHandler nextHandler);
    void handleRequest(SupportRequest request);
}
