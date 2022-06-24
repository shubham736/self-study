package com.big.oh;

public class Ministers extends MPS {

    public boolean exceedsSpendingLimit(Double amount){
        if(amount > 1000000)
            return true;
        return false;
    }
}
