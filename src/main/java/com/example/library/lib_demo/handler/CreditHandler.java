package com.example.library.lib_demo.handler;

import com.example.library.lib_demo.model.CreditRequest;
import com.example.library.lib_demo.model.CreditResponse;
import com.example.library.lib_demo.service.CreditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnBean(CreditService.class)
public class CreditHandler {

    private Logger logger = LoggerFactory.getLogger(CreditHandler.class);

    private final CreditService creditService;


    public CreditHandler(CreditService creditService) {
        this.creditService = creditService;
    }

    public CreditResponse credit(CreditRequest request) {
        logger.info("Handled credit request: {}", request);
        logger.info("Handled credit request V2: {}", request);
        return creditService.credit(request);
    }
}
