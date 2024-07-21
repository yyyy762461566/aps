package com.aps.ap.application.material;

import com.aps.ap.domain.material.ProductMaterialRepository;

import javax.inject.Inject;
import javax.inject.Named;

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
public class ProductMaterialApplicationService {

    @Inject
    private ProductMaterialRepository repository;

    public long getAll() {
        return repository.count();
    }


}
