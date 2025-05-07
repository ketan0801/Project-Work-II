package com.ketan.ecommerce.selleraccountservice.dao.nosql;

import com.ketan.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SellerBulkInfoRepository extends MongoRepository<SellerBulkInfo, Integer> {
}
