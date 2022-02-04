package edu.wctc.sales.SalesReport;

import edu.wctc.sales.classes.Sale;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SummarySalesReport implements SalesReport{
    @Override
    public void generateReport(List<Sale> saleList) {
        HashMap<String, Sale> saleMap = new HashMap<>();

        for(Sale sale : saleList){
            if(!saleMap.containsKey(sale.getCountry())){
                saleMap.put(sale.getCountry(), sale);
            }
            else{
                Sale temp = saleMap.get(sale.getCountry());
                temp.setAmount(temp.getAmount() + sale.getAmount());
                temp.setTax(temp.getTax() + sale.getTax());
                temp.setShipping(temp.getShipping() + sale.getShipping());
                saleMap.put(sale.getCountry(), temp);
            }
        }

        System.out.println("Summary Sales Report");
        System.out.println("Country\t\tAmount\t\tTax\t\tShipping");
        for(String country : saleMap.keySet()){
            System.out.println(
                    country + "\t\t"
                    + saleMap.get(country).getAmount() + "\t\t"
                    + saleMap.get(country).getTax() + "\t\t"
                    + saleMap.get(country).getShipping() + "\t\t"
            );
        }

    }
}
