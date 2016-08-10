package br.com.spring.mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

/**
 * Created by allan on 10/08/16.
 */
public class DataSourceHolder {
    private Map<String, DataSource> dataSources;

    @Autowired
    private ApplicationContext applicationContext;

    public DataSourceHolder() {}

    @SuppressWarnings("unused")
    private void init() {
        dataSources = applicationContext.getBeansOfType(DataSource.class);
    }

    public Map<String, DataSource> getListOfDataSources() {
        return dataSources;
    }
}
