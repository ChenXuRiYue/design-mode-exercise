package abstract_factory.ai_intergration.product.specific.openai;

import abstract_factory.ai_intergration.product.Chat;

public class OpenAiChat implements Chat {
    public String createChat(String params){
        return "OpenAi Chat";
    }
}
