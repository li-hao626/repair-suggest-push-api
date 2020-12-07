package com.smec.repair.suggest.push.controller;

import com.smec.repair.suggest.push.service.ProspectSuggestService;
import com.smec.repair.suggest.push.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiHao
 */
@RestController
@RequestMapping("/v1")
@Api(tags = "修理建议")
public class ProspectSuggestController {
    @Autowired
    private ProspectSuggestService service;

    @GetMapping("/suggest")
    @ApiOperation(value = "修理建议查询")
    public R findSuggest(String assignee) {
        return service.findAllByAssignee(assignee);
    }
}
