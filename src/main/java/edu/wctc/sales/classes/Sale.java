package edu.wctc.sales.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Sale {

    private String customerName;
    private String country;
    private double amount;
    private double tax;
    private double shipping;

}
