package com.smec.repair.suggest.push.dao;

import com.smec.repair.suggest.push.vo.ProspectSuggestVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author LiHao
 */
@Component
public interface ProspectSuggestDao {
    /**
     * 通过维保工工号查询勘察建议
     * @param assignee 维保工工号
     * @return 勘察建议
     * */
    List<ProspectSuggestVO> findAllByAssignee(String assignee);

}
