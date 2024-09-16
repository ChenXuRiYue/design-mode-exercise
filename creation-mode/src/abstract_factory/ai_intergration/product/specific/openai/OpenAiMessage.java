package abstract_factory.ai_intergration.product.specific.openai;

import abstract_factory.ai_intergration.product.Message;

public class OpenAiMessage implements Message {
    public String createMessage(String message) {
        return "OpenAiMessage: " + message;
    }
}
