package com.ozalp.portfolio.business.mappers;

import com.ozalp.portfolio.entities.BaseEntity;

public interface BaseMapper<T extends BaseEntity, Req, Res> {

    T toEntity(Req req);

    Res toResponse(T entity);
}
