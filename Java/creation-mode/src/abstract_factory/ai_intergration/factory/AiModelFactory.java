package abstract_factory.ai_intergration.factory;

import abstract_factory.ai_intergration.product.Bot;
import abstract_factory.ai_intergration.product.Chat;
import abstract_factory.ai_intergration.product.Message;

public interface AiModelFactory {
//    AiModel create();
    Chat createChat();
    Bot createBot();
    Message createMessage();
}
