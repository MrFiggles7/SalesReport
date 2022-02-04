package edu.wctc.sales.ShippingPolicies;

import edu.wctc.sales.classes.Sale;

public class FreeShippingPolicy implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0.00);
    }
}
