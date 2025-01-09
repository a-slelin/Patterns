package Example;

interface HelpHandler {
    void handleHelp(String topic);
    void setNextHandler(HelpHandler next);
}