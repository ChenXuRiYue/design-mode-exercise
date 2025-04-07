package Strategy;

import Strategy.constants.JudgeConstants;
import Strategy.constants.JudgeResult;
import Strategy.constants.SubmitDetail;
import Strategy.context.Context;
import Strategy.strategies.CommonJudge;
import Strategy.strategies.IntervalJudge;
import Strategy.strategies.SpecialJudge;

public class ExampleApplication {
    public static void main(String[] args) {
        // 创建上下文对象
        ExampleApplication example = new ExampleApplication();
        SubmitDetail submitDetail = new SubmitDetail();
        example.work(JudgeConstants.JUDGE_TYPE_SPECIAL, submitDetail);
    }

    public JudgeResult work (String judgeType, SubmitDetail submitDetail){
        Context context = new Context();
        switch (judgeType) {
            case JudgeConstants.JUDGE_TYPE_COMMON -> context.setStrategy(new CommonJudge());
            case JudgeConstants.JUDGE_TYPE_INTERVAL -> context.setStrategy(new IntervalJudge());
            case JudgeConstants.JUDGE_TYPE_SPECIAL -> context.setStrategy(new SpecialJudge());
        }
        return context.judge(submitDetail);
    }
}
