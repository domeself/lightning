package com.lqx.incubator.lightning.controller;

import com.lqx.incubator.lightning.entity.OnlineAppInfo;
import com.lqx.incubator.lightning.service.OnlineAppInfoService;
import com.lqx.incubator.lightning.web.Result;
import java.util.List;
import org.apache.juli.OneLineFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ultima
 * @Date 2021/1/20 20:49
 **/
@RestController
@RequestMapping("app")
public class AppController {

  @Autowired
  private OnlineAppInfoService onlineAppInfoService;
  @GetMapping("info")
  public Result<List<OnlineAppInfo>> getOnlineAppInfo(){
    List<OnlineAppInfo> onlineAppInfo = onlineAppInfoService.getOnlineAppInfo();
    return Result.success(onlineAppInfo);
  }

}
