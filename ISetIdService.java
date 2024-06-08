package com.synpulse.synformation.service;

import com.synpulse.synformation.entity.SetId;

import java.util.List;

public interface ISetIdService {

    List<SetId> getSetIdList();

    int addSetId(SetId setid);
}
