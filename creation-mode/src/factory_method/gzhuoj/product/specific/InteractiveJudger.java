package factory_method.gzhuoj.product.specific;

import factory_method.gzhuoj.product.Judger;

public class InteractiveJudger implements Judger {
    @Override
    public Boolean judge() {
        System.out.println("Interactive Judge");
        return true;
    }
}
