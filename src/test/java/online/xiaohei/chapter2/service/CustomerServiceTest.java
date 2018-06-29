package online.xiaohei.chapter2.service;

import javafx.scene.chart.PieChart;
import online.xiaohei.chapter2.helper.DatabaseHelper;
import online.xiaohei.chapter2.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CustomerService Tester.
 *
 * @author zy
 * @version 1.0
 * @since <pre>06/20/2018</pre>
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    //    @Before
    public void before() throws Exception {
    }

    @Before
    public void init() throws Exception {
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getCustomerList()
     */
    @Test
    public void testGetCustomerList() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }

    /**
     * Method: getCustomerList(String keyword)
     */
    @Test
    public void testGetCustomerListKeyword() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getCustomer(long id)
     */
//    @Test
    public void testGetCustomer() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    /**
     * Method: createCustomer(Map<String, Object> fieldMap)
     */
    @Test
    public void testCreateCustomer() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "13512344567");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    /**
     * Method: updateCustomer(long id, Map<String, Object> fieldMap)
     */
    @Test
    public void testUpdateCustomer() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    /**
     * Method: deleteeCustomer(long id)
     */
    @Test
    public void testDeleteeCustomer() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }


} 
