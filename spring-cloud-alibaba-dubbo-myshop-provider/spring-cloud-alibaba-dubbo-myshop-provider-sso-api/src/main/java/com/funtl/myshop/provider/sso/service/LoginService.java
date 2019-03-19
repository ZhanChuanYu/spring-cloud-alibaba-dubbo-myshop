package com.funtl.myshop.provider.sso.service;

import com.funtl.myshop.commons.domain.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sso")
public interface LoginService {
    @GetMapping("/login")
    TbUser login(@RequestParam(required = true) String username, @RequestParam(required = true) String password);
}
