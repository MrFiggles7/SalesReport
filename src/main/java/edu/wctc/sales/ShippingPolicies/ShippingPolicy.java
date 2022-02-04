package edu.wctc.sales.ShippingPolicies;

import edu.wctc.sales.classes.Sale;

public interface ShippingPolicy {

    void applyShipping(Sale sale);
}
