package edu.wctc.sales;

import edu.wctc.sales.SalesInput.SalesInput;
import edu.wctc.sales.SalesReport.DetailSalesReport;
import edu.wctc.sales.SalesReport.SalesReport;
import edu.wctc.sales.ShippingPolicies.ShippingPolicy;
import edu.wctc.sales.classes.Sale;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Sales {
    SalesInput salesInput;
    ShippingPolicy shippingPolicy;
    private List<Sale> salesList;
    private SalesReport salesReport;

    public Sales(SalesInput salesReader, ShippingPolicy shippingPolicy, SalesReport salesReport){
        this.shippingPolicy = shippingPolicy;
        this.salesInput = salesReader;
        this.salesReport = salesReport;
        salesList = new ArrayList<>(salesInput.Read("src/main/java/edu/wctc/sales/resources/sales.txt"));
        for(Sale sale : salesList){
            this.shippingPolicy.applyShipping(sale);
        }
    }


    public void generate(){
        salesReport.generateReport(salesList);
    }
}
