package net.jeeshop.core.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import net.jeeshop.core.KeyValueHelper;

import java.util.List;

/**
 * Created by dylan on 15-1-26.
 */
public class KeyValueGetter implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return KeyValueHelper.get(arguments.get(0).toString());
    }
}
