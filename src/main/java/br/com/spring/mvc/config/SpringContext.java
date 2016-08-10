package br.com.spring.mvc.config;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

/**
 * Created by allan on 09/08/16.
 */
public class SpringContext {
    private static GenericApplicationContext context;
    private static Object LOCK = new Object();

    public static GenericApplicationContext getContext() {
        if (context == null) {
            synchronized (LOCK) {
                context = new GenericXmlApplicationContext("applicationContext.xml");
            }
        }
        return context;
    }

    public static Map<String, DataSource> getListDataSources() {

        DataSourceHolder dataSourceHolder = (DataSourceHolder) context.getBean("dataSourceHolder");
        Map<String, DataSource> map = dataSourceHolder.getListOfDataSources();

        return map;
    }
}
