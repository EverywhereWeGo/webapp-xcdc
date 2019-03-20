package com.bfd.webappxcdc.a_controller;

import com.bfd.webappxcdc.b_service.SearchInformationService;
import com.bfd.webappxcdc.utils.ServiceResult;
import com.bfd.webappxcdc.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 资产信息控制器层.
 *
 * @author wanghchong
 * @Date 2019/03/19 17:50
 */
@RestController
@RequestMapping(SearchInformationController.REQ_PATH)
@Api(value = "SearchInformationController", description = "信息检索")
public class SearchInformationController {
    public static final String REQ_PATH = "/search";
    @Autowired
    private SearchInformationService searchInformationService;

    @ApiOperation(value = "根据类型搜索信息", nickname = "getInfoByType")
    @RequestMapping(value = "/peopleinfo", method = RequestMethod.GET)
    public ServiceResult<List<SearchInformationVO>> getAssetsnum(
            @RequestParam(name = "type", required = false) String type,
            @RequestParam(name = "value", required = false) String value,
            @RequestParam(name = "page", required = false) int page) {
        return new ServiceResult<List<SearchInformationVO>>(searchInformationService.getInfo(type,value,page));
    }

    @ApiOperation(value = "查询档案信息_人员", nickname = "getArchivesPeopleInfo")
    @RequestMapping(value = "/archiespeopleinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesPeopleVO>> getArchivesPeopleInfo(
            @RequestParam(name = "id", required = false) String id){
        return new ServiceResult<List<ArchivesPeopleVO>>(searchInformationService.getArchivesPeopleInfo(id));
    }

    @ApiOperation(value = "查询档案信息_车辆", nickname = "getArchivesCarInfo")
    @RequestMapping(value = "/archiescarinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesCarVO>> getArchivesCarInfo(
            @RequestParam(name = "id", required = false) String id){
        return new ServiceResult<List<ArchivesCarVO>>(searchInformationService.getArchivesCarInfo(id));
    }

    @ApiOperation(value = "查询档案信息_案件", nickname = "getArchivesCaseInfo")
    @RequestMapping(value = "/archiescaseinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesCaseVO>> getArchivesCaseInfo(
            @RequestParam(name = "id", required = false) String id){
        return new ServiceResult<List<ArchivesCaseVO>>(searchInformationService.getArchivesCaseInfo(id));
    }

    @ApiOperation(value = "查询档案信息_关系", nickname = "getArchivesRelationInfo")
    @RequestMapping(value = "/archiesrelationinfo", method = RequestMethod.GET)
    public ServiceResult<List<ArchivesRelationVO>> getArchivesRelationInfo(
            @RequestParam(name = "id", required = false) String id){
        return new ServiceResult<List<ArchivesRelationVO>>(searchInformationService.getArchivesRelationInfo(id));
    }








}



