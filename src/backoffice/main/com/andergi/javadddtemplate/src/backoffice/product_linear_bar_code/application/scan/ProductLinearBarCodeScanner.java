package com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.application.scan;

import com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.domain.FromLinearBarCodeToProductRetriever;
import com.andergi.javadddtemplate.src.shared.infrastructure.spring.annotations.Service;

@Service
public final class ProductLinearBarCodeScanner {
    private final FromLinearBarCodeToProductRetriever retriever;

    public ProductLinearBarCodeScanner(final FromLinearBarCodeToProductRetriever retriever) {
        this.retriever = retriever;
    }

    public final void scan(final ScanProductLineBarCodeQuery query) {
        this.retriever.retrieve(query.barCode());
    }
}
