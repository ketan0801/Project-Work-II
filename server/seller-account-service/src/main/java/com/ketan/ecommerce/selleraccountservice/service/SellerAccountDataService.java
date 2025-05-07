package com.ketan.ecommerce.selleraccountservice.service;


import com.ketan.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import com.ketan.ecommerce.selleraccountservice.entity.sql.SellerInfo;

public interface SellerAccountDataService {

    public SellerInfo findSellerById(Integer sellerId);

    public void save();

    public void saveInMongo();

    public SellerBulkInfo findMongoAddressById();
}

