package com.aps.application;

import com.aps.domain.material.ProductMaterialRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

/**
 * ProductMaterialApplicationService
 * <p>
 * comments:
 *
 * @author YY
 * @version 1.0
 * @date 2024/7/16 10:59
 */
@Named
@Transactional
public class ProductMaterialApplicationService {

    @Inject
    private ProductMaterialRepository repository;

    public long getAll() {
        return repository.count();
    }


}
