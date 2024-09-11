package factory_method.gzhuoj.factory;

import factory_method.gzhuoj.product.Judger;

// 抽象工厂
public abstract class JudgerFactory {
    public abstract Judger createJudger();

    // 实际项目中输入，输出内容业务更加复杂。这里只做简单的展示。
    public Boolean judge(){
        Judger judger = createJudger();
        return judger.judge();
    }
}
