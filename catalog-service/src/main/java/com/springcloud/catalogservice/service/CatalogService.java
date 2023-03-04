package com.springcloud.catalogservice.service;

import com.springcloud.catalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
