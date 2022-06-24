package com.big.oh;

public class MPS {


    public String getConstituency(){
        return "Winning Constituency Name";
    }

    public String getDriver(){
        return "Driver Name";
    }

    public boolean exceedsSpendingLimit(Double amount){
        if(amount > 100000)
            return true;
        return false;
    }

}
