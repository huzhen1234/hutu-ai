package com.hutu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hutu.entity.po.Course;
import com.hutu.service.CourseService;
import com.hutu.mapper.CourseMapper;
import org.springframework.stereotype.Service;

/**
* @author huzhen
* @description 针对表【course(学科表)】的数据库操作Service实现
* @createDate 2025-06-18 22:16:24
*/
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course>
    implements CourseService{

}




