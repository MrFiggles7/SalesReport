package edu.wctc.sales.SalesReport;

import edu.wctc.sales.classes.Sale;

import java.util.List;

public interface SalesReport {

    public void generateReport(List<Sale> saleList);
}
