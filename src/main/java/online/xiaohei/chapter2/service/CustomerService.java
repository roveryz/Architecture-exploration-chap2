package online.xiaohei.chapter2.service;

import online.xiaohei.chapter2.helper.DatabaseHelper;
import online.xiaohei.chapter2.model.Customer;
import online.xiaohei.chapter2.util.CollectionUtil;
import online.xiaohei.chapter2.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CustomerService {

    private static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

//============使用DatabaseHelper后可以省略该部分============
//    private static final String DRIVER;
//    private static final String URL;
//    private static final String USERNAME;
//    private static final String PASSWORD;
//
//
//    static {
//        Properties conf = PropsUtil.loadProps("config.properties");
//        DRIVER = conf.getProperty("jdbc.driver");
//        URL = conf.getProperty("jdbc.url");
//        USERNAME = conf.getProperty("jdbc.username");
//        PASSWORD = conf.getProperty("jdbc.password");
//        try {
//            Class.forName(DRIVER);
//        } catch (ClassNotFoundException e) {
//            LOGGER.error("can not load jdbc driver", e);
//        }
//    }
//============使用DatabaseHelper后可以省略该部分============

    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public List<Customer> getCustomerList(String keyword) {
//        TODO
        return null;
    }

    public Customer getCustomer(long id) {
//        TODO
        return null;
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
