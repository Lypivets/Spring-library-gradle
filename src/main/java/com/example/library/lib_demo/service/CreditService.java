package com.example.library.lib_demo.service;

import com.example.library.lib_demo.model.CreditRequest;
import com.example.library.lib_demo.model.CreditResponse;

public interface CreditService {
    CreditResponse credit(CreditRequest credit);
}
