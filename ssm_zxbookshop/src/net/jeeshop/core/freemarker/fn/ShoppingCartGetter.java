package net.jeeshop.core.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import net.jeeshop.core.FrontContainer;
import net.jeeshop.web.action.front.orders.CartInfo;
import net.jeeshop.web.util.LoginUserHolder;
import net.jeeshop.web.util.RequestHolder;

import java.util.List;

/**
 * 获取购物车
 * @author dylan
 */
public class ShoppingCartGetter implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return RequestHolder.getSession().getAttribute(FrontContainer.myCart);
    }
}
