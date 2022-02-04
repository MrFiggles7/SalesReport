package edu.wctc.sales;

import edu.wctc.sales.SalesInput.FileInput;
import edu.wctc.sales.SalesInput.SalesInput;
import edu.wctc.sales.SalesReport.DetailSalesReport;
import edu.wctc.sales.SalesReport.SalesReport;
import edu.wctc.sales.SalesReport.SummarySalesReport;
import edu.wctc.sales.ShippingPolicies.FlatRateShippingPolicy;
import edu.wctc.sales.ShippingPolicies.ShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.sales")
public class AppConfig {

    @Bean
    public SalesInput salesInput(){

        return new FileInput();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        return new FlatRateShippingPolicy();
    }

    @Bean
    public SalesReport salesReport(){
        return new SummarySalesReport();
//        return new DetailSalesReport();
    }
}
