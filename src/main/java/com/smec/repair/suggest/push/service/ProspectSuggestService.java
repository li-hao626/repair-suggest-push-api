package com.smec.repair.suggest.push.service;

import com.smec.mpaas.unicorn.comm.pojo.UserProfileThread;
import com.smec.repair.suggest.push.dao.ProspectSuggestDao;
import com.smec.repair.suggest.push.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LiHao
 */
@Service
public class ProspectSuggestService {
    @Autowired
    private ProspectSuggestDao dao;

    public R findAllByAssignee(String assignee) {
        String uid = UserProfileThread.getCurrentUser();
        return R.ok(dao.findAllByAssignee(assignee));
    }
}
