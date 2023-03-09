package net.jeeshop.core.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import net.jeeshop.core.front.SystemManager;

import java.util.List;

/**
 * 获取系统参数的配置
 * Created by dylan on 15-1-15.
 */
public class SystemSettingGetter implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return SystemManager.getInstance().getSystemSetting();
    }
}
