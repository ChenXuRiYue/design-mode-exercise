package abstract_factory.ai_intergration.product.specific.openai;

import abstract_factory.ai_intergration.product.Bot;

public class OpenAiBot implements Bot {
    public String createBot(String params) {
        return "OpenAiBot";
    }
}
