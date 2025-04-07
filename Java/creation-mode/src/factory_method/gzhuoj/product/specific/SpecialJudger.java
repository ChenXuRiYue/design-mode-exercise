package factory_method.gzhuoj.product.specific;

import factory_method.gzhuoj.product.Judger;

public class SpecialJudger implements Judger {
    @Override
    public Boolean judge() {
        System.out.println("Special judge");
        return true;
    }
}
