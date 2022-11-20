package com.manzanofp.mznmeta.service;

import com.manzanofp.mznmeta.model.Sale;
import com.manzanofp.mznmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findSales(){
        return saleRepository.findAll();
    }

}
