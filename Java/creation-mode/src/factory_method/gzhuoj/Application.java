package factory_method.gzhuoj;


import factory_method.gzhuoj.factory.JudgerFactory;
import factory_method.gzhuoj.factory.specific.InteractiveJudgerFactory;
import factory_method.gzhuoj.factory.specific.SampleJudgerFactory;
import factory_method.gzhuoj.factory.specific.SpecialJudgerFactory;

public class Application {

    public static JudgerFactory judgerFactory;

    private static void init(String option) {
        switch (option) {
            case "Sample Judger": {
                judgerFactory = new SampleJudgerFactory();
                break;
            }
            case "Special Judger": {
                judgerFactory = new SpecialJudgerFactory();
                break;
            }
            case "Interactive Judger": {
                judgerFactory = new InteractiveJudgerFactory();
                break;
            }
        }
    }

    public static void main(String[] args) {
        init("Sample Judger");
        judgerFactory.judge();

        init("Special Judger");
        judgerFactory.judge();

        init("Interactive Judger");
        judgerFactory.judge();
    }
}
