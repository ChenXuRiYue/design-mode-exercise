package abstract_factory.ai_intergration.factory.specific;

import abstract_factory.ai_intergration.factory.AiModelFactory;
import abstract_factory.ai_intergration.product.Bot;
import abstract_factory.ai_intergration.product.Chat;
import abstract_factory.ai_intergration.product.Message;
import abstract_factory.ai_intergration.product.specific.openai.OpenAiBot;
import abstract_factory.ai_intergration.product.specific.openai.OpenAiChat;
import abstract_factory.ai_intergration.product.specific.openai.OpenAiMessage;

public class OpenAiFactory implements AiModelFactory {
    @Override
    public Bot createBot() {
        return new OpenAiBot();
    }

    @Override
    public Chat createChat() {
        return new OpenAiChat();
    }

    @Override
    public Message createMessage() {
        return new OpenAiMessage();
    }
}
