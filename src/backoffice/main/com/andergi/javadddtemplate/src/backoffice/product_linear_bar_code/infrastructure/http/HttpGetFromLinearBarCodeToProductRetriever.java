package com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.infrastructure.http;

import com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.domain.FromLinearBarCodeToProductRetriever;
import com.andergi.javadddtemplate.src.shared.infrastructure.spring.annotations.Service;
import org.springframework.web.client.RestClient;

@Service
public final class HttpGetFromLinearBarCodeToProductRetriever implements FromLinearBarCodeToProductRetriever {

    private final RestClient client;

    public HttpGetFromLinearBarCodeToProductRetriever(final RestClient client) {
        this.client = client;
    }

    @Override
    public void retrieve(String barCode) {
        Object data = this.client.get().uri("https://world.openfoodfacts.net/api/v3/product/{barCode}?product_type=food&cc=es&lc=es&fields=code,product_name,categories_tags,ingredients_analysis_tags,ecoscore_grade,nutriments", barCode)
                .retrieve().body(String.class)
                ;
    }
}
