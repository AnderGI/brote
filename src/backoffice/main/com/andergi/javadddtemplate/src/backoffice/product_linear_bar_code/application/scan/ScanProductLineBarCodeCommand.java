package com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.application.scan;

import com.andergi.javadddtemplate.src.shared.domain.command.Command;

public final class ScanProductLineBarCodeCommand extends Command {
    private final String productBarCode;

    public ScanProductLineBarCodeCommand(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public String barCode() {
        return this.productBarCode;
    }
}
