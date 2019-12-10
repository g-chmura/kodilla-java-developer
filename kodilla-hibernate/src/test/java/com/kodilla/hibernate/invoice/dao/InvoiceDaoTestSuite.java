package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        Item item1 = new Item(new BigDecimal(10), 1, new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(5), 5, new BigDecimal(5));
        Item item3 = new Item(new BigDecimal(1000), 3, new BigDecimal(1000));

        Invoice invoice = new Invoice("2019");

        Product product1 = new Product("Fruits");
        Product product2 = new Product("Vegetables");
        Product product3 = new Product("Dairy");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        int id = invoice.getId();


        invoiceDao.save(invoice);

        List<Invoice> invoiceList = invoiceDao.findByNumber("2019");
        List<Product> productList = productDao.findByName("Fruits");
        List<Item> itemList = itemDao.findByQuantity(1);
        Assert.assertEquals(1, invoiceList.size());
        Assert.assertEquals(1, productList.size());
        Assert.assertEquals(1, itemList.size());

//        CleanUp
        invoiceDao.deleteById(id);
        itemDao.deleteById(id);
        productDao.deleteById(id);
    }
}
