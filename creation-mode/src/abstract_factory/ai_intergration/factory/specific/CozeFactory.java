package abstract_factory.ai_intergration.factory.specific;

import abstract_factory.ai_intergration.factory.AiModelFactory;
import abstract_factory.ai_intergration.product.Bot;
import abstract_factory.ai_intergration.product.Chat;
import abstract_factory.ai_intergration.product.Message;
import abstract_factory.ai_intergration.product.specific.coze.CozeBot;
import abstract_factory.ai_intergration.product.specific.coze.CozeChat;
import abstract_factory.ai_intergration.product.specific.coze.CozeMessage;

public class CozeFactory implements AiModelFactory {
    @Override
    public Bot createBot() {
        return new CozeBot();
    }

    @Override
    public Chat createChat() {
        return new CozeChat();
    }

    @Override
    public Message createMessage() {
        return new CozeMessage();
    }
}
