package abstract_factory.ai_intergration;

import abstract_factory.ai_intergration.factory.AiModelFactory;
import abstract_factory.ai_intergration.factory.specific.CozeFactory;
import abstract_factory.ai_intergration.factory.specific.OpenAiFactory;
import abstract_factory.ai_intergration.product.Bot;
import abstract_factory.ai_intergration.product.Chat;
import abstract_factory.ai_intergration.product.Message;

public class Application {
    private static AiModelFactory aiModelFactory;
    static void init(String option){
        switch (option){
            case "Coze":
                aiModelFactory = new CozeFactory();
                break;
            case "OpenAi":
                aiModelFactory = new OpenAiFactory();
                break;
        }
    }

    public static void main(String[] args) {
        init("Coze");
        Bot bot = aiModelFactory.createBot();
        Message message = aiModelFactory.createMessage();
        Chat chat = aiModelFactory.createChat();
        System.out.println(bot.createBot("coze"));
        System.out.println(message.createMessage("hello world"));
        System.out.println(chat.createChat("hello world"));
        init("OpenAi");
        bot = aiModelFactory.createBot();
        message = aiModelFactory.createMessage();
        chat = aiModelFactory.createChat();
        System.out.println(bot.createBot("coze"));
        System.out.println(message.createMessage("hello world"));
        System.out.println(chat.createChat("hello world"));
    }
}
