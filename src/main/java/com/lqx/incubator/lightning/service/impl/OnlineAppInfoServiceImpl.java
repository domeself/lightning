package com.lqx.incubator.lightning.service.impl;

import com.lqx.incubator.lightning.entity.OnlineAppInfo;
import com.lqx.incubator.lightning.repository.OnlineAppInfoRepository;
import com.lqx.incubator.lightning.service.OnlineAppInfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ultima
 * @Date 2021/1/20 20:53
 **/
@Service
public class OnlineAppInfoServiceImpl implements OnlineAppInfoService {
  @Autowired
  private OnlineAppInfoRepository onlineAppInfoRepository;
  @Override
  public List<OnlineAppInfo> getOnlineAppInfo() {
    return onlineAppInfoRepository.findAll();
  }
}
