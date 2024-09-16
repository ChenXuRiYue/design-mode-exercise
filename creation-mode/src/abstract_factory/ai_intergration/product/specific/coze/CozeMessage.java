package abstract_factory.ai_intergration.product.specific.coze;

import abstract_factory.ai_intergration.product.Message;

public class CozeMessage implements Message {
    @Override
    public String createMessage(String message) {
        return "Coze Message: " + message;
    }
}
