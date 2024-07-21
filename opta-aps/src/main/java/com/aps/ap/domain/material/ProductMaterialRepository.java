package com.aps.ap.domain.material;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityManager;
import java.util.Optional;

/**
 * @className: ProductMaterialRepository
 * @description: 产品物料数据仓库
 * @author: YY
 * @date: 2024/6/30
 **/
public interface ProductMaterialRepository extends CrudRepository<ProductMaterial, Long> {

}
