package net.jeeshop.core.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import net.jeeshop.core.i18n.MessageLoader;

import java.util.List;

/**
 * 国际化配置
 * Created by dylan on 15-1-15.
 */
public class I18N implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return MessageLoader.instance().getMessage(arguments.get(0).toString());
    }

}
