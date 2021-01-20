package com.lqx.incubator.lightning.service;

import com.lqx.incubator.lightning.entity.OnlineAppInfo;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @Author ultima
 * @Date 2021/1/20 20:51
 **/
public interface OnlineAppInfoService {

  /**
   * 获取线上app信息
   * @return
   */
  List<OnlineAppInfo> getOnlineAppInfo();
}
