package abstract_factory.ai_intergration.product.specific.coze;

import abstract_factory.ai_intergration.product.Bot;

public class CozeBot implements Bot {
    @Override
    public String createBot(String params) {
        return "Coze Bot";
    }
}
