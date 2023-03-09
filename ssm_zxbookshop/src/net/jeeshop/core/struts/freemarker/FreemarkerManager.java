//package net.jeeshop.core.struts.freemarker;
//
//import freemarker.template.TemplateException;
//import net.jeeshop.core.freemarker.fn.*;
//import net.jeeshop.core.front.SystemManager;
//
//import javax.servlet.ServletContext;
//
///**
// * Created by dylan on 15-1-16.
// */
//public class FreemarkerManager extends org.apache.struts2.views.freemarker.FreemarkerManager{
//    @Override
//    public void init(ServletContext servletContext) throws TemplateException {
//        super.init(servletContext);
//        config.setSharedVariable("systemManager", new SystemManagerGetter());
//        config.setSharedVariable("systemSetting", new SystemSettingGetter());
//        config.setSharedVariable("currentUser", new CurrentUserGetter());
//        config.setSharedVariable("checkPrivilege", new PrivilegeChecker());
//        config.setSharedVariable("i18nParser", new I18N());
//        config.setSharedVariable("keyValueParser", new KeyValueGetter());
//    }
//}
