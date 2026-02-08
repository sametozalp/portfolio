package com.ozalp.portfolio.business.services;

public interface BaseService<Req> {

    void add(Req req);

    void delete(int id);

    void setShowable(Boolean value);
}
