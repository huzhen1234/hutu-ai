package com.hutu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hutu.entity.po.School;
import com.hutu.service.SchoolService;
import com.hutu.mapper.SchoolMapper;
import org.springframework.stereotype.Service;

/**
* @author huzhen
* @description 针对表【school(校区表)】的数据库操作Service实现
* @createDate 2025-06-18 22:16:24
*/
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School>
    implements SchoolService{

}




