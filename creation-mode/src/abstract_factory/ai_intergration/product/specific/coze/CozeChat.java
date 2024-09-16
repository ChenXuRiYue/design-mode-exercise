package abstract_factory.ai_intergration.product.specific.coze;

import abstract_factory.ai_intergration.product.Chat;

public class CozeChat implements Chat {
    public String createChat(String params) {
        return "Coze Chat";
    }
}
