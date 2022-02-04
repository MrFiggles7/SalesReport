package edu.wctc.sales.SalesInput;

import edu.wctc.sales.classes.Sale;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileInput implements SalesInput {

    private BufferedReader in;

    public FileInput(){

    }

    public List<Sale> Read(String path){

        List<Sale> saleList = new ArrayList();
        try(BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line;
            List<String> temp = new ArrayList<>();
            while((line = in.readLine()) != null){
                 temp = Arrays.asList(line.split(","));
                 Sale tempSale = new Sale();
                 tempSale.setCustomerName(temp.get(0));
                tempSale.setCountry(temp.get(1));
                tempSale.setAmount(Double.parseDouble(temp.get(2)));
                tempSale.setTax(Double.parseDouble(temp.get(3)));


                 saleList.add(tempSale);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return saleList;
    }
}