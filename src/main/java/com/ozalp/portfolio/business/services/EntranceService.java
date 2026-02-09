package com.ozalp.portfolio.business.services;

import com.ozalp.portfolio.business.dtos.requests.CreateEntranceRequest;
import com.ozalp.portfolio.business.dtos.responses.EntranceResponse;
import com.ozalp.portfolio.entities.Entrance;

import java.util.List;

public interface EntranceService extends BaseService<CreateEntranceRequest, Entrance> {

    List<EntranceResponse> getEntrance();
}
