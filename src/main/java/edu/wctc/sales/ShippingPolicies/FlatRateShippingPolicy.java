package edu.wctc.sales.ShippingPolicies;

import edu.wctc.sales.classes.Sale;

public class FlatRateShippingPolicy implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(7.25);
    }
}
