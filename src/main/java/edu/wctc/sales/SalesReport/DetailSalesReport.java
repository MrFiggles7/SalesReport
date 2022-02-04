package edu.wctc.sales.SalesReport;

import edu.wctc.sales.SalesInput.SalesInput;
import edu.wctc.sales.ShippingPolicies.ShippingPolicy;
import edu.wctc.sales.classes.Sale;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class DetailSalesReport implements SalesReport{



    public void generateReport(List<Sale> salesList){
        System.out.println("Sales Detail Report");
        System.out.println("Customer Name\t\tCountry\t\tAmount\t\tTax\t\tShipping");
        for(Sale sale : salesList){
            System.out.println(
                    sale.getCustomerName() + "\t\t"
                    + sale.getCountry() + "\t\t"
                    + sale.getAmount() + "\t\t"
                    + sale.getTax() + "\t\t"
                    + sale.getShipping()
            );
        }
    }
}
