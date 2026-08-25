package com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.application.scan;

import com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.domain.FromLinearBarCodeToProductRetriever;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

final class ProductLinearBarCodeScannerShould {

    @Test
    void scan_a_product_line_bar() {
        final FromLinearBarCodeToProductRetriever mock = Mockito.mock(FromLinearBarCodeToProductRetriever.class);
        final ProductLinearBarCodeScanner scanner = new ProductLinearBarCodeScanner(mock);
        final ScanProductLineBarCodeQuery query = new ScanProductLineBarCodeQuery("8480017226938");

        scanner.scan(query);

        verify(mock, times(1)).retrieve(query.barCode());

    }

}