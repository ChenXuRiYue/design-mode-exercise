package Strategy.strategy;
import Strategy.constants.JudgeResult;
import Strategy.constants.SubmitDetail;

// 上下文会维护指向某个策略对象的引用。上下文不知晓策略的具体类。上下
// 文必须通过策略接口来与所有策略进行交互。
public interface JudgeStrategy {
    JudgeResult judge(SubmitDetail submitDetail);
}
