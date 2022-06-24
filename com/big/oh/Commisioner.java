package com.big.oh;

public class Commisioner {

    public String arrest(String personName, Double amount) {
        if (personName != null && personName.trim() != "") {
            switch (personName) {
                case "MPS":
                    MPS mps = new MPS();
                    if (mps.exceedsSpendingLimit(amount))
                        return personName;
                case "Ministers":
                    Ministers ministers = new Ministers();
                    if (ministers.exceedsSpendingLimit(amount)) {
                        PM pm = new PM();
                        if (pm.permissionToArrest("valid"))
                            return personName;
                        return "Don't have permission";
                    }
                case "PM":
                    return "Since person is PM so can't arrest";
            }
        }
        return "";
    }
}
