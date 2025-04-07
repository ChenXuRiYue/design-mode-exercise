package factory_method.gzhuoj.factory.specific;

import factory_method.gzhuoj.factory.JudgerFactory;
import factory_method.gzhuoj.product.Judger;
import factory_method.gzhuoj.product.specific.InteractiveJudger;

public class InteractiveJudgerFactory extends JudgerFactory {
    @Override
    public Judger createJudger() {
        return new InteractiveJudger();
    }
}
