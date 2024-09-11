package factory_method.gzhuoj.product.specific;

import factory_method.gzhuoj.product.Judger;

public class SampleJudger implements Judger {
    @Override
    public Boolean judge() {
        System.out.println("Sample judge");
        return true;
    }
}
