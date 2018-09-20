package com.tensquare.base.service;

import com.tensquare.base.dao.BaseDao;
import com.tensquare.base.pojo.Label;
import com.tensquare.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {
    @Autowired
    private BaseDao baseDao;
    @Autowired
    private IdWorker idWorker;

    /**
     * 增加一个标签
     * @param label
     */
    public void addLabel(Label label) {
        label.setId(idWorker.nextId()+"");
        baseDao.save(label);
    }

    /**
     * 查询所有的标签
     * @return
     */
    public List<Label> findAll() {
        return baseDao.findAll();
    }

    /**
     * 主键查找
     * @param labelId
     * @return
     */
    public Label findOne(String labelId) {
        return baseDao.findById(labelId).get();
    }

    /**
     * 修改标签
     * @param label
     */
    public void update(Label label) {
        baseDao.save(label);
    }

    /**
     * 根据对象删除
     * @param label
     */
    public void delete(Label label) {
        baseDao.delete(label);

    }

    /**
     * 主键删除
     * @param labelId
     */
    public void deleteById(String labelId) {
        baseDao.deleteById(labelId);
    }
}
