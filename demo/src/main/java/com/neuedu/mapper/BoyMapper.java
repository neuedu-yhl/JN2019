package com.neuedu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neuedu.pojo.Boys;

import java.util.List;

public interface BoyMapper extends BaseMapper<Boys> {

    List<Boys> selectList();

}
