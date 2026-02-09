package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.entities.BaseEntity;

public interface BaseService<Req, T extends BaseEntity> {

    void add(Req req);

    void delete(int id);

    void setShowable(int id, Boolean value);

    T findById(int id);
}
