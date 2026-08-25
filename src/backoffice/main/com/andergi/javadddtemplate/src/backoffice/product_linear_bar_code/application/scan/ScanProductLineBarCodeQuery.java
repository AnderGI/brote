package com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.application.scan;

import com.andergi.javadddtemplate.src.shared.domain.query.Query;

public final class ScanProductLineBarCodeQuery extends Query {
    private final String productBarCode;

    public ScanProductLineBarCodeQuery(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public String barCode() {
        return this.productBarCode;
    }
}
