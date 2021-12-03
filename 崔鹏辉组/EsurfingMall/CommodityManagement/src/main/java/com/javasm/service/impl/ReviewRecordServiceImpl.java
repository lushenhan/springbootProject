package com.javasm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.entity.ReviewRecord;
import com.javasm.mapper.ReviewRecordMapper;
import com.javasm.service.IReviewRecordService;
import org.springframework.stereotype.Service;

@Service
public class ReviewRecordServiceImpl extends ServiceImpl<ReviewRecordMapper, ReviewRecord> implements IReviewRecordService {

}
