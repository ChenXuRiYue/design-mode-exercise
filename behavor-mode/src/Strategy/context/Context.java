package Strategy.context;

import Strategy.constants.JudgeResult;
import Strategy.constants.SubmitDetail;
import Strategy.strategy.JudgeStrategy;

// 策略模式中的上下文
// 上下文定义了了客户端中关注的接口。
public class Context {
    // 上下文会维护指向某个策略对象的引用。上下文不知晓策略的具体类。上下
    // 文必须通过策略接口来与所有策略进行交互。
    private JudgeStrategy judgeStrategy;

    // 上下文通常会通过构造函数来接收策略对象，同时还提供设置器以便在运行
    // 时切换策略。
    public void setStrategy(JudgeStrategy judgeStrategy) {
        this.judgeStrategy = judgeStrategy;
    }

    // 上下文会将一些工作委派给策略对象，而不是自行实现不同版本的算法。
    public JudgeResult judge(SubmitDetail submitDetail) {
        return judgeStrategy.judge(submitDetail);
    }
}
