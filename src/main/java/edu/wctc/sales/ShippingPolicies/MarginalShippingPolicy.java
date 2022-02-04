package edu.wctc.sales.ShippingPolicies;

import edu.wctc.sales.classes.Sale;

public class MarginalShippingPolicy implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        if(sale.getAmount() > 50){
            sale.setShipping(0);
        }
        else{
            FlatRateShippingPolicy flatRateShippingPolicy = new FlatRateShippingPolicy();
            flatRateShippingPolicy.applyShipping(sale);
        }
    }
}
